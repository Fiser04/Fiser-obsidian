#include <Arduino.h>
#include <Wire.h>
#include <Adafruit_SSD1306.h>
#include <Adafruit_GFX.h>
#include <BMI160Gen.h>
#include "Adafruit_VL53L0X.h"
#include <math.h>

// ============ PIN DEFINITIONS ============
#define ENCODER_CLK 8  // Encoder clock pin
#define ENCODER_DT 18  // Encoder data pin
#define ENCODER_BTN 17 // Encoder button pin
#define LED_BLUE 15    // Blue LED pin (PWM)
#define LED_RED 16     // Red LED pin (PWM)
// #define BMI160_INT    0   // BMI160 interrupt pin (optional)

// ============ I2C ADDRESSES ============
#define DISPLAY_ADDRESS 0x3C
#define BMI160_ADDRESS 0x69 // Try 0x69 if 0x68 fails
#define VL53L0X_ADDRESS 0x29

// ============ CONFIGURATION ============
#define SENSOR_OFFSET_MM 0 // Offset from distance sensor to top of model (mm)
#define DISPLAY_WIDTH 128
#define DISPLAY_HEIGHT 64
#define I2C_SDA 42
#define I2C_SCL 2

// ============ LED BRIGHTNESS LEVELS ============
#define LED_ZERO 255  // Both LEDs when difference = 0
#define LED_SMALL 200 // When difference < 20mm
#define LED_LARGE 100 // When difference >= 20mm

// ============ DISPLAY TIMEOUT ============
#define DISPLAY_TIMEOUT_MS 2000 // Auto-switch to display mode after 2 seconds

// ============ ENUMERATIONS ============
enum SystemMode
{
  MODE_DISPLAY,  // Normal display mode (graph + distance)
  MODE_MENU,     // Menu mode
  MODE_DISTANCE, // Set target distance
  MODE_CALIBRATE // Calibrate gyro zero
};

// ============ GLOBAL VARIABLES ============
Adafruit_SSD1306 display(DISPLAY_WIDTH, DISPLAY_HEIGHT, &Wire, -1);
Adafruit_VL53L0X vl53 = Adafruit_VL53L0X();
BMI160GenClass bmi160;

// Sensor data
float gyroX = 0.0f;
float gyroY = 0.0f;
float gyroZ = 0.0f;
int accelX, accelY, accelZ;
int gyroXRaw, gyroYRaw, gyroZRaw;

// Integrated angles (from gyro integration)
float currentAngleX = 0.0f;
float currentAngleY = 0.0f;
uint32_t lastReadTime = 0;

uint16_t distanceMM = 0;
uint16_t targetDistanceMM = 100;

// Calibration offset for gyro
float gyroCalibrationOffsetX = 0.0f;
float gyroCalibrationOffsetY = 0.0f;

// System state
SystemMode currentMode = MODE_DISPLAY;
uint32_t lastEncoderActivityTime = 0;
int32_t encoderPosition = 0;
int32_t menuSelection = 0;  // 0=Distance, 1=Calibrate
bool lastEncoderButtonState = HIGH;
bool lastEncoderCLKState = HIGH;

// ============ FUNCTION DECLARATIONS ============
void initDisplay();
void initSensors();
void readSensors();
void updateMode();
void drawDisplayMode();
void drawMenuMode();
void drawDistanceMode();
void drawCalibrateMode();
void drawWaterLevel(float tiltAngle);
void updateLEDs(int16_t distanceDifference);
void handleEncoder();
void displayMessage(const char *title, const char *message);

// ============ SETUP ============
void setup()
{

  Serial.begin(115200);
  delay(100);
  pinMode(47, OUTPUT);    // Set EN pin for second stabilisator as output //poustim napeti
  digitalWrite(47, HIGH); // Turn on the second stabilisator //poustim napeti
  Serial.println("\n\n=== Water Level Device Starting ===");

  // Initialize I2C
  Wire.begin(I2C_SDA, I2C_SCL);
  delay(100);
  // Initialize pins
  pinMode(ENCODER_CLK, INPUT_PULLUP);
  pinMode(ENCODER_DT, INPUT_PULLUP);
  pinMode(ENCODER_BTN, INPUT_PULLUP);
  pinMode(LED_BLUE, OUTPUT);
  pinMode(LED_RED, OUTPUT);

  // Turn off LEDs initially
  digitalWrite(LED_BLUE, LOW);
  digitalWrite(LED_RED, LOW);

  // Initialize display
  initDisplay();

  // Initialize sensors
  initSensors();

  Serial.println("=== Setup Complete ===\n");
}

