==1. Fyzicka vrstva== ![[Pasted image 20250507234541.png]]
bit 
	- zakladni prvek (1 nebo 0)
bajt 
	- osm bitu (data)
oktet 
	- osm bitu (adresy, atd)
ramec 
	- data co putuji po siti
paket 
	- skupina dat co poslime po siti
Encapsulation & Decapsulation 
	- proces pridavani hlavicek apod.
LAN (Local Area Network)
	- ciste lokalni sit
	- pr. switch (prepinac)
WAN (Wide Area Network)
	- mezi sitemi
	- pr. router (smerovac)
Standarty 802.
	- 1 - linkova vrstva
	- 1Q - VLAN
	- 2 - LCC
	- 3 - Ethernet (mac)
	- 11 - bezdrat
	- 1x - authentizace (RADIUS)
Smer
	- Simplex - jeden smer
	- Half-duplex - oboustrane, ale ceka se
	- Full-duplex - oboustrana
**Metalika**
Cat5e
	- 1gb/s, 100m, 100-125Mhz
Cat6
	- 10gb/s, 37m, 200-250Mhz
Cat6A
	- 10gb/s, 100m, 500Mhz
UTP (Unshielded Twist Pair)
	- no shield
STP (Shielded Twist Pair)
	- shield draty
FTP (Foiled Twist Pair)
	- taky jako S/UTP
	- shield na kabelu
S/STP
	- shield vsude
RJ-45
	- pro datove site
RJ-11 a RJ-12
	- pro telefon
Patch Cord
	- propojovaci kabel
Utlum sygnalu (db/km)
	- zalezi na
		- impedance
		- ruseni
		- delka vodice
		- frekvence
Opakovac
	- repeater
	- proste zesiluje signal
Rozbocovac
	- hub
	- proste posle vse na vsechny porty az na ten ze ktereho to prislo
Baud rate
	- frekvence zmeny signalu
Bit rate
	- kolik bitu za sekundu se prenese
Bit time (bit cycle)
	- doba potrebna pro prenos jednoho bitu
FEC (Fordward-Error-Correction)
	- kontrolni bity
Modulace
	- transformace z digitalniho na fyzicky signal a naopak
	- pr.

| -3V | 00  |
| --- | --- |
| -1V | 01  |
| +1V | 10  |
| +3V | 11  |
**Optika**
Jednovidovy
	- resi jen jeden signal
	- az 10 mikrometru 
	- velmi nizky utlum (klidne i 40 az 80 km)
	- stejna doba sireni
	- 1310 nebo 1550 nanometru
	- zdroj svetla je laser
Vicevidovy
	- resi vice signalu 
	- 50 az 62 mikrometru
	- vetsi utlum (kratsi vzalenost)
	- ruzna doba sireni
	- 850 az 1310 nanometru
Lambda (λ - fucking half life blyat)
	- vlnova delka (barva)
Index lomu
	- kolikrat se svetlo zpomaly (necistoty atd)
	- ve vakuu 1
	- ve optice 1,45
	V = c/n
	rychlost svetla v materialu = rychlost svetla ve vakuu/index lomu
Modulace
	- neni
	- svetlo je 1
	- tma je 0
Je potreba
	- Emitor (vysilac) *ledka pro predstavu*
	- Prenosove medium *opticky kabel*
	- Detektor *fotodioda*
Dark fiber
	- nezapnuty spoj
Struktura optickeho kabelu
	- Stred
		- kremikove sklo
	- okolo skla
		- vysoce odrazlivy material
	- plastovy obal
		- casto pvc
	- dale casto nejaky material na ochranu
		- kevlar do vysky
		- gel do horizontalu
Opticky kabel
	- sklada se z "mikrotrubicek"
		- trubickou rozdeleny vlakna
		- existuji i bez mikrotrubicek
			- casto 12 vlaken
	- deli se dne pouziti
		- venkovni
		- vnitrni
		- zavesne, atd.
	- typicky obsahuje 96 az 144 vlaken
		- existuji i vyjimky jako treba az 300
	- multiplex
		- casem (TDM)
		- barvou (WDM)
		- Full-duplex (proste vice vlaken)
**Bezdrat**
2,4Ghz
	- 13 kanalu
	- sirka 20Mhz
	- rozdil 5Mhz
	- sirka pasma je 12,5 cm
5Ghz
	- 140 kanalu
	- sirka 20Mhz
	- vykon 1W
	- sirka pasma je 6 cm
SSID
	- nazev site
WLAN
	- wireless lan
	- defakto broadcast bez povinosti prijeti (takze radio)
Beam forming
	- smerovani signalu na zarizeni
	- "you know what, fuck you, cancer beam"
Channel bounding
	- spojovani kanalu, pro rychlejsi komunikaci
MIMO
	- vysilani vice uzivatelum na wifi naraz (jinak proste vzdy vybere jednoho, tomu vysila)
Infrastruktura
	- BSS - Jeden AP
	- ESS - vice AP (10-15% maximalni prekryti)
	- multi ssid managment/vice AP roaming
		- takovyto automaticky prepinani me AP kdyz jdes
		- WLC
Scanning
	- Active
		- vysilam a ptam se jestli tam nejaka wifi je (zere baterku)
	- Passive
		- posloucham jestli nekdo zacne vysilat oznameni o tom ze tam je (pomale)
Zabezpeceni
	- WEP
		- starej, davno prolomenej
	- WPA
		- sifrovane
	- WPA enterprise
		- WPA+RADIUS
Zpusob navazani spojeni
	- Sondovani (zeptam se na SSID)
	- Zvolim si jake SSID
	- Vyjednani o rychlostech/standartech
	- Dotaz na kanal
	- Autentizace
==2. Linkova vrstva==
