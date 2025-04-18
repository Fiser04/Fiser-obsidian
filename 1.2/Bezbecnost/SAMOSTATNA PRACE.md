1) **Autentizační mechanizmy**
a) Vyjmenujte co nejvíce v současnosti používaných autentizačních mechanizmů (jméno heslo,
otisk prstu, …).
	- jmeno heslo, kod, gesto, kontrolni otazky, otisk prstu, sken obliceje, sken zil, sken ocniho pozadi, hlas, pristupova fleska, pristupova karta, viceklicove reseni
b) Seznamte se s nimi, a stručně popište jejich principy fungování.
	- jmeno heslo
		- uzivatel ma unikatni heslo a jmeno, heslo se zasifruje a zkontroluje se s databazi
	- kod
		- jednorazovy kod, casto poslany na email nebo sms
	- gesto
		- znak ktery si uzivatel "nakresli" a pak se jen kontroluje s ulozenym
	- kontrolni otazky
		- otazka na kterou jen osoba zna odpoved 
		- *jak se jmenoval vas prvni mazlicek*
	- otisk prstu
		- snimac naskenuje otisk, prevede ho do digitalu a porovna s ulozenym
	- sken obliceje
		- pri nastaveni se vytvori sablona, pak se tato sablona porovnava
	- sken zil
		- provedu sken ruky, zmapuju zily a pak porovnavam
	- sken ocniho pozadi
		- sken sitnice nebo duhovky je unikatni u kazdeho jedince
	- hlas
		- analyza vlastnosti hlasu (frekvence, rytmus, intonance), to se pak porovnava
	- pristupova fleska
		- nese bezpecnostni klic, zarizeni ceka na flesku s klicem
	- pristupova karta
		- karta nosici unikatni identifikator
c) U každého mechanizmu uveďte jeho výhody a nevýhody.
	- jmeno a heslo
		- vyhody
			- jednoduche na implementaci
			- lze zmenit
		- nevyhody
			- jednoduchost prolomeni (zalezi na slozitosti)
			- lze zapomenou
			- phishing
	- kod
		- vyhody
			- docasny (hodi se na vicefazove overeni)
		- nevyhody
			- potreba dalsi zarizeni
	- gesto
		- vyhody
			- rychle
		- nevyhody
			- lze zjistit podle otisku na obrazovce
	- kontrolni otazky
		- vyhody
			- vhodny pro obnovu uctu
		- nevyhody
			- casto dohledatelna informace (socialni site)
	- otisk prstu
		- vyhody
			- rychle a pohodlne
			- nelze zapomenout
		- nevyhody
			- ne vzdy je funkcni (spina, voda, ...)
	- sken obliceje
		- vyhody
			- rychle a pohodlne
		- nevyhody
			- starsi systemy lze oejit fotografii
	- sken zil
		- vyhody
			- tezko padelatelne
		- nevyhody
			- draha implementace
	- sken ocniho pozadi
		- vyhody
			- vysoka presnost
			- tezko padelatelne
		- nevyhody
			- draha implementace
	- hlas
		- vyhody
			- neni potreba doteku
		- nevyhody
			- ovlivnitelne hlukem, nemoci
			- moznost pouzit nahravku hlasu
	- pristupova fleska
		- vyhody
			- vysoka bezpecnost
		- nevyhody
			- lze ztratit
			- musim mit u sebe
	- pristupova karta
		- vyhody
			- rychla
			- lze kombinovat
		- nevyhody
			- lze ztratit
			- musim mit u sebe
			- u nejakych ji lze proste zkopirovat
d) Definujte vlastnosti bezpečného hesla v případě autentizace založené na jménu a heslu.
	- dostatecna delka
		- 12 a vice znaku
	- pouzivat velke i male pismena
	- pouzivat cisla
	- pouzivat specialni znaky
e) Pokuste se určit optimální složení hesla (délku a použité znakové sady). Vycházejte z výpočtu
VARIACÍ (statistika) délky hesla, znakové sady a časové náročnosti vyzkoušení všech možných
vypočtených VARIACÍ hesla.
	- kdyz budu mit heslo skladajici se z velkych a malych pismen (26+26), z cisel (10) a z specialnich znaku (cca 32 *ty casto pouzivane*) tak mam znakovou sadu o 94 znacich
	- rekneme ze mam heslo o delce 12 znaku
	- tudiz 94 ^ 12 = 4.7x10^23
	- podle tabulky https://www.redeszone.net/app/uploads-redeszone.net/2020/09/Tiempo-que-tarda-un-hacker-en-crackear-tu-contrasena.jpg toto heslo bude trvat prolomit 34 000 let
