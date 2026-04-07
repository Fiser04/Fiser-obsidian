#include <Arduino.h>
#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SENSOR_SUPPLY 47
#define USUP_POWER_PIN 2

#define OLED_ADDR 0x3C
#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, -1);

#define CLK 8
#define DT 7
#define SW 6

#define PWM_CHANNEL 0
#define PWM_FREQ 5000
#define LED_BLUE_PIN 16
#define LED_RED_PIN 17
#define PWM_RESOLUTION 8

// ---------------------------

int brightnessBlue = 128; // počáteční jas LED (50 %)
int brightnessRed = 128;  // počáteční jas LED (50 %)
int stepSize = 5;         // krok změny jasu při otočení enkodéru

int currentStateCLK;
int lastStateCLK;
String currentDir = "";
unsigned long lastButtonPress = 0;
bool buttonPressed = false;
bool adjustingBlue = true; // true = nastavujeme modrou, false = nastavujeme červenou

void updateLedBrightness()
{
  brightnessBlue = constrain(brightnessBlue, 0, 255);
  brightnessRed = constrain(brightnessRed, 0, 255);
  ledcWrite(PWM_CHANNEL, brightnessBlue);
  ledcWrite(PWM_CHANNEL + 1, brightnessRed);

  Serial.print("Brightness Blue: ");
  Serial.print(brightnessBlue);
  Serial.print(" / 255  (");
  Serial.print((brightnessBlue * 100) / 255);
  Serial.println("%)");

  Serial.print("Brightness Red: ");
  Serial.print(brightnessRed);
  Serial.print(" / 255  (");
  Serial.print((brightnessRed * 100) / 255);
  Serial.println("%)");
}

void updateDisplay()
{
  display.clearDisplay();
  display.setTextSize(2);
  display.setCursor(0, 0);
  display.print("Blue: ");
  display.println(brightnessBlue);
  display.print("Red: ");
  display.println(brightnessRed);
  display.display();
}

void setup()
{
  Serial.begin(115200);
  while (!Serial)
    ;

  pinMode(USUP_POWER_PIN, OUTPUT);
  digitalWrite(USUP_POWER_PIN, HIGH);

  pinMode(SENSOR_SUPPLY, OUTPUT);
  digitalWrite(SENSOR_SUPPLY, HIGH);

  Wire.begin(42, 2); // I2C piny ESP32-S3

  // Enkodér
  pinMode(CLK, INPUT_PULLUP);
  pinMode(DT, INPUT_PULLUP);
  pinMode(SW, INPUT_PULLUP);

  // PWM pro LED
  ledcSetup(PWM_CHANNEL, PWM_FREQ, PWM_RESOLUTION);
  ledcAttachPin(LED_BLUE_PIN, PWM_CHANNEL);
  ledcSetup(PWM_CHANNEL + 1, PWM_FREQ, PWM_RESOLUTION);
  ledcAttachPin(LED_RED_PIN, PWM_CHANNEL + 1);

  lastStateCLK = digitalRead(CLK);

  updateLedBrightness();

  if (!display.begin(SSD1306_SWITCHCAPVCC, OLED_ADDR))
  {
    Serial.println(F("SSD1306 allocation failed"));
    while (1)
      ;
  }

  display.clearDisplay();
  display.setTextColor(SSD1306_WHITE);
  display.setTextSize(2); // Velké písmo
  display.setCursor(0, 0);
  display.println("Ready");
  display.display();
}

void loop()
{
  currentStateCLK = digitalRead(CLK);

  // Detekce otočení
  if (currentStateCLK != lastStateCLK && currentStateCLK == 1)
  {
    if (digitalRead(DT) != currentStateCLK)
    {
      if (adjustingBlue && brightnessBlue > 0)
      {
        if (brightnessBlue <= stepSize)
          brightnessBlue = 0;
        else
        {
          brightnessBlue -= stepSize;
        }
      }
      else if (!adjustingBlue && brightnessRed > 0)
      {
        if (brightnessRed <= stepSize)
          brightnessRed = 0;
        else
        {
          brightnessRed -= stepSize;
        }
      }
    }
    else
    {
      if (adjustingBlue && brightnessBlue < 255)
        brightnessBlue += stepSize;
      else if (!adjustingBlue && brightnessRed < 255)
        brightnessRed += stepSize;
    }
    updateDisplay();
  }

  brightnessBlue = constrain(brightnessBlue, 0, 255);
  brightnessRed = constrain(brightnessRed, 0, 255);

  ledcWrite(PWM_CHANNEL, brightnessBlue);
  ledcWrite(PWM_CHANNEL + 1, brightnessRed);
  lastStateCLK = currentStateCLK;
  // Detekce stisku tlačítka
  if (digitalRead(SW) == LOW && !buttonPressed && millis() - lastButtonPress > 50)
  {
    buttonPressed = true;
    lastButtonPress = millis();
    adjustingBlue = !adjustingBlue; // Přepni mezi modrou a červenou
  }
  if (digitalRead(SW) == HIGH)
  {
    buttonPressed = false;
  }

  delay(1);
}