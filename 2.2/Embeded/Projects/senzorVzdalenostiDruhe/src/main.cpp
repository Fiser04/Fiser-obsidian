// // 01. VL53L0X test
// #include <Wire.h>
// #include "Adafruit_VL53L0X.h"

// #define SDA_PIN 42
// #define SCL_PIN 2

// Adafruit_VL53L0X lox = Adafruit_VL53L0X();

// void setup()
// {
//   Serial.begin(115200);
//   pinMode(4, OUTPUT);
//   digitalWrite(4, HIGH);
//   pinMode(47, OUTPUT);
//   digitalWrite(47, HIGH);
//   delay(1000);

//   Wire.begin(SDA_PIN, SCL_PIN);

//   // wait until serial port opens for native USB devices
//   while (!Serial)
//   {
//     delay(1);
//   }

//   Serial.println("Adafruit VL53L0X test.");
//   if (!lox.begin())
//   {
//     Serial.println(F("Failed to boot VL53L0X"));
//     while (1)
//       ;
//   }
//   // power
//   Serial.println(F("VL53L0X API Continuous Ranging example\n\n"));

//   // start continuous ranging
//   lox.startRangeContinuous();
// }

// void loop()
// {
//   if (lox.isRangeComplete())
//   {
//     Serial.print("Distance in mm: ");
//     Serial.println(lox.readRange());
//   }
// }

// //=======================================
// // 02. RTOS základ

// #include <Wire.h>
// #include "Adafruit_VL53L0X.h"

// #define SDA_PIN 42
// #define SCL_PIN 2

// Adafruit_VL53L0X lox = Adafruit_VL53L0X();

// #define LED_PIN 21

// // ---------- Task pro měření vzdálenosti ----------
// void TaskDistanceMeasure(void *pvParameters)
// {
//   (void)pvParameters;
//   for (;;)
//   {
//     if (lox.isRangeComplete())
//     {
//       uint16_t distance = lox.readRange();
//       Serial.print("Distance in mm: ");
//       Serial.println(distance);
//     }
//     // Krátké uspání tasku, aby neběžel zbytečně naplno
//     vTaskDelay(pdMS_TO_TICKS(50));
//   }
// }

// // ---------- Task pro blikání LED ----------
// void TaskBlinkLed(void *pvParameters)
// {
//   (void)pvParameters;
//   for (;;)
//   {
//     digitalWrite(LED_PIN, HIGH);
//     Serial.println("LED ON");
//     vTaskDelay(pdMS_TO_TICKS(200));

//     digitalWrite(LED_PIN, LOW);
//     Serial.println("LED OFF");
//     vTaskDelay(pdMS_TO_TICKS(200));
//   }
// }

// void setup()
// {
//   Serial.begin(115200);
//   pinMode(4, OUTPUT);
//   digitalWrite(4, HIGH);
//   pinMode(47, OUTPUT);
//   digitalWrite(47, HIGH);
//   delay(1000);

//   pinMode(LED_PIN, OUTPUT);

//   Wire.begin(SDA_PIN, SCL_PIN);

//   // wait until serial port opens for native USB devices
//   while (!Serial)
//   {
//     delay(1);
//   }

//   Serial.println("Adafruit VL53L0X test.");
//   if (!lox.begin())
//   {
//     Serial.println(F("Failed to boot VL53L0X"));
//     while (1)
//       ;
//   }
//   // power
//   Serial.println(F("VL53L0X API Continuous Ranging example\n\n"));

//   // start continuous ranging
//   lox.startRangeContinuous();
//   // Vytvoření RTOS tasků

//   xTaskCreate(
//       TaskDistanceMeasure, // funkce tasku
//       "DistanceTask",      // jméno
//       4096,                // velikost stacku
//       NULL,                // parametr
//       2,                   // priorita
//       NULL                 // handle
//   );

//   xTaskCreate(
//       TaskBlinkLed,
//       "BlinkTask",
//       2048,
//       NULL,
//       1,
//       NULL);
// }