f) Proč není z uživatelského hlediska optimalní používat složité znakové sady? A jak by tedy mělo
vypadat ideální heslo?
	- heslo se muze stat nezapamatovatelnym
	- ale muze to udelat tak ze si vybereme treba oblibenou vetu/hlasku a poupravit tak aby byla pouzita co nejvetsi zankova sada, treba misto mezer pouzivat tecku, na konec a zacatek dat cisla apod.
g) Co to je entropie hesla?
	- mira sily hesla
	- resi predvidatelnost
h) Jak by mela být hesla (a autentizační údaje obecně) chráněna?
	- sifrovani
	- nepouzivat stejne vsude
	- pouzivat spravce hesel
	- neukladat do prohlizece bez nejakeho zabezpeceni
	- neposilat
i) Jak se řeší správa uživatelských účtů ve velké odrganizaci (nápověda: identity access management IAM)?
	- IAM je defakto system ktery nam dovoluje ridit authentizaci, role, prava, hierarchii, apod.
j) Co to je SSO (single sign on)?
	- pouzivam jednu sluzbu na ktere mam ucet abych se prihlasil i do dalsich sluzeb
	- napriklad tady jako pomoci microsoft uctu se prihlasim do wstag
k) Co to je “Password Spraying” ?
	- poupraveny brute-force
	- nejdrive se zkousi zname kombinace (ucet admin, heslo adminadmin)
Cvičení:
Zjistěte, jak v operačním systému, který používáte na svém počítači
l) Nastavíte jednotlivé požadavky na heslovou politiku:
• délku hesla
• znaky, které musí být v heslu použity
• životnost hesla (doba po které je uživatel nucen heslo změnit)
• počet neúspěšných pokusů o přihlášení, po kterém je jméno a heslo zablokováno
	sudo apt install libpam-cracklib libcrack2 wbritish
	sudo nvim /etc/pam.d/common-password
	password required pam_cracklib.so minlen=10 *minimalni delka 10*
	dcredit=-1 *alespon jedno cislo* 
	ucredit=-1 *alespon jedno velke pismeno* 
	lcredit=-1 *alespon jedno male pismeno* 
	ocredit=-1 *alespon jeden specialni znak*
	sudo nvim /etc/log.defs
	PASS_MAX_DAYS 30 *musi se menit po 30 dnech*
	PASS_MIN_DAYS 0 *doba co musi uplinout od posledni zmeny, tady muze ho zmenit hned po zmene*
	PASS_WARM_AGE 7 *dostane varovani pred vynucenou zmenou hesla, tady je to 7 dni*
	sudo nvim /etc/pam.d/common-auth
	auth required pam_faillock.so preauth silent deny=5 *po peti pokusech uzamkne ucet*
m) Pokuste se ve svém systému identifikovat uživatele, kteří nejsou využíváni a bylo by je možné
zrušit (uživatele reálně bez konzultace nerušte :-)))
	cat /etc/passwd *abych vypsal vsechny uzivatele*
	sudo apt install lastlog2 *nastroj ktery dokaze vypsat posledne prihlasene uzivatele, pokud je Never tak vim ze se nikdy neprihlasil*
	lastlog -b 90 *vypisu ucty co se neprihlasili za poslednich 90 dni*
n) Existují ve vašem systému, nebo na systémech v domácí síti nezměněná implicitní hesla?
(Implicitní hesla jsou hesla nastavená výrobcem zařízení/operačního systému a je nutné je ihned po
uvedení zařízení do provozu změnit)
	ano kdyz budu pocitat defaultne zamceny ucet root, kteremu jsem pri instalaci nezadal heslo, takze ma heslo defakto null

2) **Zabezpečení síťových služeb**
Síťové služby jsou služby spuštěné na počítači a naslouchající na síťovém rozhraní. Jsou charakterizované číslem portu (např. WEB server 80, ssh 22, telnet 23, ssh 22 apod).
a) Zjistěte jaký je rozdíl mezi portem a socketem a vypište síťové služby naslouchající na Vašem počítači. O jaké služby se jedná a na jakých portech naslouchají (nápoveda: netstat)?
	port - ciselne oznaceni ciste te sluzby (53 - DNS)
	socket - ip + port + protokol (192.168.122.1:53/tcp)
	ss -a | grep LISTEN	![[Pasted image 20250416171507.png]]