// ============ LOOP ============
void loop()
{
  readSensors();
  handleEncoder();
  updateMode();

  delay(50); // 20 Hz update rate
}

// ============ FUNCTION IMPLEMENTATIONS ============

void initDisplay()
{
  if (!display.begin(SSD1306_SWITCHCAPVCC, DISPLAY_ADDRESS))
  {
    Serial.println("ERROR: SSD1306 not found!");
    while (1)
      ;
  }

  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);
  display.clearDisplay();
  display.setCursor(0, 0);
  display.println("Water Level");
  display.println("Initializing...");
  display.display();
}

void initSensors()
{
  // Initialize BMI160 Gyroscope
  Serial.print("Initializing BMI160... ");
  if (!bmi160.begin(BMI160GenClass::I2C_MODE, BMI160_ADDRESS))
  {
    Serial.println("FAILED");
    displayMessage("ERROR", "BMI160 Init Failed");
    while (1)
      ;
  }
  Serial.println("OK");
  bmi160.setGyroRange(250); // 250 DPS
  delay(100);

  // Initialize VL53L0X (Distance sensor)
  Serial.print("Initializing VL53L0X... ");
  if (!vl53.begin(VL53L0X_ADDRESS, false, &Wire))
  {
    Serial.println("FAILED");
    displayMessage("ERROR", "VL53L0X Init Failed");
    while (1)
      ;
  }
  Serial.println("OK");

  Serial.println("All sensors initialized successfully!");
}

void readSensors()
{
  // Read BMI160 (accelerometer and gyro)
  bmi160.readMotionSensor(accelX, accelY, accelZ, gyroXRaw, gyroYRaw, gyroZRaw);

  // Convert raw gyro values to degrees/sec (LSB: 131 LSB/°/s for 250 DPS)
  gyroX = (gyroXRaw / 131.0f) - gyroCalibrationOffsetX;
  gyroY = (gyroYRaw / 131.0f) - gyroCalibrationOffsetY;
  gyroZ = (gyroZRaw / 131.0f);

  // Integrate gyro to get angles (only in display mode)
  if (currentMode == MODE_DISPLAY) {
    uint32_t currentTime = millis();
    if (lastReadTime == 0) lastReadTime = currentTime;
    float dt = (currentTime - lastReadTime) / 1000.0f;
    lastReadTime = currentTime;
    
    if (dt > 0 && dt < 0.1f) {  // Valid time delta
      currentAngleX += gyroX * dt;
      currentAngleY += gyroY * dt;
    }
  }

  // Read VL53L0X distance
  distanceMM = vl53.readRange();
  if (vl53.timeoutOccurred())
  {
    distanceMM = 0;
  }
}

