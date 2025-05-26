
## 1. Ochrana dat. Popište, na základě čeho budete implementovat bezpečnostní politiky
Můžeme se řídit podle norem, zákonů a našich aktiv (jak jsou pro nás cenná, jaké hrozby jim hrozí)

### a. Co chráníme? (AKTIVA)
- Chráníme tzv. aktiva (vše co má pro nás nějakou cenu)
  - **Data**
    - Chráněná ze zákona
    - Provozní data
    - Data zákazníků nebo o zákaznících
    - Informace o provozu firmy
    - Know how
  - **Majetek**
    - Peníze na účtech
    - Výrobní prostředky (hardware, software)
    - Budovy a jejich zařízení
  - **Kontakty, hesla, transakce, soukromé fotky**

### b. Proč to chráníme? (HODNOTA)
- Chceme se vyhnout finančním ztrátám způsobeným:
  - Ztrátou zákazníků
  - Ztrátou know how
  - Pokutami
  - Poškozením/ztrátou majetku
- Chceme si uchovat dobrou pověst, která může být narušena:
  - Defacementem WEB stránek (změna obsahu WEB stránek)
  - Únikem dat
- Chceme se vyhnout porušení zákona (bezúhonnost)

### c. Kde to je?
- Cloud
- Server
- Klienti
- Media
- Síť
- Internet
- Papírové dokumenty

### d. Jak to chráníme? (OPATŘENÍ)
- Šifrování
- Hesla


## 2. Podpora bezpečnostní problematiky v zákonech ČR
Má podporu v zákonech ČR a při veškerých činnostech týkajících se práce s daty a užívání výpočetní techniky je nutné na to pamatovat.

### Zákony:
- **Zákon č. 40/2009 Sb. Trestní zákoník**
  - §230 Neoprávněný přístup k počítačovému systému a nosiči informací
  - §231 Opatření a přechovávání přístupového zařízení a hesla k počítačovému systému a jiných takových dat
  - §232 Poškození záznamu v počítačovém systému a na nosiči informací a zásah do vybavení počítače z nedbalosti
  - §182 Porušení tajemství dopravovaných zpráv
- **Zákon o ochraně osobních údajů**
  - „Osobním údajem jakákoliv informace týkající se určeného nebo určitelného subjektu údajů...“
- **Zákon o kybernetické bezpečnosti (NBÚ)**
  - Základním cílem zákona je zvýšit bezpečnost kybernetického prostoru...
- **GDPR - Obecné nařízení o ochraně osobních údajů**
- **ISO/IEC 2700X (27000, 27001, ... )**
  - Mezinárodní standard definující požadavky na systém managementu bezpečnosti informací.
- **U.S. Federální zákon**
- **SOX (Sarbanes-Oxley Act of 2002)**


## 3. Základní hrozby a obrana proti nim
### Hrozby z vnitřku a z vnějšku organizace
- Neoprávněné získání přístupových údajů
- Odposlech (síť, keylogger, bezdrátové technologie, fyzický)
- Neoprávněný přístup klient/server (zcizení hesla, zneužití chyb, zákeřný kód...)
- Výpadek služby
- Fyzický přístup

### Obrana
- Aplikováním odpovídajících opatření snižujících riziko
- Akceptováním rizika v souladu s kritérii organizace pro akceptování rizik
- Vyhnutí se riziku, eliminaci (zákazem) akcí, které mohou riziko vyvolat
- Sdílením rizika s dalšími stranami (pojišťovny, dodavatelé)

## Výběr zabezpečovacích mechanizmů a odpovídajících nástrojů
- **Autentizace** (jednoznačná identifikace uživatele)
- **Autorizace** (řízení přístupu k datům)
- **Zabezpečení dat proti odposlechu**
- **Ochrana integrity dat**
- **Implementace mechanizmů neodmítnutelné zodpovědnosti**
- **Fyzická bezpečnost**
- **Pravidelné školení uživatelů**
- **Monitorování systému**
- **Bezpečnostní testy**

## Dopad hrozeb na fungování firmy
- **Finanční ztráty**
- **Propad prodejů**
- **Ztráta konkurenceschopnosti**
- **Ztráta dobrého jména**
- **Narušení normálního fungování**
- **Úniky dat**
- **Nedodržení legálních požadavků**

