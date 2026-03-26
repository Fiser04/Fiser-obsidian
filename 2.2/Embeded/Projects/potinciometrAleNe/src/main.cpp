// /**/
//   #include <Arduino.h>
//   #include <Wire.h>
//   #include <Adafruit_GFX.h>
//   #include <Adafruit_SSD1306.h>

//   #define SENSOR_SUPPLY 47
//   #define USUP_POWER_PIN 2  // uSUP power pin

// // Definice pinů pro rotační enkodér
// #define CLK 8         // Pin pro hodinový signál enkodéru
// #define DT 7          // Pin pro datový signál enkodéru
// #define SW 6          // Pin pro tlačítko enkodéru

// int counter = 0;      // Počítadlo pro sledování pozice enkodéru
// int currentStateCLK;  // Aktuální stav hodinového signálu
// int lastStateCLK;     // Předchozí stav hodinového signálu
// String currentDir =""; // Aktuální směr otáčení (CW nebo CCW)
// unsigned long lastButtonPress = 0;

// void setup() {
//   Serial.begin(115200);  // Inicializace sériové komunikace rychlostí 115200 baudů

//   while (!Serial); // čas pro spuštění Serial

//   pinMode(USUP_POWER_PIN, OUTPUT);
//   digitalWrite(USUP_POWER_PIN, HIGH);
//   pinMode(SENSOR_SUPPLY, OUTPUT);
//   digitalWrite(SENSOR_SUPPLY, HIGH);

//   pinMode(CLK,INPUT);         // Nastavení pinu CLK jako vstup
//   pinMode(DT,INPUT);          // Nastavení pinu DT jako vstup
//   pinMode(SW, INPUT_PULLUP);  // Nastavení pinu SW jako vstup s pull-up rezistorem

//   lastStateCLK = digitalRead(CLK); // Uložení počátečního stavu hodinového signálu
// }

// void loop() {
//   currentStateCLK = digitalRead(CLK);         // Čtení aktuálního stavu hodinového signálu
//   if (currentStateCLK != lastStateCLK && currentStateCLK == 1){ // Detekce změny stavu a náběžné hrany
//     if (digitalRead(DT) != currentStateCLK) { // Kontrola směru otáčení pomocí porovnání DT a CLK
//       counter --;                             // Dekrementace počítadla při otáčení proti směru hodinových ručiček
//       currentDir ="CCW";                      // Nastavení aktuálního směru na CCW (proti směru hodinových ručiček)
//     } else {
//       counter ++;                             // Inkrementace počítadla při otáčení ve směru hodinových ručiček
//       currentDir ="CW";                       // Nastavení aktuálního směru na CW (ve směru hodinových ručiček)
//     }

//     Serial.print("Direction: ");
//     Serial.print(currentDir);
//     Serial.print(" | Counter: ");
//     Serial.println(counter);
//   }

//   lastStateCLK = currentStateCLK;              // Aktualizace předchozího stavu CLK pro příští iteraci

//   int btnState = digitalRead(SW);              // Čtení stavu tlačítka enkodéru

//   if (btnState == LOW) {                       // Kontrola, zda je tlačítko stisknuto (LOW při stisku díky INPUT_PULLUP)
//     if (millis() - lastButtonPress > 50) {     // Ošetření zákmitů tlačítka (debouncing) - 50ms prodleva
//       Serial.println("Button pressed!");
//     }

//     lastButtonPress = millis();              // Aktualizace časové značky posledního stisknutí tlačítka
//   }

//   delay(1);
// }