void handleEncoder()
{
  // Read encoder button (with debounce)
  bool currentButtonState = digitalRead(ENCODER_BTN);
  if (currentButtonState == LOW && lastEncoderButtonState == HIGH)
  {
    delay(20); // Debounce
    if (digitalRead(ENCODER_BTN) == LOW)
    {
      // Button pressed
      if (currentMode == MODE_DISPLAY)
      {
        currentMode = MODE_MENU;
        menuSelection = 0;  // Reset menu selection
        encoderPosition = 0;
        Serial.println("Button pressed: Entering menu");
      }
      else if (currentMode == MODE_MENU)
      {
        // Select from menu
        if (menuSelection == 0) {
          currentMode = MODE_DISTANCE;
          encoderPosition = 0;
          Serial.println("Menu: Set Distance selected");
        } else if (menuSelection == 1) {
          currentMode = MODE_CALIBRATE;
          encoderPosition = 0;
          Serial.println("Menu: Calibrate selected");
        } else {
          // menuSelection == 2: Exit
          currentMode = MODE_DISPLAY;
          encoderPosition = 0;
          lastReadTime = 0;  // Reset time for gyro integration
          Serial.println("Menu: Exit to Display");
        }
      }
      else if (currentMode == MODE_DISTANCE)
      {
        // Save distance and go back to menu
        targetDistanceMM = targetDistanceMM + (encoderPosition * 5);
        if (targetDistanceMM < 10) targetDistanceMM = 10;
        if (targetDistanceMM > 2000) targetDistanceMM = 2000;
        
        encoderPosition = 0;
        currentMode = MODE_MENU;
        Serial.print("Button pressed: Target distance set to ");
        Serial.println(targetDistanceMM);
      }
      else if (currentMode == MODE_CALIBRATE)
      {
        // Calibration complete, go back to menu
        gyroCalibrationOffsetX = gyroXRaw / 131.0f;
        gyroCalibrationOffsetY = gyroYRaw / 131.0f;
        currentAngleX = 0.0f;
        currentAngleY = 0.0f;
        
        Serial.print("Button pressed: Gyro calibrated. Offsets - X: ");
        Serial.print(gyroCalibrationOffsetX);
        Serial.print(", Y: ");
        Serial.println(gyroCalibrationOffsetY);
        
        encoderPosition = 0;
        currentMode = MODE_MENU;
      }
      lastEncoderActivityTime = millis();
    }
  }
  lastEncoderButtonState = currentButtonState;

  // Read encoder rotation - detect CLK change (simpler approach)
  bool currentCLKState = digitalRead(ENCODER_CLK);
  if (currentCLKState != lastEncoderCLKState)
  {
    delay(2);  // Debounce
    currentCLKState = digitalRead(ENCODER_CLK);  // Re-read
    
    if (currentCLKState != lastEncoderCLKState)
    {
      bool dtState = digitalRead(ENCODER_DT);

      if (dtState != currentCLKState)
      {
        encoderPosition++;
        Serial.println("Encoder: CW +1");
      }
      else
      {
        encoderPosition--;
        Serial.println("Encoder: CCW -1");
      }
      lastEncoderActivityTime = millis();
    }
  }
  lastEncoderCLKState = currentCLKState;
}

void updateMode()
{
  // Auto-switch to display mode after timeout in menu
  if ((currentMode == MODE_DISTANCE || currentMode == MODE_CALIBRATE || currentMode == MODE_MENU) &&
      (millis() - lastEncoderActivityTime > DISPLAY_TIMEOUT_MS))
  {
    currentMode = MODE_DISPLAY;
    lastReadTime = 0;  // Reset time for gyro integration
  }

  // Update display based on mode
  switch (currentMode)
  {
  case MODE_DISPLAY:
    drawDisplayMode();
    break;
  case MODE_MENU:
    drawMenuMode();
    break;
  case MODE_DISTANCE:
    drawDistanceMode();
    break;
  case MODE_CALIBRATE:
    drawCalibrateMode();
    break;
  }
}

void drawDisplayMode()
{
  int16_t distanceDiff = distanceMM - targetDistanceMM;

  // Calculate tilt angle from gyro (using Y axis - device tilted on side)
  float tiltAngle = currentAngleY;

  // Update LEDs based on distance difference
  updateLEDs(distanceDiff);

  display.clearDisplay();
  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);

  // Draw water level graph
  drawWaterLevel(tiltAngle);

  // Draw current state info (bottom right, smaller)
  display.setCursor(66, 0);
  display.println("Now");
  display.setCursor(66, 8);
  display.print(distanceMM);
  display.println("mm");

  display.setCursor(66, 18);
  display.println("Set");
  display.setCursor(66, 26);
  display.print(targetDistanceMM);
  display.println("mm");

  // Draw difference indicator (compact)
  display.setCursor(66, 36);
  display.println("Diff");
  display.setCursor(66, 44);
  if (distanceDiff > 0)
  {
    display.print("+");
  }
  display.print(distanceDiff);
  display.println("mm");

  display.display();
}