Dopady je vhodné klasifikovat ve 3 stupních:
1. **Očekávaný dopad**
2. **Nejlepší možný dopad**
3. **Nejhorší možný dopad** (maximální ztráty)

*Měly by být promítnuty do finančních nákladů!*


## 4. Popište postup návrhu bezpečnostní politiky

Politiku by neměl vytvářet jediný člověk. S politikou by měl být seznámen každý, koho se týká. Můžeme vycházet z norem, ze šablon nebo z již vytvořených politik.

## Musíme:
- **Klasifikovat aktiva** (informace, které chceme chránit)
- **Identifikovat potenciální hrozby**
- **Definovat úroveň obrany**

Politika nesmí být tak přísná, aby narušovala/omezovala chod společnosti a musí být **vynutitelná**, jinak ji budou zaměstnanci ignorovat.

### Postup:
1. **Vyhodnocení** (co chráníme, kde to je, důležitost, analýza hrozeb)
2. **Tvorba politiky**
3. **Implementace**

Je to základní, **nikdy nekončící cyklus**.

**Vyhodnocení zahrnuje:**
- **Kategorizace dat**
- **Vyhodnocení hrozeb**
- **Analýza potřeb uživatelů**
- **Vyhodnocení bezpečnostních nástrojů**
- **Analýza zhodnocení investic**


## 5. Jaké analýzy je třeba provést ještě před tvorbou bezpečnostní politiky?

## a. Analýza bezpečnostních hrozeb
- **Hrozby z vnitřku**
- **Hrozby z vnějšku**

## b. Analýza návratu investic

## c. Analýza rizik
Identifikuje rizika, která je nutná **kontrolovat** nebo **akceptovat**. Zahrnuje analýzu hodnot aktiv, hrozeb a zranitelností.

### Metody analýzy rizik:
1. **Kvalitativní** (je hodnocena ve škále nebo slovně)
2. **Kvantitativní** (výpočet rizika z frekvence výskytu hrozby a jejího dopadu)

### Výsledkem je určení:
- Jakým hrozbám je IS vystaven
- Jaká jsou **rizika** jednotlivých hrozeb
- Jaké **škody** mohou vzniknout

### Typy analýzy rizik:
- **Orientační** – používá se v rámci kombinované analýzy. Výsledkem je rozhodnutí o vhodném typu analýzy rizik pro daný systém.
- **Elementární** – aplikuje se základní bezpečnost pomocí standardních ochranných opatření. Ochranná opatření jsou vybírána z katalogů.
  - Výhody: **Minimální požadované množství zdrojů** potřebných k implementaci opatření.
  - Nevýhody: **Velké náklady**, pokud je základní úroveň nastavena příliš vysoko, nebo **nedostatečné zabezpečení**, pokud je základní úroveň nastavena příliš nízko.
- **Neformální** – není založen na strukturovaných metodách, ale využívá znalosti a zkušenosti jednotlivců. 
  - Výhody: **Rychlost a finanční nenáročnost**.
  - Nevýhody: **Řešení závislé na odborných znalostech jednotlivců**.
- **Podrobná** – Postup:
  - **Identifikace aktiv**
  - **Ohodnocení aktiv**
  - **Ohodnocení hrozeb**
  - **Odhad zranitelností**
  - **Identifikace existujících bezpečnostních opatření**
  - **Odhad rizika**
  - Výhody: **Jsou identifikována vhodná opatření pro každý systém**.
  - Nevýhody: **Velká časová náročnost a potřeba expertů**.
  - **Nástroje:** CRAMM, CORAS, RA2
  - **Metody:** Matice aktiv, hrozeb, zranitelností
- **Kombinovaná** – nejdříve je provedena orientační AR pro všechny systémy. Na identifikované **významné systémy** nebo systémy vystavené **vysokým rizikům** je aplikována **podrobná AR**, ostatní systémy jsou ošetřeny elementární AR.

## 6. Co by měla obsahovat bezpečnostní politika?

## Prvky bezpečnostní politiky:
- **Průvodní informace od vedení**
- **Účel politiky**
- **Odpovědnosti a pravomoci**
- **Základní pojmy**
- **Informace o vlastnictví a právu přístupu k datům**
- **Pravidla používání výpočetních systémů**
- **Analýza rizik**
- **Opatření**