/*
// Rgulace jasu LED pomocí rotačního enkodéru
#include <Arduino.h>

#define SENSOR_SUPPLY 47
#define USUP_POWER_PIN 2

// Rotační enkodér
#define CLK 8
#define DT 7
#define SW 6

// LED pro PWM
#define LED_PIN 16 // uprav podle zapojení
#define PWM_CHANNEL 0
#define PWM_FREQ 5000    // 5 kHz
#define PWM_RESOLUTION 8 // 8 bit => rozsah 0-255

int brightness = 128; // počáteční jas LED (50 %)
int stepSize = 5;     // krok změny jasu při otočení enkodéru

int currentStateCLK;
int lastStateCLK;
String currentDir = "";

unsigned long lastButtonPress = 0;

void updateLedBrightness()
{
  brightness = constrain(brightness, 0, 255);
  ledcWrite(PWM_CHANNEL, brightness);

  Serial.print("Brightness: ");
  Serial.print(brightness);
  Serial.print(" / 255  (");
  Serial.print((brightness * 100) / 255);
  Serial.println("%)");
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

  // Enkodér
  pinMode(CLK, INPUT_PULLUP);
  pinMode(DT, INPUT_PULLUP);
  pinMode(SW, INPUT_PULLUP);

  // PWM pro LED
  ledcSetup(PWM_CHANNEL, PWM_FREQ, PWM_RESOLUTION);
  ledcAttachPin(LED_PIN, PWM_CHANNEL);

  lastStateCLK = digitalRead(CLK);

  updateLedBrightness();

  Serial.println("Start programu");
  Serial.println("Otacej enkoderem pro zmenu jasu LED.");
  Serial.println("Stisk tlacitka nastavi jas na 50 %.");
}

void loop()
{
  currentStateCLK = digitalRead(CLK);

  // Reakce na náběžnou hranu CLK
  if (currentStateCLK != lastStateCLK && currentStateCLK == HIGH)
  {

    if (digitalRead(DT) != currentStateCLK)
    {
      // Otočení proti směru hodinových ručiček
      brightness -= stepSize;
      currentDir = "CCW";
    }
    else
    {
      // Otočení ve směru hodinových ručiček
      brightness += stepSize;
      currentDir = "CW";
    }

    brightness = constrain(brightness, 0, 255);
    ledcWrite(PWM_CHANNEL, brightness);

    Serial.print("Direction: ");
    Serial.print(currentDir);
    Serial.print(" | Brightness: ");
    Serial.print(brightness);
    Serial.print(" / 255  (");
    Serial.print((brightness * 100) / 255);
    Serial.println("%)");
  }

  lastStateCLK = currentStateCLK;

  // Tlačítko enkodéru
  int btnState = digitalRead(SW);
  if (btnState == LOW)
  {
    if (millis() - lastButtonPress > 200)
    {                   // debounce tlačítka
      brightness = 128; // reset na 50 %
      updateLedBrightness();
      Serial.println("Button pressed -> Brightness reset to 50 %");
    }
    lastButtonPress = millis();
  }

  delay(1);
}
*/

// Počítadlo s rotačním enkodérem a zobrazením na OLED displeji

#include <Arduino.h>
#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

// OLED nastavení
#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64
#define OLED_ADDR 0x3C

#define SENSOR_SUPPLY 47
#define i2c_Address 0x3c
#define USUP_POWER_PIN 2 // uSUP power pin
#define DELAYTIME 1000

Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, -1);

// Definice pinů pro rotační enkodér
#define CLK 8
#define DT 7
#define SW 6

// LED pro PWM
#define LED_PIN 16 // uprav podle zapojení
#define PWM_CHANNEL 0
#define PWM_FREQ 5000    // 5 kHz
#define PWM_RESOLUTION 8 // 8 bit => rozsah 0-255

int brightness = 128; // počáteční jas LED (50 %)
int stepSize = 5;     // krok změny jasu při otočení enkodéru

int counter = 0;
int currentStateCLK;
int lastStateCLK;
String currentDir = "";
unsigned long lastButtonPress = 0;
bool buttonPressed = false;

void updateLedBrightness()
{
  brightness = constrain(brightness, 0, 255);
  ledcWrite(PWM_CHANNEL, brightness);

  Serial.print("Brightness: ");
  Serial.print(brightness);
  Serial.print(" / 255  (");
  Serial.print((brightness * 100) / 255);
  Serial.println("%)");
}
// Funkce pro aktualizaci zobrazení počítadla
void updateDisplay()
{
  display.clearDisplay();
  display.setTextSize(4);
  display.setCursor(10, 10);
  display.println(brightness);
  display.display();
}