void drawMenuMode()
{
  // Update menu selection based on encoder (3 options: 0=Distance, 1=Calibrate, 2=Exit)
  menuSelection = (menuSelection + encoderPosition) % 3;
  if (menuSelection < 0) menuSelection += 3;
  encoderPosition = 0;  // Reset for next use
  lastEncoderActivityTime = millis();

  display.clearDisplay();
  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);

  display.setCursor(0, 0);
  display.println("== MENU ==");
  display.println("");

  // Option 1: Distance
  if (menuSelection == 0) {
    display.println("> Set Height");
  } else {
    display.println("  Set Height");
  }

  // Option 2: Calibrate
  if (menuSelection == 1) {
    display.println("> Calibrate Zero");
  } else {
    display.println("  Calibrate Zero");
  }

  // Option 3: Exit
  if (menuSelection == 2) {
    display.println("> Back to Display");
  } else {
    display.println("  Back to Display");
  }

  display.println("");
  display.println("Press to select");

  display.display();
}

void drawDistanceMode()
{
  // Calculate preview value
  int previewTarget = targetDistanceMM + (encoderPosition * 5);
  if (previewTarget < 10) previewTarget = 10;
  if (previewTarget > 2000) previewTarget = 2000;

  display.clearDisplay();
  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);

  display.setCursor(0, 0);
  display.println("== SET HEIGHT ==");
  display.println("");

  display.setTextSize(2);
  display.setCursor(20, 20);
  display.println(previewTarget);
  display.print("mm");

  display.setTextSize(1);
  display.setCursor(0, 50);
  display.println("Turn: change");
  display.println("Press: confirm");

  lastEncoderActivityTime = millis();
  display.display();
}

void drawCalibrateMode()
{
  display.clearDisplay();
  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);

  display.setCursor(0, 0);
  display.println("== CALIBRATE ==");
  display.println("");
  display.println("Place level on");
  display.println("flat surface.");
  display.println("");
  display.println("Angle: ");
  display.print((int)currentAngleY);
  display.println("*");
  display.println("");
  display.println("Press to set zero");

  lastEncoderActivityTime = millis();
  display.display();
}

void drawWaterLevel(float tiltAngle)
{
  int centerX = 32;
  int centerY = 24;
  int lineLength = 50;

  // Convert angle to radians
  float rad = tiltAngle * PI / 180.0f;

  // Calculate line endpoints
  int x1 = centerX - (lineLength / 2.0f) * cos(rad);
  int y1 = centerY + (lineLength / 2.0f) * sin(rad);
  int x2 = centerX + (lineLength / 2.0f) * cos(rad);
  int y2 = centerY - (lineLength / 2.0f) * sin(rad);

  // Draw water level line
  display.drawLine(x1, y1, x2, y2, SSD1306_WHITE);

  // Draw bubble (center point)
  display.drawCircle(centerX, centerY, 3, SSD1306_WHITE);
  display.fillCircle(centerX, centerY, 1, SSD1306_WHITE);

  // Draw reference circle around bubble
  display.drawCircle(centerX, centerY, 6, SSD1306_WHITE);
}

void updateLEDs(int16_t distanceDifference)
{
  uint8_t blueBrightness = 0;
  uint8_t redBrightness = 0;

  if (distanceDifference == 0)
  {
    // Perfect height - both LEDs on max
    blueBrightness = LED_ZERO;
    redBrightness = LED_ZERO;
  }
  else if (distanceDifference > 0)
  {
    // Too high - blue LED
    if (distanceDifference >= 20)
    {
      blueBrightness = LED_LARGE;
    }
    else
    {
      blueBrightness = LED_SMALL;
    }
  }
  else
  {
    // Too low (distanceDifference < 0) - red LED
    if (distanceDifference <= -20)
    {
      redBrightness = LED_LARGE;
    }
    else
    {
      redBrightness = LED_SMALL;
    }
  }

  analogWrite(LED_BLUE, blueBrightness);
  analogWrite(LED_RED, redBrightness);
}

void displayMessage(const char *title, const char *message)
{
  display.clearDisplay();
  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);
  display.setCursor(0, 0);
  display.println(title);
  display.println("");
  display.println(message);
  display.display();
}