## Konkrétní aspekty:
- **Řízení přístupu** (identifikace a autentizace, nefiremní počítače, administrace účtů)
- **Email** (šifrování zpráv, privátnost informací, monitorování, archivace zpráv)
- **Přenosová zařízení** (prevence krádeže, odpis zařízení, odposlech, šifrování)
- **Software** (přístupy, aktualizace, licence, antivirová ochrana)
- **Veřejné sítě** (řízení přístupu, šifrování, používání k osobní potřebě)
- **Síť** (směrovače a firewally, rozdělení na zóny, řízení přístupu)
- **Fyzická bezpečnost** (pracovní stanice, servery, přenosné PC, síťová infrastruktura)
- **Auditing a monitorování** (auditní záznamy a logy, IDS, honeypot)
- **Vzdělávání uživatelů**
- **Havarijní plán** (zálohy a obnova, redundance, řešení bezpečnostních incidentů)
- **Disciplinární řízení**


## 7. Uveďte příklady bezpečnostní politiky
- **Firmy**
- **Počítač**
- **Síť**
- **Telefon**
- **Stát**


## 8. Jaké jsou podmínky pro úspěšnou implementaci bezpečnostní politiky?
- **Všeobecná informovanost**
- **Zavedení politiky** (kontrolní mechanismy)
- **Přehodnocování politiky**
- **Politiku by neměl vytvářet jediný člověk**
- **Musí mít podporu od vedení společnosti**
- **Musí s ní být každý seznámen**
- **Musí být vymahatelná** (postihy)


## 9. Uveďte příklady metod autentizace
- **Jméno/heslo** (něco víme)
- **Jednorázové heslo**
- **Symetrická/asymetrická kryptografie** (něco máme)
- **Vícefaktorová autentizace**
- **Klíče**
- **Zámky**
- **Piny**
- **RFID čip**


## 10. Rozeberte problematiku síly hesla

## Faktory ovlivňující sílu hesla:
- **Složitost hesla** (dostatečná délka, znaková sada, náhodnost)

### Útoky:
- **Implicitní** (admin, 0000)
- **Na základě informací o vlastníkovi hesla**
- **Slovníkovým útokem**
- **Hrubou silou**

## Utajení hesla (zabránit úniku aktuálně používaného hesla)
### Útoky:
- **Odposlech hesla v síti**
- **Získání uloženého hesla**
- **Získání hesla z paměti počítače**
- **Získání hesla pomocí sociálního inženýrství**
- **Fyzický útok**

## Ochrana:
- **Změna hesla**
- **Zamykání účtů**
- **Jednorázová hesla** - minimalizuje tyto útoky:
  - **Hádání hesla**
  - **Odposlech hesla**
  - **Získání uloženého hesla**

## Typy jednorázových hesel:
- **HOTP** – na systému se dopředu vygeneruje mnoho hesel a uživatel si je vezme ze systému.
- **TOTP** – hesla se vypočítávají na základě pinu, času a sériového čísla.

## 11. Uveďte metody snížení rizika napadení serveru
- **Penetrační testy**
- **Firewall**
- **Redundance hardware**
- **IDS (Intrusion Detection System)**
- **IPS (Intrusion Prevention System)**
- **Certifikáty a klíče**
- **SSL protokol** (Secure Sockets Layer) – zajišťuje zabezpečení komunikace šifrováním a autentizaci komunikujících stran.
- **Zálohování**
- **Zabezpečení vůči již známým chybám**
- **Určovat jednotlivě práva každému uživateli**
- **Mazat/znepřístupňovat funkce, které jsou zbytečné**
- **Kontrola pohybu a přístupu na server**
- **Logování všeho**


## 12. Uveďte metody snížení rizika napadení klienta
- **Firewall**
- **Antivir**
- **Aktualizace softwaru**
- **SSL**
- **Zálohování**
- **Spouštění klientů v sandboxu**
- **Spuštění ve VirtualBoxu**
- **OS spuštěného z přenosného média**