void setup()
{
  Serial.begin(115200);
  while (!Serial)
    ; // time to get serial running

  pinMode(USUP_POWER_PIN, OUTPUT);    // Set display power pin as output
  digitalWrite(USUP_POWER_PIN, HIGH); // Turn on the display
  pinMode(SENSOR_SUPPLY, OUTPUT);
  digitalWrite(SENSOR_SUPPLY, HIGH);
  Wire.begin(42, 2); // Set dedicated I2C pins 42 - SDA, 2 - SCL for ESP32-S3-DEVKit

  pinMode(CLK, INPUT);
  pinMode(DT, INPUT);
  pinMode(SW, INPUT_PULLUP);

  // PWM pro LED
  ledcSetup(PWM_CHANNEL, PWM_FREQ, PWM_RESOLUTION);
  ledcAttachPin(LED_PIN, PWM_CHANNEL);

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

  // Detekce změny enkodéru
  if (currentStateCLK != lastStateCLK && currentStateCLK == 1)
  {
    if (digitalRead(DT) != currentStateCLK)
    {

      brightness -= stepSize;
      currentDir = "CCW";
    }
    else
    {

      brightness += stepSize;
      currentDir = "CW";
    }

    if (!buttonPressed)
    { // Aktualizace displeje jen pokud není zmáčknuto tlačítko
      updateDisplay();
    }
  }
  brightness = constrain(brightness, 0, 255);
  ledcWrite(PWM_CHANNEL, brightness);
  lastStateCLK = currentStateCLK;

  int btnState = digitalRead(SW);

  if (btnState == LOW)
  { // Tlačítko stisknuto
    if (millis() - lastButtonPress > 50)
    { // debounce
      brightness = 128;
      display.clearDisplay();
      display.setTextSize(2);
      display.setCursor(20, 20);
      display.println("Click");
      display.display();
      // reset na 50 %
      updateLedBrightness();
      Serial.println("Button pressed -> Brightness reset to 50 %");
    }
    lastButtonPress = millis();
  }
  else if (buttonPressed)
  { // Tlačítko uvolněno
    updateDisplay();
  }

  delay(1);
}

