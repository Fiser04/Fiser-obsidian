#include <Arduino.h>
#include <SD.h>
#include <SPI.h>
#include "sdcard.h"
#include <Adafruit_Sensor.h>
#include <Adafruit_BME280.h>
Adafruit_BME280 bme;
#define SD_CLK 12
#define SD_MISO 13
#define SD_MOSI 11
#define SD_CS_PIN 10

#define SENSOR_SUPPLY 47
#define i2c_Address 0x3c
#define USUP_POWER_PIN 2 // uSUP power pin
#define DELAYTIME 1000
#define SEALEVELPRESSURE_HPA (1013.25)
#define CORRECT_TEMP (0.40)

String fileContent = "";
int count = 0;
void setup()
{
  Serial.begin(115200);
  pinMode(4, OUTPUT);
  digitalWrite(4, HIGH);
  pinMode(SENSOR_SUPPLY, OUTPUT);
  digitalWrite(SENSOR_SUPPLY, HIGH);
  delay(1000);
  pinMode(USUP_POWER_PIN, OUTPUT);
  digitalWrite(USUP_POWER_PIN, HIGH);
  delay(1000);
  Wire.begin(42, 2); // Set dedicated I2C pins 42 - SDA, 2 - SCL for ESP32-S3-DEVKit
  bme.begin(0x77);   // 0x77 OR 0x76 for left pad on board
  while (!Serial)
    ; // time to get serial running

  SPI.begin(SD_CLK, SD_MISO, SD_MOSI, SD_CS_PIN);
  if (!SD.begin(SD_CS_PIN))
  {
    Serial.println("Card Mount Failed");
    return;
  }
  uint8_t cardType = SD.cardType();
  if (cardType == CARD_NONE)
  {
    Serial.println("No SD card attached");
    return;
  }

  Serial.print("SD Card Type: ");
  if (cardType == CARD_MMC)
  {
    Serial.println("MMC");
  }
  else if (cardType == CARD_SD)
  {
    Serial.println("SDSC");
  }
  else if (cardType == CARD_SDHC)
  {
    Serial.println("SDHC");
  }
  else
  {
    Serial.println("UNKNOWN");
  }

  uint64_t cardSize = SD.cardSize() / (1024 * 1024);
  Serial.printf("SD Card Size: %lluMB\n", cardSize);

  if (SD.exists("/sensor_data.txt"))
  {
    Serial.println("File exists, reading data:");
    fileContent = readFileAsString(SD, "/sensor_data.txt");
  }
  else
  {
    Serial.println("File does not exist, creating it:");
    writeFile(SD, "/sensor_data.txt", "Count;Temperature;Pressure;Humidity\n");
  }

  // find the last count value in the file and set count to that value + 1
  if (fileContent.length() > 0)
  {
    int lastLineIndex = fileContent.lastIndexOf('\n', fileContent.length() - 2);
    if (lastLineIndex != -1)
    {
      String lastLine = fileContent.substring(lastLineIndex + 1);
      int semicolonIndex = lastLine.indexOf(';');
      if (semicolonIndex != -1)
      {
        String lastCountStr = lastLine.substring(0, semicolonIndex);
        count = lastCountStr.toInt() + 1;
        Serial.printf("Last count value: %d, starting from: %d\n", count - 1, count);
      }
      else
      {
        Serial.println("No semicolon found in the last line, starting count from 0");
      }
    }
    else
    {
      Serial.println("No lines found in the file, starting count from 0");
      count = 0;
    }
  }
}

void loop()
{

  String data = String(count) + ";" +
                String(bme.readTemperature() - CORRECT_TEMP) + ";" +
                String(bme.readPressure() / 100.0F) + ";" +
                String(bme.readHumidity()) + "\n";
  Serial.print(data);
  appendFile(SD, "/sensor_data.txt", data.c_str());
  count++;
  delay(5000);
}