// void loop()
// {
//   // loop zůstává prázdná
//   // aplikaci řídí FreeRTOS tasky
//   vTaskDelay(pdMS_TO_TICKS(1000));
// }

//=======================================
// 03. RTOS fronta pro sdílení dat mezi tasky

// #include <Wire.h>
// #include "Adafruit_VL53L0X.h"

// #define SDA_PIN 42
// #define SCL_PIN 2
// #define LED_PIN 21

// Adafruit_VL53L0X lox = Adafruit_VL53L0X();

// // Handle na RTOS frontu
// QueueHandle_t distanceQueue;

// void TaskDistanceMeasure(void *pvParameters)
// {
//   (void)pvParameters;

//   uint16_t distance;

//   for (;;)
//   {
//     if (lox.isRangeComplete())
//     {
//       distance = lox.readRange();

//       Serial.print("Namereno: ");
//       Serial.print(distance);
//       Serial.println(" mm");

//       // Pošli hodnotu do fronty
//       xQueueSend(distanceQueue, &distance, portMAX_DELAY);
//     }

//     vTaskDelay(pdMS_TO_TICKS(50));
//   }
// }

// void TaskLedControl(void *pvParameters)
// {
//   (void)pvParameters;

//   uint16_t receivedDistance;
//   int blinkDelay = 500;

//   for (;;)
//   {
//     // Čekej na novou hodnotu z fronty
//     if (xQueueReceive(distanceQueue, &receivedDistance, portMAX_DELAY) == pdTRUE)
//     {
//       Serial.print("LED task dostal: ");
//       Serial.print(receivedDistance);
//       Serial.println(" mm");

//       // Nastavení rychlosti blikání podle vzdálenosti
//       if (receivedDistance < 100)
//       {
//         blinkDelay = 100; // velmi blízko -> rychlé blikání
//       }
//       else if (receivedDistance < 300)
//       {
//         blinkDelay = 250; // střední vzdálenost
//       }
//       else
//       {
//         blinkDelay = 500; // daleko -> pomalé blikání
//       }

//       digitalWrite(LED_PIN, HIGH);
//       vTaskDelay(pdMS_TO_TICKS(blinkDelay));
//       digitalWrite(LED_PIN, LOW);
//       vTaskDelay(pdMS_TO_TICKS(blinkDelay));
//     }
//   }
// }

// void setup()
// {
//   Serial.begin(115200);

//   pinMode(4, OUTPUT);
//   digitalWrite(4, HIGH);
//   pinMode(47, OUTPUT);
//   digitalWrite(47, HIGH);
//   delay(1000);

//   pinMode(LED_PIN, OUTPUT);
//   digitalWrite(LED_PIN, LOW);

//   Wire.begin(SDA_PIN, SCL_PIN);

//   while (!Serial)
//   {
//     delay(1);
//   }

//   Serial.println("VL53L0X + FreeRTOS Queue example");

//   if (!lox.begin())
//   {
//     Serial.println("Failed to boot VL53L0X");
//     while (1)
//       ;
//   }

//   lox.startRangeContinuous();

//   // Vytvoření fronty pro 5 hodnot typu uint16_t
//   distanceQueue = xQueueCreate(5, sizeof(uint16_t));

//   if (distanceQueue == NULL)
//   {
//     Serial.println("Chyba: frontu se nepodarilo vytvorit");
//     while (1)
//       ;
//   }

//   xTaskCreate(
//       TaskDistanceMeasure,
//       "DistanceTask",
//       4096,
//       NULL,
//       2,
//       NULL);

//   xTaskCreate(
//       TaskLedControl,
//       "LedTask",
//       2048,
//       NULL,
//       1,
//       NULL);
// }

// void loop()
// {
//   vTaskDelay(pdMS_TO_TICKS(1000));
// }

//=======================================
// 04. RTOS MUTEX pro sdílení dat mezi tasky

// #include <Arduino.h>
// #include <Wire.h>
// #include "Adafruit_VL53L0X.h"
// #include <Adafruit_GFX.h>
// #include <Adafruit_SSD1306.h>

