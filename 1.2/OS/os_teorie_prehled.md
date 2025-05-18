
# Otázky a odpovědi k operačním systémům

### 1. Definujte, co je to operační systém a k čemu slouží.
Operační systém (OS) je základní programové vybavení počítače, které zajišťuje správu hardwarových prostředků a poskytuje služby aplikacím. Umožňuje uživateli interagovat s počítačem a spouštět programy.

### 2. Jaké základní funkce má OS?
- Správa procesů
- Správa paměti
- Správa souborového systému
- Správa vstupně-výstupních zařízení
- Správa uživatelů a bezpečnosti
- Poskytování uživatelského rozhraní

### 3. Co má na starosti interpreter příkazů?
Interpreter příkazů (shell) zajišťuje zadávání a provádění příkazů od uživatele nebo skriptů. Překládá je do instrukcí, kterým rozumí operační systém.

### 4. Jaké známe druhy OS podle způsobu použití nebo zařízení?
- Desktopové (např. Windows, macOS)
- Serverové (např. Linux Server, Windows Server)
- Mobilní (např. Android, iOS)
- Vestavěné systémy (např. RTOS)
- Distribuované systémy
- Reálného času (RTOS)

### 5. Jaké známe vrstvy OS?
- Vrstvy správy hardware
- Jádro (kernel)
- Systémová volání
- Uživatelské rozhraní
- Aplikační rozhraní

### 6. Uveďte dělení OS podle správy uživatelů, počtu spuštěných programů, podle grafického rozhraní.
- Dle správy uživatelů: jedno-uživatelské, více-uživatelské
- Dle počtu úloh: monotasking, multitasking
- Dle rozhraní: CLI (příkazový řádek), GUI (grafické rozhraní)

### 7. Co je to instrukce a cyklus OS? Jak spolu souvisí? Co vykonávají?
Instrukce je základní příkaz pro procesor. Cyklus OS označuje provedení sady instrukcí nutných pro správu procesů, paměti a zařízení. Instrukce tvoří jednotlivé kroky cyklu.

### 8. Popište, jaké byli první počítače. Jejich velikost, způsob ovládání, ... O jakém roce se přibližně bavíme?
První počítače jako ENIAC vznikly ve 40. letech 20. století, zabíraly celé místnosti, ovládaly se pomocí spínačů, děrných štítků. Neměly OS ani paměť v dnešním smyslu.

### 9. Uměly první počítače multitasking a multiuser?
Ne, byly schopné vykonávat jeden úkol pro jednoho uživatele v daném čase.

### 10. Jmenujte alespoň 5 OS používaných před rokem 1995.
- MS-DOS
- Unix
- AmigaOS
- Macintosh Software System 
- Windows nt 3.1

### 11. Jak spolu souvisí Unix a Linux?
Linux je inspirován Unixem a je jeho open-source klonem. Unix byl komerční a uzavřený, zatímco Linux je svobodný a komunitně vyvíjený.

### 12. Jmenujte 2 OS bez grafického prostředí.
- MS-DOS
- Arch Linux (minimální instalace)

### 13. Co je to proces?
Proces je instance spuštěného programu. Obsahuje informace o aktuálním stavu běhu programu.

### 14. Co je to program?
Program je pasivní sada instrukcí uložená na disku, která se vykonává jako proces po spuštění.

### 15. Vysvětlete rozdíl mezi procesem a programem.
Program je pasivní, proces je aktivní. Program je uložený kód, proces je běžící kopie tohoto kódu.

### 16. Co je to Process Control Block?
Je to datová struktura uchovávající informace o procesu: ID, stav, registry, plánování apod.

### 17. Jaké informace obsahuje Process Control Block?
- ID procesu
- Stav procesu
- Registry CPU
- Plánovací informace
- Informace o paměti

### 18. Jaké stavy má proces?
- Nový (new)
- Připravený (ready)
- Běžící (running)
- Čekající (waiting)
- Ukončený (terminated)

### 19. Popište stavový model procesu.
Model zobrazuje přechody mezi jednotlivými stavy procesu v čase, jak se mění během běhu systému.

### 20. Jak vzniká proces?
Proces vzniká spuštěním programu pomocí systémových volání (např. fork/exec v Unixu).

### 21. Jakým způsobem může proces skončit?
- Normálně (return)
- Chybou (segmentation fault)
- Signálem (kill)

### 22. Co je to vlákno a k čemu ho použijeme?
Vlákno je „lehký proces“, sdílí paměť s ostatními vlákny téhož procesu. Používá se pro paralelismus.

### 23. Popište, jak fungují aplikace s více vlákny.
Více vláken může běžet paralelně nebo pseudoparalelně. Dělí se o data, ale každé má svůj stav.