b) Bezpečnost počítače/serveru lze zvýšit, když vypneme nepotřebné služby. Uveďte postup, jak vypínat/zapínat služby na Vašem počítači.
	kill
	pkill
	sudo systemctl stop sluzba
	sudo systemctl disable sluzba
c) Některé služby jsou historicky považované za více rizikové, pokuste se uvést některé příklady.
	telnet
	ftp
	smb (pri spatne konfiguraci)
	nejake webove servery (apache)
d) Co to je firewall a k čemu slouží?
	takovy bod pres kterou jde vsechna komunikace mezi sitemi, slouzi jako kontrola/aplikator jeho pravidel
	nastavim firewall tak aby na me nikdo z netu nemohl ale ja do netu ano
e) Jaký je rozdíl mezi stavovým a bezstavovým firewallem (filtrem)?
	stavovy firewall 
		- je schopny sledovat vse co se v provozu deje, filtruji tudiz na zaklade provozu (dynamicke filtrovani)
	nestatovy
		- kontroluje provoz na zaklade klicovych hodnot (ip adresy, porty, atd.) a porovnava je s tabulkou pravidel
f) Co to je aplikační firewall?
	webovy aplikacni firewall
	sleduje pozadavky a odpovedi webove stranky a hleda ty skodlive, pak to zablokuje a da je na cernou listinu
	kdyz treba dam pozadavek ve stylu login, admin, pass 1234, tak veme tento pozadavek a zablokuje jej, zbytek propusti
g) Síťové služby musí být udržovány aktuální, protože se v nich často objevují chyby, které může útočník zneužít (viz. databáze chyb, o které jsme mluvili na úvodních přednáškách). Jak je zajišťována aktuálnost služeb?
castemi aktualizacemi
	pouzit ruzne zaplaty *kdyz mam nejakej nastroj kterej vim ze je tam nejaka chyba ale existuje zaplata tak ji pouziju*
Cvičení:
h) viz body a a b výše plus: Jak je realizován firewall na zařízení které používáte?
	pomoci gufw (Uncomplicated Firewall)
	Profile: Public
	Incoming: Reject
	Outgoing: Allow
	![[Pasted image 20250416181805.png]]
k) Jak byste na svém firewallu nastavili blokování všech požadavků o spojení na služby přicházejících ze sítě, kromě požadavků přicházejících na WEB server (TCP porty 80 a 443)?
	pridal bych pravidla (rules) pro tyto porty
	sudo ufw allow 80/tcp
	sudo ufw allow 443/tcp
	nebo graficky ![[Pasted image 20250416182307.png]]
i) Uveďte příklady aplikačních firewallů.
	ModSecurity
	Iron Bee
	F5
j) Vyberte si jednu, nebo více síťových služeb běžících na Vašem počítači (pokud nemáte počítač, nebo na něm žádná síťová služba neběží, tak libovolnou službu, která Vás napadne) a najděte v databázi chyb nedostatky této služby za poslední rok.
	openSSH
	https://nvd.nist.gov/vuln/detail/CVE-2025-27731
	Improper input validation in OpenSSH for Windows allows an authorized attacker to elevate privileges locally.
	8.4.2025
m) Popište, jak zajišťujete aktualizaci služeb na svém počítači/telefonu a jak se nastavuje.
	sudo apt update && sudo apt upgrade

3) **Souborový systém**
a) Jaký souborový systém je používán v operačním systému Windows a jaký v operačním systému Linux?
	- Windows
		- NTFS (Windows NT file system)
	- Linux
		- zalezi, ja mam ext4, ale pouziva se jeste btrfs
b) Jak funguje autorizace v NTFS souborovém systému?
	- kontroluje to nastaveni toho samotneho souboru/slozky
	- vlastnosti -> zabezpeceni
	- poupravuji v seznamu kdo (uzivatel, skupina) a prava
	 ![[Pasted image 20250418210708.png]]
