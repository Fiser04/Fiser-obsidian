#include <Wire.h>
#include <Adafruit_VL53L0X.h>
Adafruit_VL53L0X lox = Adafruit_VL53L0X();
#define SDA_PIN 42
#define SCL_PIN 2
#define LED_PIN 21
#define PWM_CHANNEL 0
#define PWM_FREQ 5000
int brightness = 0;
int value = 0;
void setup()
{
  Serial.begin(115200);
  pinMode(4, OUTPUT);
  digitalWrite(4, HIGH);
  pinMode(47, OUTPUT);
  digitalWrite(47, HIGH);

  ledcAttachPin(LED_PIN, PWM_CHANNEL);
  ledcSetup(PWM_CHANNEL, PWM_FREQ, 8); // 8-bit resolution
  delay(1000);
  Wire.begin(SDA_PIN, SCL_PIN); // Set dedicated I2C pins for ESP32-S3-DEVKit

  while (!Serial)
  {
    delay(1);
  }; // Wait for serial communication to be established

  Serial.println(F("VL53L0X Test\n\n"));
  if (!lox.begin())
  {
    Serial.println(F("Failed to boot VL53L0X"));
    while (1)
      ;
  }
  Serial.println(F("VL53L0X API Simple Ranging example\n\n"));
  lox.startRangeContinuous();
}

void loop()
{
  if (lox.isRangeComplete())
  {
    // brightness = lox.readRange();
    value = lox.readRange();
  }

  brightness = map(value, 30, 150, 0, 255);   // Map distance to brightness
  brightness = constrain(brightness, 0, 255); // Ensure brightness is within 0-255
  ledcWrite(PWM_CHANNEL, brightness);
  Serial.print("Distance: ");
  Serial.print(" mm, Brightness: ");
  Serial.println(brightness);
}