## 13. Uveďte mechanismy zabezpečení souborového systému
- **Nastavení práv uživatele** před neoprávněným přístupem
- **ACL (Access Control Lists)** – subjekty sdružovány do skupin
- **Moderní souborový systém se žurnálováním** (NTFS, Unix - ext4)
- **Moderní operační systém** pracující se souborovými systémy s autorizačními mechanismy.
  - Tradiční UNIX mechanizmy řízení přístupu (vlastníci, skupiny, přidělení práv)
  - **ACL (seznam oprávnění)**
- **SUID a SGID bity** – mohou představovat bezpečnostní riziko.
  - **SUID bit** – programy nesmí mít nastavena práva zápisu pro ostatní uživatele.
  - **SGID bit** – programy mají po spuštění práva vlastníka odpovídajícího souboru.
- **Souborové systémy připojované po síti** musí být připojovány s parametry **nosuid** a **noexec**.


## 14. Firewall
- **Omezit přístup ze sítě** pomocí správného nastavení
- **Povolit přístup jen službám**, které nabízíme
- **Filtrování podle IP adres**
- **Směrem ven povolit jen protokoly klientů**, se kterými pracujeme

## Rozdělení firewallů podle fungování:
- **Paketový (IP filtr)**
- **Stavový firewall**
- **Aplikační firewall (WEB)** – slouží k detekci/blokování útoků hlavně na aplikační úrovni.

## Další dělení:
- **Síťový**
- **Lokální**

### Požadavky na WAF (Web Application Firewall):
- **Schopnost chránit web server** proti nejčastějším útokům
- **Ochrana před útoky hrubou silou** na autentizační mechanismy
- **Automatická aktualizace databáze útoků**
- **Možnost konfigurace pro specifické problémy**
- **Schopnost pracovat ve třech režimech**:
  1. **Blokace logování**
  2. **Pouze logování**
  3. **Pasivní režim**
- **Možnost monitorování HTTPS spojení**
- **Podpora různých systémů kódování znaků**
- **Podpora XML (Extensible Markup Language)**
- **Velmi malá latence**
- **Podpora různých operačních systémů**

## 15. Auditing a logování
Logování je základním opatřením, které slouží mimo jiné k **detekci bezpečnostních událostí** nebo k jejich **následné analýze**. Logy by se měly **shromažďovat v centrálním úložišti**.

### Z pohledu bezpečnosti je vhodné logovat alespoň následující události:
- **Přihlášení k účtu** (úspěšné/neúspěšné)
- **Změny v účtech**, resp. **management uživatelů** (úspěšné/neúspěšné)
- **Přístupy k objektům** (úspěšné)
- **Změny politik** (úspěšné/neúspěšné)
- **Použití privilegií** (úspěšné/neúspěšné)
- **Systémové události** (úspěšné/neúspěšné)


## 16. Problematika šifrování dat

### Metody šifrování:
- **Šifrování jednotlivých souborů** – zaheslování do zip souboru
  - **Musíme znát šifru** (např. PGP - šifrování emailů)
- **Šifrování celých souborových systémů/disků** – provádí se transparentně
  - **Používané nástroje:** TrueCrypt, BitLocker
- **Vernamova šifra** – neprolomitelná metoda šifrování
- **Symetrická kryptografie** – stejný klíč pro šifrování i dešifrování (např. DES)
- **Asymetrická kryptografie** – jeden klíč pro šifrování, druhý pro dešifrování (např. RSA)

### Používané programy:
- **7zip**
- **PGP**
- **TrueCrypt**

**Integritu souborů** lze zajistit pomocí software, který **pravidelně vytváří a aktualizuje databázi hashí** v systému. Na základě těchto hashí lze reportovat **změny v souborech**.


## 17. Bezpečnost webového prohlížeče

### Možné způsoby napadení:
- **Malware v OS**
- **Spouštěcí soubor nebo komponenty prohlížeče hacknuty**
- **Pluginy prohlížeče hacknuty**
- **Síť je napadena**

### Ochrana:
- **Aktualizace**
- **Specializované prohlížeče**
- **Používání stránek s HTTPS** (a pouze ověřených stránek)
- **Omezení funkcí prohlížeče** (cookies, pluginy, Flash Player)


## 18. Bezpečnost komunikace

### Ochrana před únikem informací:
- **Šifrovaná komunikace** – PGP
- **Nekomunikovat na veřejných sítích**
- **Nasazení prostředků pro eliminaci podezřelých emailů**
- **Ochrana před viry v e-mailech** (phishing)

