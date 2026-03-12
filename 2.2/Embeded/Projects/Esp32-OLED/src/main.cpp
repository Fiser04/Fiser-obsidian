
#include <Arduino.h>
#include <SPI.h>
#include <Wire.h>
#include <Adafruit_GFX.h> // https://github.com/adafruit/Adafruit-GFX-Library
// #include <Adafruit_SH110X.h> // https://github.com/adafruit/Adafruit_SH110X
#include <Adafruit_SSD1306.h>
#include <Adafruit_Sensor.h>
#include <Adafruit_BME280.h>

#define SENSOR_SUPPLY 47
#define i2c_Address 0x3c
#define USUP_POWER_PIN 2 // uSUP power pin
#define DELAYTIME 1000
#define SEALEVELPRESSURE_HPA (1013.25)
#define CORRECT_TEMP (0.40)

Adafruit_SSD1306 display(128, 64, &Wire, -1); // Create an instance of the SSD1306 display with width 128, height 64, using I2C (Wire) and no reset pin
Adafruit_BME280 bme;                          // Create an instance of the BME280 sensor
void setup()
{
  Serial.begin(115200);
  pinMode(4, OUTPUT);
  digitalWrite(4, HIGH);
  pinMode(47, OUTPUT);    // Set EN pin for second stabilisator as output
  digitalWrite(47, HIGH); // Turn on the second stabilisator
  delay(1000);
  while (!Serial)
    ; // time to get serial running

  pinMode(USUP_POWER_PIN, OUTPUT);    // Set display power pin as output
  digitalWrite(USUP_POWER_PIN, HIGH); // Turn on the display
  pinMode(SENSOR_SUPPLY, OUTPUT);
  digitalWrite(SENSOR_SUPPLY, HIGH);
  Wire.begin(42, 2); // Set dedicated I2C pins 42 - SDA, 2 - SCL for ESP32-S3-DEVKit
  bme.begin(0x77);   // 0x77 OR 0x76 for left pad on board
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
  display.setTextSize(1);
}

// Základní příklad zobrazení textu na displeji SSD1306
void loop()
{
  // put your main code here, to run repeatedly:
  // display.setCursor(0, 0);
  // display.println("Teplota: " + String(bme.readTemperature() - CORRECT_TEMP) + "C");
  // display.println("Tlak: " + String(bme.readPressure() / 100.0F) + "hPa");
  // display.println("Vlhkost: " + String(bme.readHumidity()) + "%");
  // display.println("Nadmorska vyska: " + String(bme.readAltitude(SEALEVELPRESSURE_HPA)) + "m");
  int position = 0;

  String text = "Ahoj svete! Toto je posouvající se text na OLED displeji. ";

  while (position > -128) // Posuneme text o délku textu v pixelech (6 pixelů na znak)
  {
    display.clearDisplay();
    display.setCursor(0, 0);

    display.print(text.substring(-position, -position + 20)); // Zobrazí pouze prvních 20 znaků textu
    display.display();
    position -= 1; // Posun textu o 6 pixelů doleva
    delay(140);    // Krátká prodleva pro plynulý posun
  }
}
