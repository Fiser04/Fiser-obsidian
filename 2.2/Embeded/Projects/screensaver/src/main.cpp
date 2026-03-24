#include <Arduino.h>
#include <Arduino.h>
#include <SPI.h>
#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

Adafruit_SSD1306 display(128, 64, &Wire, -1);

#define SENSOR_SUPPLY 47
#define i2c_Address 0x3c
#define USUP_POWER_PIN 2 // uSUP power pin

int positionX = 64;
int positionY = 32;
int speedX = 1;
int speedY = 1;
int circleSize = 4;

void setup()
{
  Serial.begin(115200);
  pinMode(4, OUTPUT);
  digitalWrite(4, HIGH);
  pinMode(47, OUTPUT);    // Set EN pin for second stabilisator as output
  digitalWrite(47, HIGH); // Turn on the second stabilisator
  delay(1000);
  while (!Serial)
    ;                                 // time to get serial running
  pinMode(USUP_POWER_PIN, OUTPUT);    // Set display power pin as output
  digitalWrite(USUP_POWER_PIN, HIGH); // Turn on the display
  pinMode(SENSOR_SUPPLY, OUTPUT);
  digitalWrite(SENSOR_SUPPLY, HIGH);
  Wire.begin(42, 2); // Set dedicated I2C pins 42 - SDA, 2 - SCL for ESP32-S3-DEVKit

  Serial.println(F("SSD1306 initialization ...."));

  // SSD1306_SWITCHCAPVCC = generate display voltage from 3.3V internally
  if (!display.begin(SSD1306_SWITCHCAPVCC, i2c_Address))
  {
    Serial.println(F("SSD1306 allocation failed"));
    for (;;)
      ; // Don't proceed, loop forever
  }
  Serial.println(F("SSD1306 allocation OK"));
  display.display();
  delay(2000); // Pause for 2 seconds

  display.clearDisplay();
  display.setTextColor(SSD1306_WHITE);
}

void loop()
{
  display.clearDisplay();
  display.fillCircle(positionX, positionY, circleSize, SSD1306_WHITE);
  display.display();

  positionX += speedX;
  positionY += speedY;

  if (positionX <= circleSize || positionX >= (128 - circleSize))
    speedX = -speedX;
  if (positionY <= circleSize || positionY >= (64 - circleSize))
    speedY = -speedY;

  delay(10);
}