/*
// Počítadlo s indikátorem a zobrazením na OLED displeji
#include <Arduino.h>
#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SENSOR_SUPPLY 47
#define i2c_Address 0x3c
#define USUP_POWER_PIN 2

// OLED
#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64
#define OLED_ADDR 0x3C
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, -1);

// Rotační enkodér
#define CLK 8
#define DT 7
#define SW 6

int counter = 0;
int currentStateCLK;
int lastStateCLK;
bool buttonPressed = false;
unsigned long lastButtonPress = 0;

void updateDisplay()
{
  display.clearDisplay();

  // vykresli "LED" sloupec
  display.fillRect(60, 64 - counter, 8, counter, SSD1306_WHITE);

  // Nastav velikost písma pro číslo
  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);

  // Připrav text s hodnotou
  String valueText = String(counter);

  // Vypočítej souřadnice textu (aby byl nad sloupcem)
  int16_t x1, y1;
  uint16_t w, h;
  display.getTextBounds(valueText, 0, 0, &x1, &y1, &w, &h);

  int textX = 64 - w / 2;             // zarovnání na střed sloupce
  int textY = (64 - counter) - h - 2; // umístění nad sloupec

  // Pokud je text příliš vysoko, nastav minimální pozici
  if (textY < 0)
    textY = 0;

  display.setCursor(textX, textY);
  display.println(valueText);

  display.display();
}

void setup()
{
  Serial.begin(115200);
  while (!Serial)
    ; // čas pro spuštění Serial

  pinMode(USUP_POWER_PIN, OUTPUT);
  digitalWrite(USUP_POWER_PIN, HIGH);
  pinMode(SENSOR_SUPPLY, OUTPUT);
  digitalWrite(SENSOR_SUPPLY, HIGH);
  Wire.begin(42, 2); // I2C piny ESP32-S3

  pinMode(CLK, INPUT);
  pinMode(DT, INPUT);
  pinMode(SW, INPUT_PULLUP);

  lastStateCLK = digitalRead(CLK);

  if (!display.begin(SSD1306_SWITCHCAPVCC, OLED_ADDR))
  {
    Serial.println(F("SSD1306 allocation failed"));
    while (1)
      ;
  }

  display.clearDisplay();
  display.setTextColor(SSD1306_WHITE);
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
      counter--;
    }
    else
    {
      counter++;
    }

    Serial.print(" | Counter: ");
    Serial.println(counter);

    // Omezení hodnoty counteru
    if (counter < 0)
      counter = 0;
    if (counter > 64)
      counter = 64;

    if (!buttonPressed)
    {
      updateDisplay();
    }
  }

  lastStateCLK = currentStateCLK;

  // Detekce stisku tlačítka
  int btnState = digitalRead(SW);

  if (btnState == LOW)
  {
    if (millis() - lastButtonPress > 50)
    {                                 // debounce
      buttonPressed = !buttonPressed; // toggle
      if (!buttonPressed)
      {
        updateDisplay();
      }
    }
    lastButtonPress = millis();
  }
}
*/
/*
 // Hra Pong na OLED displeji s ovládáním pomocí rotačního enkodéru

 #include <Arduino.h>
#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SENSOR_SUPPLY 47
#define USUP_POWER_PIN 2

// OLED
#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64
#define OLED_ADDR 0x3C
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, -1);

// Rotační enkodér
#define CLK 8
#define DT  6
#define SW  5

int currentStateCLK;
int lastStateCLK;
unsigned long lastButtonPress = 0;

// ---------------------------
// Herní objekty
// ---------------------------
const int paddleY = SCREEN_HEIGHT - 4;
const int paddleH = 3;
const int paddleW = 24;
int paddleX = (SCREEN_WIDTH - paddleW) / 2;

const int ballSize = 3;
float ballX = SCREEN_WIDTH / 2;
float ballY = SCREEN_HEIGHT / 2;
float ballDX = 0.2;
float ballDY = 0.2;

bool gameOver = false;
int score = 0;

// Časování hry
unsigned long lastFrameTime = 0;
const int frameDelay = 16;   // ~60 FPS

// ---------------------------
// Pomocné funkce
// ---------------------------
void resetBall() {
  ballX = SCREEN_WIDTH / 2;
  ballY = SCREEN_HEIGHT / 2;

  // Náhodný počáteční směr
  ballDX = random(0, 2) == 0 ? -1.2 : 1.2;
  ballDY = 0.2;
}

void resetGame() {
  paddleX = (SCREEN_WIDTH - paddleW) / 2;
  score = 0;
  gameOver = false;
  resetBall();
}

void drawGame() {
  display.clearDisplay();

  // Míček
  display.fillRect((int)ballX, (int)ballY, ballSize, ballSize, SSD1306_WHITE);

  // Pálka
  display.fillRect(paddleX, paddleY, paddleW, paddleH, SSD1306_WHITE);

  // Skóre
  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);
  display.setCursor(0, 0);
  display.print("Score: ");
  display.print(score);

  display.display();
}

void drawGameOver() {
  display.clearDisplay();
  display.setTextSize(2);
  display.setTextColor(SSD1306_WHITE);
  display.setCursor(18, 18);
  display.println("GAME");

  display.setCursor(28, 38);
  display.println("OVER");

  display.setTextSize(1);
  display.setCursor(20, 56);
  display.print("Score: ");
  display.print(score);

  display.display();
}

void updateEncoder() {
  static int lastEncoded = 0;
  static bool initialized = false;

  int msb = digitalRead(CLK);
  int lsb = digitalRead(DT);
  int encoded = (msb << 1) | lsb;

  if (!initialized) {
    lastEncoded = encoded;
    initialized = true;
    return;
  }

  int sum = (lastEncoded << 2) | encoded;

  // doprava
  if (sum == 0b1101 || sum == 0b0100 || sum == 0b0010 || sum == 0b1011) {
    paddleX += 6;
  }

  // doleva
  if (sum == 0b1110 || sum == 0b0111 || sum == 0b0001 || sum == 0b1000) {
    paddleX -= 6;
  }

  if (paddleX < 0) paddleX = 0;
  if (paddleX > SCREEN_WIDTH - paddleW) paddleX = SCREEN_WIDTH - paddleW;

  lastEncoded = encoded;
}


void updateButton() {
  int btnState = digitalRead(SW);

  if (btnState == LOW) {
    if (millis() - lastButtonPress > 200) {
      if (gameOver) {
        resetGame();
      }
    }
    lastButtonPress = millis();
  }
}

void updateBall() {
  ballX += ballDX;
  ballY += ballDY;

  // Levá / pravá stěna
  if (ballX <= 0) {
    ballX = 0;
    ballDX = -ballDX;
  }

  if (ballX >= SCREEN_WIDTH - ballSize) {
    ballX = SCREEN_WIDTH - ballSize;
    ballDX = -ballDX;
  }

  // Horní stěna - náhodný odraz
  if (ballY <= 0) {
    ballY = 0;
    ballDY = fabs(ballDY); // dolů

    int newDir = random(0, 4);
    switch (newDir) {
      case 0: ballDX = -2.0; break;
      case 1: ballDX = -1.0; break;
      case 2: ballDX =  1.0; break;
      case 3: ballDX =  2.0; break;
    }
  }

  // Kolize s pálkou
  bool hitPaddleY = (ballY + ballSize >= paddleY) && (ballY <= paddleY + paddleH);
  bool hitPaddleX = (ballX + ballSize >= paddleX) && (ballX <= paddleX + paddleW);

  if (ballDY > 0 && hitPaddleY && hitPaddleX) {
    ballY = paddleY - ballSize;
    ballDY = -fabs(ballDY);

    // Odraz podle místa dopadu na pálku
    float hitPos = (ballX + ballSize / 2.0) - (paddleX + paddleW / 2.0);

    if (hitPos < -8)       ballDX = -2.0;
    else if (hitPos < -3)  ballDX = -1.2;
    else if (hitPos < 3)   ballDX =  0.0;
    else if (hitPos < 8)   ballDX =  1.2;
    else                   ballDX =  2.0;

    score++;
  }

  // Spodní hrana = prohra
  if (ballY > SCREEN_HEIGHT) {
    gameOver = true;
  }
}

void setup() {
  Serial.begin(115200);
  while (!Serial);

  pinMode(USUP_POWER_PIN, OUTPUT);
  digitalWrite(USUP_POWER_PIN, HIGH);

  pinMode(SENSOR_SUPPLY, OUTPUT);
  digitalWrite(SENSOR_SUPPLY, HIGH);

  Wire.begin(42, 2); // I2C piny ESP32-S3

  pinMode(CLK, INPUT_PULLUP);
  pinMode(DT, INPUT_PULLUP);
  pinMode(SW, INPUT_PULLUP);

  lastStateCLK = digitalRead(CLK);

  if (!display.begin(SSD1306_SWITCHCAPVCC, OLED_ADDR)) {
    Serial.println(F("SSD1306 allocation failed"));
    while (1);
  }

  display.clearDisplay();
  display.setTextColor(SSD1306_WHITE);
  display.display();

  randomSeed(micros());
  resetGame();
}

void loop() {
  updateEncoder();
  updateButton();

  if (!gameOver && millis() - lastFrameTime >= frameDelay) {
    lastFrameTime = millis();
    updateBall();
    drawGame();
  }

  if (gameOver) {
    drawGameOver();
  }
}
  */