// #define SDA_PIN 42
// #define SCL_PIN 2

// #define SCREEN_WIDTH 128
// #define SCREEN_HEIGHT 64
// #define OLED_RESET -1

// Adafruit_VL53L0X lox;
// Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);

// SemaphoreHandle_t i2cMutex;
// SemaphoreHandle_t dataMutex;

// uint16_t lastDistance = 0;
// bool distanceValid = false;

// void TaskSensor(void *pvParameters)
// {
//   (void)pvParameters;

//   VL53L0X_RangingMeasurementData_t measure;
//   TickType_t lastWake = xTaskGetTickCount();

//   for (;;)
//   {
//     vTaskDelayUntil(&lastWake, pdMS_TO_TICKS(100));

//     bool localValid = false;
//     uint16_t localDistance = 0;

//     if (xSemaphoreTake(i2cMutex, pdMS_TO_TICKS(200)) == pdTRUE)
//     {
//       lox.rangingTest(&measure, false);
//       xSemaphoreGive(i2cMutex);

//       if (measure.RangeStatus != 4)
//       { // 4 = out of range
//         localDistance = measure.RangeMilliMeter;
//         localValid = true;
//       }
//     }

//     if (xSemaphoreTake(dataMutex, pdMS_TO_TICKS(20)) == pdTRUE)
//     {
//       distanceValid = localValid;
//       if (localValid)
//       {
//         lastDistance = localDistance;
//       }
//       xSemaphoreGive(dataMutex);
//     }

//     if (localValid)
//     {
//       Serial.print("Sensor: ");
//       Serial.print(localDistance);
//       Serial.println(" mm");
//     }
//     else
//     {
//       Serial.println("Sensor: invalid/out of range");
//     }
//   }
// }

// void TaskDisplay(void *pvParameters)
// {
//   (void)pvParameters;

//   for (;;)
//   {
//     uint16_t distanceCopy = 0;
//     bool validCopy = false;

//     if (xSemaphoreTake(dataMutex, pdMS_TO_TICKS(20)) == pdTRUE)
//     {
//       distanceCopy = lastDistance;
//       validCopy = distanceValid;
//       xSemaphoreGive(dataMutex);
//     }

//     if (xSemaphoreTake(i2cMutex, pdMS_TO_TICKS(300)) == pdTRUE)
//     {
//       display.clearDisplay();
//       display.setTextSize(1);
//       display.setTextColor(SSD1306_WHITE);
//       display.setCursor(0, 0);

//       display.println("RTOS sensor + OLED");
//       display.println();

//       if (validCopy)
//       {
//         display.print("Distance: ");
//         display.print(distanceCopy);
//         display.println(" mm");
//       }
//       else
//       {
//         display.println("Distance: N/A");
//       }

//       display.display();
//       xSemaphoreGive(i2cMutex);
//     }

//     vTaskDelay(pdMS_TO_TICKS(500));
//   }
// }

// void setup()
// {
//   Serial.begin(115200);

//   pinMode(4, OUTPUT);
//   digitalWrite(4, HIGH);
//   pinMode(47, OUTPUT);
//   digitalWrite(47, HIGH);
//   delay(1000);

//   Wire.begin(SDA_PIN, SCL_PIN);
//   Wire.setClock(400000);

//   while (!Serial)
//   {
//     delay(1);
//   }

//   if (!lox.begin())
//   {
//     Serial.println("Failed to boot VL53L0X");
//     while (1)
//     {
//       delay(10);
//     }
//   }

//   if (!display.begin(SSD1306_SWITCHCAPVCC, 0x3C))
//   {
//     Serial.println("Failed to boot OLED");
//     while (1)
//     {
//       delay(10);
//     }
//   }

//   i2cMutex = xSemaphoreCreateMutex();
//   dataMutex = xSemaphoreCreateMutex();

//   if (!i2cMutex || !dataMutex)
//   {
//     Serial.println("Mutex create failed");
//     while (1)
//     {
//       delay(10);
//     }
//   }

