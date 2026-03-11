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
  // Serial.println("BME280 sensor initialized successfully!");
}

void loop()
{
  temp = String(bme.readTemperature() - CORRECT_TEMP);
  hum = String(bme.readHumidity());
  press = String(bme.readPressure() / 100.0F);
  alt = String(bme.readAltitude(SEALEVELPRESSURE_HPA));
  static int count = -5;
  if (count == 9 || count == 0)
  {
    count = 0;
    for (int i = 0; i < 20; i++)
    {
      Serial.println();
    }
    Serial.println("\n| Id | Temperature |  Humidity  |  Pressure  |  Altitude  |");
    Serial.println("|----|-------------|------------|------------|------------|");
  }

  if (count >= 0)
  {
    Serial.printf("| %02d |   %6.2f    |   %6.2f   |  %7.2f   |  %7.2f   |\n", count + 1, temp.toFloat(), hum.toFloat(), press.toFloat(), alt.toFloat());
  }
  count++;

  // V2
  //  for (int i = 0; i < 20; i++)
  //    Serial.println();

  // Serial.println(F("╔══════════════════════╦════════════════════╗"));

  // Serial.print(F("║  Temperature         ║   "));
  // Serial.printf("%6.2f °C", temp.toFloat());
  // Serial.println(F("        ║"));

  // Serial.print(F("║  Humidity            ║   "));
  // Serial.printf("%6.2f %% ", hum.toFloat());
  // Serial.println(F("        ║"));

  // Serial.printf(("║  Pressure            ║  %7.2f hPa       ║\n"), press.toFloat());
  // Serial.printf(("║  Altitude            ║  %7.2f m         ║\n"), alt.toFloat());

  // Serial.println(F("╚══════════════════════╩════════════════════╝"));

  delay(2000);
}