### 24. Jakých vlastností a kvalit se snažíme docílit při plánování procesů?
- Efektivita CPU
- Rychlá odezva
- Spravedlnost
- Vysoká propustnost

### 25. Co dělá dispečer?
Dispečer přepíná mezi procesy, přiděluje CPU procesům dle plánu plánovače.

### 26. Co je to preemptivní plánování?
Plánování, kdy běžící proces může být předčasně přerušen jiným procesem s vyšší prioritou.

### 27. Co je to nepreemptivní plánování?
Běžící proces dokončí běh, než je procesor přidělen jinému procesu.

### 28. Jaké známe fronty?
- Fronta připravených
- Fronta čekajících
- Fronta zařízení

### 29. Popište frontu FIFO, FCFS, Round Robin, SPN, SRT, Prioritní frontu.
- FIFO/FCFS – První přišel, první běží
- Round Robin – rotující, každý má časový kvantum
- SPN – nejkratší úloha první
- SRT – nejkratší zbývající čas
- Prioritní – dle priority

### 30. Jaká rizika přináší prioritní fronta? Co může zastavit chod počítače?
Nízkoprioritní proces může být neustále odkládán (stárnutí). Může dojít k uváznutí (deadlock).

### 31. Co je to kritická sekce?
Kód, který přistupuje ke sdíleným datům a nesmí být prováděn více procesy najednou.

### 32. Problémy, které mohou při práci s kritickou sekcí nastat?
- Deadlock
- Race condition
- Starvation

### 33. Co je to uváznutí, blokování, stárnutí?
- Uváznutí: procesy se navzájem zablokují
- Blokování: čekání na uvolnění prostředku
- Stárnutí: proces se nikdy nedostane na řadu

### 34. Vysvětlete podmínky bezpečnosti, životnosti a spravedlnosti ve vztahu ke kritické sekci.
- Bezpečnost – nikdy více procesů v kritické sekci současně
- Životnost – každý proces má šanci se do sekce dostat
- Spravedlnost – žádné nadržování procesům

### 35. Popište Petersonův algoritmus, Pekařův algoritmus, Semafor, Monitor
- Peterson – pro 2 procesy, používá příznaky
- Pekař – rozšířený, inspirován lístky v obchodě
- Semafor – proměnná řízená wait/signal
- Monitor – synchronizační objekt s vnitřní logikou

### 36. Jaké 3 problémy synchronizace procesů mohou nastat?
- Deadlock
- Race condition
- Starvation

### 37. Popište princip Producent a konzument, Model a obraz, Čtenáři a písaři, Hladoví filosofové.
- Producent a konzument – sdílený buffer
- Model a obraz – oddělení výpočtu a zobrazení
- Čtenáři a písaři – konflikt při čtení/zápisu
- Hladoví filosofové – sdílení prostředků (vidliček)

### 38. Popište, co je to deadlock.
Stav, kdy více procesů čeká na prostředky držené jinými, čímž dojde k zablokování systému.

### 39. Popište, jak může vzniknout deadlock.
Splnění 4 podmínek: vzájemné vyloučení, držení a čekání, neodnímatelnost, cyklické čekání.

### 40. Uveďte 3 příklady deadlocku z běžného života.
- Dvě auta na úzké cestě
- Dva lidé s jednou vidličkou a jedním nožem
- Výtah blokovaný čekáním

### 41. Uveďte 4 metody řešení deadlocku.
- Prevence
- Vyhýbání
- Detekce
- Zotavení

### 42. Jak byste zajistili prevenci deadlocku?
Zrušením některé z podmínek deadlocku, např. povolením odnímání prostředků.

### 43. Jak lze řešit deadlock?
- Detekovat a přerušit cyklus
- Reboot systému
- Ručně zasáhnout
### 44. Vyjmenujte 5 technik pro přidělování paměti.
- Přidělování souvislé oblasti paměti
- Přidělování paměti po sekcích
- Dynamické přemísťování sekcí
- Stránkování paměti
- Segmentace paměti

### 45. Popište přidělování souvislé oblasti paměti, jeho výhody a nevýhody.
Přidělení jedné souvislé oblasti paměti pro proces.
**Výhody:** jednoduché, rychlé adresování.
**Nevýhody:** vnější fragmentace, omezená flexibilita.

### 46. Popište přidělování paměti po sekcích, jeho výhody a nevýhody.
Paměť je rozdělena na logické sekce (kód, data, zásobník).
**Výhody:** lepší organizace paměti.
**Nevýhody:** nutnost správy sekcí, může vznikat fragmentace.