//   xTaskCreate(TaskSensor, "SensorTask", 4096, NULL, 3, NULL);
//   xTaskCreate(TaskDisplay, "DisplayTask", 4096, NULL, 1, NULL);
// }

// void loop()
// {
//   vTaskDelay(pdMS_TO_TICKS(1000));
// }

//=======================================
// 02. Oled visualization VL53L0X (pridat vzdálenost na display)
#include <Wire.h>
#include "Adafruit_VL53L0X.h"
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SDA_PIN 42
#define SCL_PIN 2
#define OLED_ADDR 0x3C

Adafruit_VL53L0X lox = Adafruit_VL53L0X();
Adafruit_SSD1306 display(128, 64, &Wire, -1);

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
    Serial.println("SSD1306 init failed");
    while (1)
      ;
  }

  display.clearDisplay();
  display.setTextColor(SSD1306_WHITE);

  if (!lox.begin())
  {
    display.println("VL53L0X fail!");
    display.display();
    while (1)
      ;
  }

  lox.startRangeContinuous();
}

void loop()
{
  if (lox.isRangeComplete())
  {
    int distance = lox.readRange();
    int height = map(distance, 0, 800, 0, 64);

    display.clearDisplay();
    display.drawLine(64, 64, 64, 64 - height, SSD1306_WHITE);
    display.display();

    delay(50);
  }
}

/*
// 03. Ovládání šipky náklonem + detekce překážky
#include <Wire.h>
#include "Adafruit_VL53L0X.h"
#include <Adafruit_SSD1306.h>
#include <Adafruit_GFX.h>
#include <BMI160Gen.h>

#define SDA_PIN 42
#define SCL_PIN 2
#define OLED_ADDR 0x3C

Adafruit_VL53L0X lox = Adafruit_VL53L0X();
Adafruit_SSD1306 display(128, 64, &Wire, -1);
BMI160GenClass bmi160;

void setup() {
  Serial.begin(115200);
  pinMode(4, OUTPUT);
  digitalWrite(4, HIGH);
  pinMode(47, OUTPUT);
  digitalWrite(47, HIGH);
  delay(1000);
  Wire.begin(SDA_PIN, SCL_PIN);

  if (!display.begin(SSD1306_SWITCHCAPVCC, OLED_ADDR)) {
    Serial.println("OLED init failed");
    while (1);
  }

  display.clearDisplay();
  display.setTextColor(SSD1306_WHITE);

  if (!lox.begin()) {
    display.println("VL53L0X fail");
    display.display();
    while (1);
  }

  if (!bmi160.begin(BMI160GenClass::I2C_MODE, 0x69)) {
    display.println("BMI160 fail");
    display.display();
    while (1);
  }

  bmi160.setAccelerometerRange(2);
  lox.startRangeContinuous();
}

void loop() {
  display.clearDisplay();

  int ax, ay, az, gx, gy, gz;
  bmi160.readMotionSensor(ax, ay, az, gx, gy, gz);

  float accelX = ax / 16384.0;
  float accelY = ay / 16384.0;

  if (lox.isRangeComplete()) {
    int distance = lox.readRange();
    uint8_t status = lox.readRangeStatus();

    if (status == VL53L0X_ERROR_NONE && distance < 150) {
      display.setCursor(30, 25);
      display.setTextSize(2);
      display.println("STOP");
    } else if (status == VL53L0X_ERROR_NONE) {
      display.setTextSize(1);
      int cx = 64;
      int cy = 32;

      // vykreslení šipky dle náklonu
      int dx = accelX * 20;
      int dy = accelY * 20;

      display.drawLine(cx, cy, cx + dx, cy + dy, SSD1306_WHITE);
      display.fillCircle(cx + dx, cy + dy, 3, SSD1306_WHITE);
    } else {
      // Nepodařilo se změřit
      display.setCursor(0, 0);
      display.setTextSize(1);
      display.println("Mereni selhalo");
    }

    display.display();
    delay(100);
  }
}
  */
