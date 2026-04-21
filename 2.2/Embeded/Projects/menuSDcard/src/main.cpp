#include <Arduino.h>
#include <SPI.h>
#include <SD.h>
#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>
#include <Adafruit_Sensor.h>
#include <Adafruit_BME280.h>
#include "sdcard.h"

#define SENSOR_SUPPLY 47
#define i2c_Address 0x3c
#define USUP_POWER_PIN 2 // uSUP power pin
#define DELAYTIME 1000

#define SEALEVELPRESSURE_HPA (1013.25)
#define CORRECT_TEMP (0.40)

Adafruit_SSD1306 display(128, 64, &Wire, -1);
Adafruit_BME280 bme;

#define SD_CLK 12
#define SD_MISO 13
#define SD_MOSI 11
#define SD_CS_PIN 10

#define SDA_PIN 42
#define SCL_PIN 2

#define CLK 6
#define DT 5
#define SW 4

int currentStateCLK;
int lastStateCLK;
unsigned long lastButtonPress = 0;
int count = 0;

String fileContent;

enum DisplayMode
{
  MODE_SENSOR = 0,
  MODE_SD_STATS = 1,
  MODE_MENU = 2
};

DisplayMode activeMode = MODE_SENSOR;
int menuSelection = 0;
unsigned long lastMenuActivity = 0;
const unsigned long MENU_TIMEOUT_MS = 3000;

float temperature = 0.0F;
float pressure = 0.0F;
float humidity = 0.0F;
float altitude = 0.0F;

const char *cardTypeToString(uint8_t cardType)
{
  if (cardType == CARD_MMC)
    return "MMC";
  if (cardType == CARD_SD)
    return "SDSC";
  if (cardType == CARD_SDHC)
    return "SDHC";
  if (cardType == CARD_NONE)
    return "NO CARD";
  return "UNKNOWN";
}

void drawSensorScreen()
{
  display.clearDisplay();
  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);
  display.setCursor(0, 0);
  display.println("Sensor data");
  display.setTextSize(1);
  display.printf("T: %.2f C\n", temperature);
  display.printf("H: %.2f %%\n", humidity);
  display.printf("P: %.2f hPa\n", pressure);
  display.printf("A: %.2f m\n", altitude);
  display.printf("Logs: %d\n", count);
  display.display();
}

void drawSdStatsScreen()
{
  uint8_t cardType = SD.cardType();
  uint64_t totalMB = SD.totalBytes() / (1024 * 1024);
  uint64_t usedMB = SD.usedBytes() / (1024 * 1024);
  uint64_t freeMB = (totalMB >= usedMB) ? (totalMB - usedMB) : 0;
  float usedPct = (totalMB > 0) ? (100.0f * (float)usedMB / (float)totalMB) : 0.0f;

  display.clearDisplay();
  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);
  display.setCursor(0, 0);
  display.println("SD card stats");
  display.printf("Type: %s\n", cardTypeToString(cardType));
  display.printf("Cap: %lluMB\n", totalMB);
  display.printf("Used: %lluMB\n", usedMB);
  display.printf("Free: %lluMB\n", freeMB);
  display.printf("Use: %.1f%%\n", usedPct);
  display.display();
}

void drawMenuScreen()
{
  display.clearDisplay();
  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);
  display.setCursor(0, 0);
  display.println("Select mode");
  display.printf("Sensor data%s\n", (menuSelection == 0) ? " *" : "");
  display.printf("SD stats%s\n", (menuSelection == 1) ? " *" : "");
  display.println("Auto switch in 3s");
  display.display();
}

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
  Wire.begin(SDA_PIN, SCL_PIN); // Set dedicated I2C pins for ESP32-S3-DEVKit
  bme.begin(0x77);              // Initialize BME280 sensor at I2C address 0x77

  while (!Serial)
    ; // Wait for serial communication to be established

  // rotate encoder pins setup
  pinMode(CLK, INPUT);
  pinMode(DT, INPUT);
  pinMode(SW, INPUT_PULLUP);
  lastStateCLK = digitalRead(CLK);
  // Initialize SPI communication for SD card
  SPI.begin(SD_CLK, SD_MISO, SD_MOSI, SD_CS_PIN);

  // Attempt to initialize the SD card
  if (!SD.begin(SD_CS_PIN))
  {
    Serial.println("Card Mount Failed");
    return;
  }

  // Check the type of SD card attached
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
  // Check if the file exists and read its content, otherwise start with an empty string
  if (SD.exists("/sensor_data.txt"))
  {
    Serial.println("File exists, reading data:");
    fileContent = readFileAsString(SD, "/sensor_data.txt");
  }
  else
  {
    Serial.println("File does not exist, creating it:");
    writeFile(SD, "/sensor_data.txt", "Count;Temperature;Pressure;Humidity\n");
    fileContent = "Count;Temperature;Pressure;Humidity\n";
  }
  display.begin(SSD1306_SWITCHCAPVCC, i2c_Address);
  display.clearDisplay();
  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);
  display.setCursor(0, 0);
  display.println("Initializing...");
  display.display();
}

void loop()
{
  currentStateCLK = digitalRead(CLK);
  if (currentStateCLK != lastStateCLK && currentStateCLK == HIGH)
  {
    if (digitalRead(DT) != currentStateCLK)
      menuSelection++;
    else
      menuSelection--;

    if (menuSelection < 0)
      menuSelection = 1;
    if (menuSelection > 1)
      menuSelection = 0;

    activeMode = MODE_MENU;
    lastMenuActivity = millis();
  }
  lastStateCLK = currentStateCLK;

  if (digitalRead(SW) == LOW && (millis() - lastButtonPress) > 250)
  {
    lastButtonPress = millis();
    activeMode = MODE_MENU;
    lastMenuActivity = millis();
  }

  if (activeMode == MODE_MENU && (millis() - lastMenuActivity) >= MENU_TIMEOUT_MS)
  {
    activeMode = (menuSelection == 0) ? MODE_SENSOR : MODE_SD_STATS;
  }

  static unsigned long lastTick = 0;
  if (millis() - lastTick >= DELAYTIME)
  {
    lastTick = millis();

    temperature = bme.readTemperature() - CORRECT_TEMP;
    pressure = bme.readPressure() / 100.0F;
    humidity = bme.readHumidity();
    altitude = bme.readAltitude(SEALEVELPRESSURE_HPA);

    char line[128];
    count++;
    snprintf(line, sizeof(line), "%d;%.2f;%.2f;%.2f\n", count, temperature, pressure, humidity);
    appendFile(SD, "/sensor_data.txt", line);
    fileContent += line; // Update the global file content variable
  }

  // Render active OLED screen
  if (activeMode == MODE_SENSOR)
    drawSensorScreen();
  else if (activeMode == MODE_SD_STATS)
    drawSdStatsScreen();
  else
    drawMenuScreen();

  delay(20);
}