### 47. Popište dynamické přemísťování sekcí, jeho výhody a nevýhody.
Přemisťování sekcí v paměti za běhu pro snížení fragmentace.
**Výhody:** redukuje fragmentaci.
**Nevýhody:** složitost, časová náročnost.

### 48. Popište stránkování paměti, jeho výhody a nevýhody.
Paměť rozdělena na stránky pevné velikosti.
**Výhody:** eliminuje vnější fragmentaci, efektivní správa.
**Nevýhody:** vnitřní fragmentace, režie při překladu adres.

### 49. Popište stránkování paměti na žádost, jeho výhody a nevýhody.
Stránky se načítají do paměti až při prvním přístupu.
**Výhody:** úspora paměti, rychlejší start.
**Nevýhody:** zpoždění při načítání, složitější správa.

### 50. Popište segmentaci paměti, jeho výhody a nevýhody.
Paměť rozdělena na logické segmenty různé velikosti.
**Výhody:** lepší přizpůsobení programu.
**Nevýhody:** vznik vnější fragmentace.

### 51. Co je to vnitřní/vnější fragmentace paměti? Jak ji můžeme řešit?
- **Vnitřní fragmentace:** nevyužitý prostor uvnitř přidělené paměťové oblasti.
- **Vnější fragmentace:** rozdrobení volné paměti na malé části.
**Řešení:** stránkování (pro vnější fragmentaci), kompakce paměti.

### 52. Co je to bootování OS?
Proces spuštění počítače a načtení operačního systému do paměti.

### 53. Popište proces bootování krok po kroku. Vysvětlete, co se odehrává v jednotlivých krocích.
1. Zapnutí napájení.
2. POST – testování hardwaru.
3. Načtení bootloaderu (MBR nebo UEFI).
4. Načtení jádra OS do paměti.
5. Inicializace OS.
6. Spuštění uživatelského rozhraní.

### 54. Co je to POST v kontextu bootování? S jakým hardwarem konkrétně POST interaguje?
Power-On Self Test – základní testy RAM, CPU, disků, klávesnice a dalších zařízení.

### 55. Vysvětlete rozdíl Firmware, BIOS, UEFI.
- **Firmware:** nízkoúrovňový software v hardware.
- **BIOS:** tradiční firmware pro inicializaci počítače.
- **UEFI:** moderní náhrada BIOSu s rozšířenými funkcemi.

### 56. Co je to Flashování? Jaká má rizika?
Aktualizace firmwaru v paměti flash.
**Rizika:** selhání při aktualizaci může způsobit nefunkčnost zařízení.

### 57. Co je to Master Boot Record?
První sektor pevného disku obsahující bootloader a tabulku oddílů.

### 58. Co se stane, pokud Master Boot Record chybí? Jaké máme možnosti záchrany?
Počítač nenabootuje OS.
**Možnosti:** oprava MBR pomocí nástrojů, obnovení ze zálohy.

### 59. Co je to GUID Partition Table? Jaké má výhody oproti MBR?
Moderní tabulka oddílů s podporou větších disků a více oddílů.

### 60. Definujte paměťové médium a jeho druhy.
Zařízení pro uchovávání dat – HDD, SSD, USB, optické disky.

### 61. Jaký je rozdíl mezi volatilní a nevolatilní pamětí?
- **Volatilní:** data se ztratí po vypnutí (RAM).
- **Nevolatilní:** data jsou uchována i bez napájení (HDD, SSD).

### 62. Co jsou to oddíly (partitions)?
Logické části disku s vlastním souborovým systémem.

### 63. Na jaké fyzické části dělíme harddisk?
- Hlavici (head)
- plotna
- ridici pcb

### 64. Co je to souborový systém?
Struktura pro organizaci a ukládání souborů na disku.

### 65. Jaké máme požadavky na efektivní souborový systém?
- Rychlost
- Spolehlivost
- Efektivní využití místa
- Podpora přístupových práv

### 66. Co je to adresářová struktura?
Hierarchická organizace souborů do složek.

### 67. Jaké známe druhy adresářových struktur?
- Jednoúrovňová
- Dvouúrovňová
- Stromová
- Acyklická

### 68. Popište jednoúrovňovou a dvouúrovňovou strukturu.
- Jednoúrovňová: všechny soubory v jedné složce.
- Dvouúrovňová: oddělení adresářů pro různé uživatele.

### 69. Popište stromovou a acyklickou strukturu.
- Stromová: hierarchie s jedním kořenem.
- Acyklická: složky mohou mít více rodičů, bez cyklů.

### 70. Definujte, co je to adresář a co se děje při otevírání adresáře.
Adresář je složka obsahující soubory nebo další složky.
Při otevření se načtou informace o obsahu adresáře.