c) Jak funguje autorizace v souborovém systému na Linuxu (co znamenají práva r w x v případě souboru a adresáře)?
	- jsou dany prava, lze je videt pomoci prikazu ls -l, prvni je vlastnik, skupina, ostatni
	- prava
		- r 
			- read 
			- muze si to zobrazit/precist
			- 4
		- w 
			- write 
			- muze to upravovat
			- 2
		- x 
			- execute
			- muze to pustit ale jen se svym opravnenim
			- 1
		- s 
			- misto x, pusti to s pravy vlastnika (rwsr-xr-x), takze kdyz to vlastni root a kdyz to pustim tak to pobezi jako root
			- velice nebezpecne kdyz ma pravo write kdokoliv jiny nez vlastnik
	- lze je zmenit pomoci chmod (zmena prav), chown (zmena vlastnika) a chgrp (zmena skupiny)![[Pasted image 20250418210810.png]]
d) Jaké bezpečnostní riziko představuje nastavený SUID bit na souboru v Linuxovém souborovém systému?
	- SUID bit (s) znamena ze pustim process ne se svym opravnenim ale s opravnenim vlastnika
	- nebezpecne kdyz ma kdokoliv jiny nez vlastnik pravi write
e) Jakým způsobem byste šifrovali celý souborový systém, nebo jednotlivé soubory pod operaćním systémem Windows a Linux?
	- Windows
		- cely ss
			- start -> manage bitlocker
		- jednotlivy soubor
			- vlastnosti -> obecne -> upresnit -> sifrovat obsah
	- Linux
		- cely ss
			- pri instalaci OS, nebo nastroji po
		- jednotlivy soubor (hodne zpusobu)
			- gpg -c filename *zasifrovat*
			- gpg -d filename *desifrovat*
Obrana proti škodlivému kódu
f) Škodlivý kód může do systému proniknout pomocí následujících vektorů útoku:
- zneužitím chyby v konfiguraci systému
- prolomením autentizace
- zneužitím chyby síťové služby
- interakcí uživatele
Konfigurací, autentizací a omezením počtu síťových služeb společně s jejich filtrováním se zabývají předchozí lekce. Jak lze ještě minimalizovat riziko zneužítí síťových služeb?
	- aktualizovat, nemit pustene zbytecne, mit firewall aby se utocnik nedostal na me, kontrolovat jestli nahodou neni nejaka prolomena
g) Co to jsou aktualizace systému a jaký mají smysl?
	- nahrada starsi verze za novejsi
	- ve stare verzi muze byt bezpecnostni dira a v nove muze byt jiz opravena
h) Jak lze sníźit, nebo eliminovat riziko, že škodlivý kód pronikne do systému pomocí interakce uživatele (stažení škodlivé aplikace, otevření škodlivé přílohy emailu, klik na zákeřný odkaz, vloření nakaženého média apod.)?
	- proskolenim
	- zablokovani znamych webu
	- nejdrive scan flesky pak az mount
i) Co to je antivirový program a jak funguje? Uveďte konkrétní příklady antivirů.
	- program ktery hleda skodlivy kod, jak skenem souboru na disku, tak i skenu RAM a zamezuje jeho zpusteni
	- windows defender, ClamAV, Avast, AWG, Avira, MalwareBite, ESET
Cvičení:
j) Jak vypíšete a nastavíte přístupová práva k souboru v operačním systému Windows a Linux?
	- Windows
		- vlastnosti -> zabezpeceni
	- Linux
		- ls -l
		- chmod, chown, chgrp
k) Uveďte příklaz operaćního systému Linux, který najde všechny soubory s nastaveným SUID bitem a s právem zápisu pro každého.
	- find / -type f -perm -4000 -perm -0002 -ls 2>/dev/null
	- hledej v root adresari typ file s opravnenim SUID a s opravnenim write pro ostatni, pak zobraz podprobnosti a nevypisuj hlasku permision denied
l) Zjistěte, jak je nastaven systém aktualizací na Vašem osobním počítači a telefonu.
	- noteboot
		- aktualizuji manualne
			- sudo apt update && sudo apt upgrade
	- mobil
		- dostanu notifikaci, kliknu a potvrdim ze chci nainstalovat
m) Zjistěte jak je nastaven antivirový systém na Vašem počítači (kdy probíhá kontrola disku, je kontrolováno každé připojené externí úložiště apod.).
	- aktualizace jsou nastaveny automaticky
	- disk nejdrive manualne mauntnu a pustim kontrolu
	- sken probiha vzdy vecer