### Bezpečné stahování obsahu:
- **Přes virtuální systém** (např. VirtualBox)
- **Nabootování systému z DVD**
- **Použití sandboxového prostředí** (např. SandBoxie)

## 19. Lokální ověření zabezpečení

Jednou z možností je ověřit zabezpečení **zevnitř** (tzv. **whitebox**), kdy je prověřováno nastavení resp. konfigurační soubory jednotlivých zařízení podle metodiky (**CIS benchmarky**):

### Metody snížení rizika napadení klienta:
- **Analýza zvláštního chování systému**
- **Kontrola systémových SUID/SGID aplikací a jejich případná eliminace**
- **Ověření aktuálnosti použitých bezpečnostních záplat** všech balíků a jádra
- **Ověření uživatelů**
- **Kontrola konfigurace používaných služeb**
- **Kontrola bezpečného úložiště**
- **Kontrola firewallu**

Další možností je **sken zranitelností**, kdy jsou jednotlivá zařízení nebo celé sítě skenovány automatizovaným skenerem, který v první fázi **detekuje jednotlivé síťové služby** a poté se snaží pomocí **specifických testů** odhalit zranitelnosti (**např. OpenVAS**).


## 20. Rozeberte problematiku monitorování a detekce útoku

### **Logování**
- **Online analyzátor logů**
- **Šikovný útočník po sobě logy smaže**, což může ztížit analýzu.

### **IDS - Intrusion Detection System**
Systémy detekce průniku – hardware nebo software, který **analyzuje provoz**.

- **Dva typy IDS:**
  - **Zpomaluje provoz, ale nic mu neunikne** – pokud se rozbije, síť nebude fungovat.
  - **Nezdržuje vůbec, ale může ztrácet pakety**, když nestíhá.

- **Útok na IDS:** zahlcení IDS **DDoS útokem**.
- **Snort** – pokud zjistí hrozbu, vytvoří pravidlo, které **blokuje přijímání** z konkrétní IP adresy.

### **Honeypoty**
- **Cíl:** svést útok na honeypoty a získat o útočníkovi více informací.
- **Simuluje běžné systémy**, ale slouží **jen k analýze útoků**.
- **Použití démonů**, které simulují běžné služby umožňuje **detekci a analýzu útoků**.
- **Honeynety** – celé sítě honeypotů, které **neobsahují žádné skutečné služby**.
- **Používány hlavně k detekování malwaru** a analýze jeho chování.

### **SIEM - Security Information and Event Management**
- **Agregace a korelace dat**
- **Generování poplachů**
- **Shoda s normami a zákonnými požadavky**
- **Retence bezpečnostních dat**
- **Forenzní analýza**
- **Řídící konzole pro správu bezpečnostních událostí**

## 21. IDS/IPS
**Intrusion Detection System (IDS)** a **Intrusion Prevention System (IPS)** jsou systémy sloužící k **detekci** a **prevenci útoků** v síti.

## Rozdělení IDS:
### Podle chráněné vrstvy:
- **Síťové IDS** – monitoruje síťový provoz až do **transportní vrstvy**.
- **Aplikační IDS** – detekuje hrozby v **webových aplikacích, databázích** apod.

### Podle metod detekce:
- **IDS založené na pravidlech** (signaturách) – detekuje známé útoky podle **vzorců**.
- **IDS založené na profilu** (detekce anomálií) – rozpoznává **neobvyklé chování** místo předdefinovaných hrozeb.

## Architektura IDS:
1. **Senzor, agent** – sbírá a analyzuje síťovou komunikaci.
2. **Řídící centrum (konzole)**:
   - Správa dat
   - Generování výstrahy
   - Korelace událostí
   - Monitorování ostatních komponentů

## Způsoby zapojení IDS do sítě:
- **Zrcadlení portu** (mirroring, SPAN)
- **Větvení sítě** (network TAP)

## Způsoby tvorby pravidel:
- **Negative security model** (blacklist)
- **Positive security model** (whitelist) – méně zatěžuje systém a lépe chrání před **neznámými útoky**.

### Problémy IDS:
- **Falešné pozitivní detekce**
- **Vysokorychlostní prostředí** může zpomalit analýzu dat.
- **Potíže s detekcí neznámých hrozeb**.


