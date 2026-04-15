// 1. Basic example
/*
#include <Wire.h>
#include <BMI160Gen.h>
// #include "BMI160Gen.h"

#define SDA_PIN 42
#define SCL_PIN 2
const int bmi160_i2c_addr = 0x69;

BMI160GenClass bmi160;

void setup()
{
  Serial.begin(115200);
  pinMode(4, OUTPUT);
  digitalWrite(4, HIGH);
  pinMode(47, OUTPUT);    // Set EN pin for second stabilisator as output
  digitalWrite(47, HIGH); // Turn on the second stabilisator
  delay(1000);

  // Inicializace I2C
  Wire.begin(SDA_PIN, SCL_PIN);

  Serial.println("Start ini component ...");
  // Inicializace BMI160
  if (!bmi160.begin(BMI160GenClass::I2C_MODE, bmi160_i2c_addr))
  {
    Serial.println("BMI160 inicializace selhala!");
    while (1)
      ;
  }
  Serial.println("BMI160 inicializace úspěšná!");

  // Nastavení rozsahů
  bmi160.setAccelerometerRange(2); // Možnosti: 2, 4, 8, 16 G
  bmi160.setGyroRange(250);        // Možnosti: 125, 250, 500, 1000, 2000 dps
}

void loop()
{
  int ax, ay, az; // Akcelerometr
  int gx, gy, gz; // Gyroskop

  // Čtení hodnot akcelerometru a gyroskopu
  bmi160.readMotionSensor(ax, ay, az, gx, gy, gz);

  // Převod hodnot na g a dps
  float accelX = ax / 16384.0; // Pokud je rozsah ±2G
  float accelY = ay / 16384.0;
  float accelZ = az / 16384.0;

  float gyroX = gx / 131.0; // Pokud je rozsah ±250 dps
  float gyroY = gy / 131.0;
  float gyroZ = gz / 131.0;

  // Výpis hodnot do sériového monitoru
  Serial.print("Accel [g]: X=");
  Serial.print(accelX, 2);
  Serial.print(" Y=");
  Serial.print(accelY, 2);
  Serial.print(" Z=");
  Serial.print(accelZ, 2);

  Serial.print(" | Gyro [dps]: X=");
  Serial.print(gyroX, 2);
  Serial.print(" Y=");
  Serial.print(gyroY, 2);
  Serial.print(" Z=");
  Serial.println(gyroZ, 2);

  delay(100);
}
*/


// 2. Oled visualization Gyro

#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>
#include <BMI160Gen.h>
#include <Arduino.h>

#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64
#define OLED_ADDR 0x3C
#define SDA_PIN 42
#define SCL_PIN 2

#define CLK 8
#define DT 7
#define SW 6

int stepSize = 2.5; // krok změny jasu při otočení enkodéru

int currentStateCLK;
int lastStateCLK;
String currentDir = "";
unsigned long lastButtonPress = 0;
bool buttonPressed = false;

const int BMI160_ADDR = 0x69;
const int SCREEN_CENTER_X = SCREEN_WIDTH / 2;
const int SCREEN_CENTER_Y = SCREEN_HEIGHT / 2;

Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, -1);
BMI160GenClass bmi160;

// Pozice kuličky
float ballX = SCREEN_CENTER_X;
float ballY = SCREEN_CENTER_Y;

// Nastavení citlivosti a času
float sensitivity = 5.0; // čím vyšší, tím pomalejší pohyb
unsigned long prevTime = 0;

void setup()
{
  Serial.begin(115200);
  pinMode(4, OUTPUT);
  digitalWrite(4, HIGH);
  pinMode(47, OUTPUT);
  digitalWrite(47, HIGH);
  delay(1000);
  Wire.begin(SDA_PIN, SCL_PIN);
  // Enkodér
  pinMode(CLK, INPUT_PULLUP);
  pinMode(DT, INPUT_PULLUP);
  pinMode(SW, INPUT_PULLUP);
  lastStateCLK = digitalRead(CLK);

  if (!display.begin(SSD1306_SWITCHCAPVCC, OLED_ADDR))
  {
    Serial.println(F("SSD1306 allocation failed"));
    while (true)
      ;
  }

  display.clearDisplay();
  display.setTextColor(SSD1306_WHITE);
  display.setTextSize(1);
  display.setCursor(0, 0);
  display.println("Inicializace...");
  display.display();

  if (!bmi160.begin(BMI160GenClass::I2C_MODE, BMI160_ADDR))
  {
    Serial.println(F("BMI160 init failed"));
    display.println("BMI160 fail!");
    display.display();
    while (1)
      ;
  }

  bmi160.setGyroRange(250); // Nastavení rozsahu ±250°/s
  delay(1000);
  prevTime = millis();
}