### 71. Vysvětlete, co je to superblok a inod.
- Superblok: metadata o souborovém systému.
- Inod: struktura popisující soubor (umístění, práva).

### 72. Uveďte 3 způsoby, jakými lze organizovat a ukládat obsah souboru na disk.
- Spojované seznamy (linked allocation)
- Indexové bloky
- Kontinuální alokace

### 73. Co víte o FAT systému? Jaká jsou omezení systému? Jak probíhá ukládání souborů ve FAT systémech?
FAT používá tabulku pro správu bloků.
**Omezení:** max velikost souboru, omezené funkce.
Ukládání: soubory jsou řetězce bloků přes tabulku FAT.

### 74. Co je to Fragmentace v souborových systémech?
Rozdělení souboru na nesouvislé bloky.

### 75. Co je to žurnálovací systém? Jaké známe? Čím se liší od FAT systémů?
Systém, který zaznamenává změny před jejich provedením (např. ext3, NTFS).
Lepší odolnost vůči chybám.

### 76. Jaké souborové systémy používáme pro flash paměti? Jaké vlastnosti jsou nezbytné?
Např. exFAT, FAT32.
Nutné minimalizovat zápisy a podpora rychlého přístupu.

### 77. Popište, co je to port, sběrnice (bus) a řadič (host adapter).
- Port: rozhraní pro připojení zařízení.
- Sběrnice: kanál pro přenos dat.
- Řadič: hardware spravující komunikaci.

### 78. Úkoly (příklady práce s Linuxem)
1. Pomocí GRUB Customizeru zvyšte prodlevu GRUB na 15 sekund a změňte startovací obrazovku.
2. Pomocí GParted najděte podporované souborové systémy a vytvořte 2 nové partitions s různými souborovými systémy.
3. Vypište všechny diskové oddíly pomocí programů fdisk a gdisk, vytvořte nový oddíl, po vytvoření změňte její velikost a poté ji odstraňte.
4. Pomocí příkazu du a jeho přepínačů zobrazte velikost a poslední změnu souborů a složek.
5. Pomocí příkazu df a jeho přepínačů zobrazte volná místa a celkový součet volného místa.
6. Úkol: najděte jaké porty a hexadecimální adresy má WIN98 na https://copy.sh/v86/?profile=windows98
7. Použití příkazů v Bash

### 79. Řešení praktických úkolů

1. **GRUB Customizer - zvýšení prodlevy a změna obrazovky**
   - Otevři GRUB Customizer (`sudo grub-customizer`).
   - V záložce "General settings" nastav "Timeout" na 15 sekund.
   - V záložce "Appearance settings" změň startovací obrazovku (Background image).
   - Ulož změny a aktualizuj GRUB (`sudo update-grub`).

2. **GParted - vytvoření nových partitions**
   - Spusť GParted (`sudo gparted`).
   - Vyber disk, klikni pravým tlačítkem na nepřidělené místo.
   - Zvol "New" a vyber souborový systém (např. ext4, ntfs).
   - Opakuj pro druhou partition s jiným systémem.
   - Potvrď aplikaci změn.

3. **Práce s fdisk a gdisk**
   - `sudo fdisk -l` vypíše oddíly.
   - `sudo gdisk /dev/sdX` pro správu GPT disků.
   - V `fdisk` nebo `gdisk` vytvoř nový oddíl příkazem `n`.
   - Změna velikosti není přímo v fdisk/gdisk možná, upravuje se pomocí resize nástrojů (např. `resize2fs`).
   - Odstranění oddílu příkazem `d`.
   - Nezapomeň změny uložit příkazem `w`.

4. **Příkaz du - zobrazení velikosti a data změny**
   - `du -h --time` zobrazí velikost a čas poslední změny.
   - Pro složky: `du -sh /cesta/k/adresari`.

5. **Příkaz df - volné místo**
   - `df -h` zobrazí přehled využití disků v lidsky čitelné formě.
   - Zobrazí dostupné a použité místo.

6. **Najít porty a hex adresy Windows 98**
   - Na https://copy.sh/v86/?profile=windows98 spusť Win98.
   - Použij nástroje jako `netstat`, `device manager` nebo přímý průzkum hardwaru.
   - Nebo konzultuj dokumentaci HW pro Win98.

7. **Použití příkazů v Bash**
   - Přehled základních příkazů: `ls`, `cd`, `cp`, `mv`, `rm`, `grep`, `awk`, `sed`, `chmod`, `chown`, `ps`, `top`, `kill`.
   - Skriptování: tvorba `.sh` souborů s posloupností příkazů.
   - Spouštění skriptů: `bash skript.sh` nebo `./skript.sh` (po nastavení práv).