## 23. Reakce na incidenty
## **Cíle reakce na incident:**
- **Potvrdit nebo vyvrátit**, zda k incidentu skutečně došlo.
- **Shromáždit přesné a objektivní informace**.
- **Nastavit mechanismy získávání a zpracování důkazů**.
- **Minimalizovat dopady incidentu** na organizaci.
- **Zachovat privátnost informací** garantovanou zákonem.
- **Umožnit stíhání útočníků**.
- **Vytvořit podrobné protokoly a doporučení**.

## 24. Metodologie reakce na incidenty

## **Postup reakce na incident:**
1. **Příprava** (preventivní opatření)
2. **Detekce incidentu**
3. **Počáteční reakce** – rychlá analýza a zachycení relevantních informací.
4. **Formulace strategie** k řešení incidentu.
5. **Duplikace kritických dat** – zálohování důkazních materiálů.
6. **Pátrání** – analýza příčin a dopadů incidentu.
7. **Implementace bezpečnostních opatření** na eliminaci problému.
8. **Monitorování sítě** – sledování výskytu dalších anomálií.
9. **Obnova** – postupné zavedení normálního provozu.
10. **Protokolování** (dokumentace každého kroku).
11. **Poučení** – vytvoření doporučení pro prevenci podobných incidentů v budoucnu.


## 25. Metodologie duplikace dat v rámci reakce na incidenty

### **Rozhodování o způsobu získání důkazů:**
- **Fyzická kopie dat** nebo **online získání důkazů**?
- **Analýza živých dat** vs. **analýza duplikátu systému**.

### **Data, která je třeba zachytit před duplikací systému:**
- **Obsah registrů a vyrovnávací paměti**
- **Obsah operační paměti**
- **Informace o síťových spojeních**
- **Informace o běžících procesech**
- **Obsah disků**
- **Obsah výměnných a zálohovacích médií**

### **Metody duplikace systému:**
1. **Vyjmutí média a duplikace na jiném počítači**.
2. **Duplikace na napadeném systému** pomocí připojeného pevného disku.
3. **Uzavřené síťové spojení** na vyšetřovací počítač.

### **Důležité faktory při duplikaci důkazů:**
- **Každý bit originálního média musí být zachován**.
- **Musí být zachyceny všechny sektory**, včetně neobsazeného prostoru disku.
- **Aplikace nesmí žádným způsobem modifikovat původní data**.
- **Musí být zajištěna ochrana vytvořeného obrazu** (kontrolní součet nebo digitální podpis).

## 26. ISMS a normativní základna

### **Co je ISMS?**
**Information Security Management System (ISMS)** – systém řízení bezpečnosti informací.

### **Hlavní cíle ISMS:**
- **Chránit informační aktiva organizace**.
- **Implementovat opatření ke snížení rizik**.
- **Monitorovat bezpečnostní opatření** a zajistit jejich efektivitu.
- **Pravidelně zlepšovat bezpečnostní strategii**.

### **Kroky implementace ISMS:**
1. **Identifikace informačních aktiv** a jejich bezpečnostních požadavků.
2. **Analýza bezpečnostních rizik** a jejich mitigace.
3. **Výběr vhodných opatření** k eliminaci neakceptovatelných rizik.
4. **Monitorování, udržování a zlepšování bezpečnostních opatření**.

### **Metody řízení rizik:**
- **Identifikace aktiv a jejich hodnoty**.
- **Analýza hrozeb a zranitelností**.
- **Vyhodnocení dopadů bezpečnostních incidentů**.

### **Faktory úspěšné implementace ISMS:**
- **Silná podpora vedení organizace**.
- **Kultura informovanosti o bezpečnosti**.
- **Efektivní proces řízení incidentů**.
- **Business continuity plán**.
- **Systém metrik pro měření výkonnosti ISMS**.

### **Normy ISO/IEC týkající se ISMS:**
- **ISO 27000** – celkový přehled a definice termínů.
- **ISO 27001** – požadavky na ISMS.
- **ISO 27002** – implementace opatření.
- **ISO 27003** – návod k implementaci ISMS.
- **ISO 27004** – metriky ISMS.
- **ISO 27005** – řízení rizik.