void loop()
{

  currentStateCLK = digitalRead(CLK);
  if (currentStateCLK != lastStateCLK && currentStateCLK == HIGH)
  {
    if (digitalRead(DT) != currentStateCLK)
    {
      if (sensitivity > 1.0)
        sensitivity -= 5;
    }
    else
    {
      if (sensitivity < 50.0)
        sensitivity += 5;
    }
  }
  lastStateCLK = currentStateCLK;
  int ax, ay, az, gx, gy, gz;

  // Čtení dat ze senzoru
  bmi160.readMotionSensor(ax, ay, az, gx, gy, gz);

  // Časová delta (v sekundách)
  unsigned long currentTime = millis();
  float dt = (currentTime - prevTime) / 1000.0;
  prevTime = currentTime;

  // Převod na °/s
  float gyroX = gx / 131.0; // ROLL
  float gyroY = gy / 131.0; // PITCH

  // Výpočet změny pozice
  ballX += gyroX * dt * sensitivity;
  ballY += gyroY * dt * sensitivity;

  // Omezení na hranice displeje
  ballX = constrain(ballX, 0, SCREEN_WIDTH - 1);
  ballY = constrain(ballY, 0, SCREEN_HEIGHT - 1);

  // Výpis do sériového monitoru (pro ladění)
  Serial.print("GyroX: ");
  Serial.print(gyroX);
  Serial.print(" GyroY: ");
  Serial.print(gyroY);
  Serial.print(" X: ");
  Serial.print(ballX);
  Serial.print(" Y: ");
  Serial.println(ballY);
  Serial.print("Sensitivity: ");
  Serial.println(sensitivity);
  // Vykreslení
  display.clearDisplay();
  display.fillCircle((int)ballX, (int)ballY, 3, SSD1306_WHITE);
  display.display();

  delay(20); // Plynulé vykreslování
}


/*
// 3. Hra
#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>
#include <BMI160Gen.h>

#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64
#define OLED_ADDR 0x3C
#define SDA_PIN 42
#define SCL_PIN 2

const int BMI160_ADDR = 0x69;
const int BALL_RADIUS = 3;

Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, -1);
BMI160GenClass bmi160;

// Pozice a rychlost kuličky
float ballX = SCREEN_WIDTH / 2;
float ballY = SCREEN_HEIGHT / 2;
float velX = 0;
float velY = 0;

// Parametry
float accelFactor = 0.05; // zrychlení podle náklonu (větší = citlivější)
float friction = 0.98;    // tření zpomaluje kuličku
bool gameOver = false;

void setup()
{
  Serial.begin(115200);
  pinMode(4, OUTPUT);
  digitalWrite(4, HIGH);
  pinMode(47, OUTPUT);
  digitalWrite(47, HIGH);
  delay(1000);

  Wire.begin(SDA_PIN, SCL_PIN);

  if (!display.begin(SSD1306_SWITCHCAPVCC, OLED_ADDR))
  {
    Serial.println(F("SSD1306 allocation failed"));
    while (true)
      ;
  }

  display.clearDisplay();
  display.setTextColor(SSD1306_WHITE);
  display.setTextSize(1);
  display.setCursor(0, 0);
  display.println("Spoustim hru...");
  display.display();

  if (!bmi160.begin(BMI160GenClass::I2C_MODE, BMI160_ADDR))
  {
    Serial.println(F("BMI160 init failed"));
    while (1)
      ;
  }

  bmi160.setGyroRange(250);
  delay(1000);
}

void loop()
{
  if (gameOver)
  {
    display.clearDisplay();
    display.setCursor(30, 25);
    display.setTextSize(2);
    display.println("GAME");
    display.setCursor(30, 45);
    display.println("OVER");
    display.display();
    delay(100);
    return;
  }

  int ax, ay, az, gx, gy, gz;
  bmi160.readMotionSensor(ax, ay, az, gx, gy, gz);

  // Převod na °/s
  float gyroX = gx / 131.0;
  float gyroY = gy / 131.0;

  // Simulace zrychlení – čím větší náklon, tím větší zrychlení
  velX += gyroX * accelFactor;
  velY += gyroY * accelFactor;

  // Aplikace tření (snižuje rychlost postupně)
  velX *= friction;
  velY *= friction;

  // Aktualizace pozice
  ballX += velX;
  ballY += velY;

  // Kontrola kolize s okrajem displeje
  if (ballX < BALL_RADIUS || ballX > SCREEN_WIDTH - BALL_RADIUS ||
      ballY < BALL_RADIUS || ballY > SCREEN_HEIGHT - BALL_RADIUS)
  {
    gameOver = true;
  }

  // Vykreslení
  display.clearDisplay();
  display.fillCircle((int)ballX, (int)ballY, BALL_RADIUS, SSD1306_WHITE);
  display.display();

  delay(20);
}
*/

/*
// 4. Send data to Python by serial

#include <Wire.h>
#include <BMI160Gen.h>

#define SDA_PIN 42
#define SCL_PIN 2
const int bmi160_i2c_addr = 0x69;

BMI160GenClass bmi160;

void setup()
{
  Serial.begin(115200);
  pinMode(4, OUTPUT);
  digitalWrite(4, HIGH);
  pinMode(47, OUTPUT);
  digitalWrite(47, HIGH);
  delay(1000);

  Wire.begin(SDA_PIN, SCL_PIN);

  Serial.println("Start ini component ...");

  if (!bmi160.begin(BMI160GenClass::I2C_MODE, bmi160_i2c_addr))
  {
    Serial.println("BMI160 inicializace selhala!");
    while (1)
      ;
  }
  Serial.println("BMI160 inicializace úspěšná!");

  bmi160.setAccelerometerRange(2);
  bmi160.setGyroRange(250);
}

void loop()
{
  int gx, gy, gz;
  int ax, ay, az; // Akcelerometr

  bmi160.readMotionSensor(ax, ay, az, gx, gy, gz);

  float gyroX = gx / 131.0;
  float gyroY = gy / 131.0;
  float gyroZ = gz / 131.0;

  Serial.printf(";%.2f,%.2f,%.2f;\n", gyroX, gyroY, gyroZ);

  delay(50); // Krátká prodleva pro plynulý přenos
}
*/