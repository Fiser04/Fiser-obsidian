#include <Adafruit_Sensor.h>
// #include <Adafruit_BMP280.h>
#include <Adafruit_BME280.h>

#define SEALEVELPRESSURE_HPA (1013.25)
#define CORRECT_TEMP (0.40)

String temp;
String hum;
String press;
String alt;

// BME NENI BMP !!!!!!!!!!!!!!!

// Adafruit_BMP280 bme;  // I2C
Adafruit_BME280 bme; // I2C

void setup()
{
  Serial.begin(115200);
  pinMode(4, OUTPUT);
  digitalWrite(4, HIGH);
  pinMode(47, OUTPUT);    // Set EN pin for second stabilisator as output
  digitalWrite(47, HIGH); // Turn on the second stabilisator
  delay(1000);
  Wire.begin(42, 2); // Set dedicated I2C pins 42 - SDA, 2 - SCL for ESP32-S3-DEVKit
  bme.begin(0x77);   // 0x77 OR 0x76 for left pad on board
}

void loop()
{

  temp = String(bme.readTemperature() - CORRECT_TEMP);
  hum = String(bme.readHumidity());
  press = String(bme.readPressure() / 100.0F);
  alt = String(bme.readAltitude(SEALEVELPRESSURE_HPA));
  static int count = -5;
  if (count % 10 == 0)
  {
    // Serial.println("Temperature\tHumidity\tPressure\tAltitude");
    Serial.println("\n| Temperature |  Humidity  |  Pressure  |  Altitude  |");
  }
  // Serial.println(temp + '\t' + '\t' + hum + '\t' + '\t' + press + '\t' + '\t' + alt);
  // Serial.printf("  %6.2f         %6.3f         %7.2f         %7.2f   \n", temp.toFloat(), hum.toFloat(), press.toFloat(), alt.toFloat());
  Serial.printf("|   %6.2f    |   %6.2f   |  %7.2f   |  %7.2f   |\n", temp.toFloat(), hum.toFloat(), press.toFloat(), alt.toFloat());
  count++;
  delay(5000);
}
