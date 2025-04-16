1. authentizacni mechanizmy (https://elearning.jcu.cz/pluginfile.php/949568/mod_resource/content/1/lekce5.pdf)- Zjistěte, jak v operačním systému, který používáte na svém počítači
a) Nastavíte jednotlivé požadavky na heslovou politiku:
	• délku hesla
	• znaky, které musí být v heslu použity
	• životnost hesla (doba po které je uživatel nucen heslo změnit)
	• počet neúspěšných pokusů o přihlášení, po kterém je jméno a heslo zablokováno
b) Pokuste se ve svém systému identifikovat uživatele, kteří nejsou využíváni a bylo by je možné zrušit (uživatele reálně bez konzultace nerušte :-)))
c) Existují ve vašem systému, nebo na systémech v domácí síti nezměněná implicitní hesla?
	(Implicitní hesla jsou hesla nastavená výrobcem zařízení/operačního systému a je nutné je ihned po uvedení zařízení do provozu změnit)
d) Vyjmenujte co nejvíce v současnosti používaných autentizačních mechanizmů (jméno heslo, otisk prstu, …).
e) Seznamte se s nimi, a stručně popište jejich principy fungování.
f) U každého mechanizmu uveďte jeho výhody a nevýhody.
g) Definujte vlastnosti bezpečného hesla v případě autentizace založené na jménu a heslu.
h) Pokuste se určit optimální složení hesla (délku a použité znakové sady). Vycházejte z výpočtu
VARIACÍ (statistika) délky hesla, znakové sady a časové náročnosti vyzkoušení všech možných
vypočtených VARIACÍ hesla.
i) Proč není z uživatelského hlediska optimalní používat složité znakové sady? A jak by tedy mělo
vypadat ideální heslo?
j) Co to je entropie hesla?
k) Jak by mela být hesla (a autentizační údaje obecně) chráněna?
l) Jak se řeší správa uživatelských účtů ve velké odrganizaci (nápověda: identity access
management IAM)?
m) Co to je SSO (single sign on)?
n) Co to je “Password Spraying” ?
reseni:
a)
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
b)
	cat /etc/passwd *soubor obsahujici vsechny uzivatele*
	a hledej
c) 
	zarizeni o kterych vim co mame v provozu tak maj hned prvni vec co se dela tak zmena hesla
d)
	to co znam (heslo, kod, gesto, odpovedi na kontrolni otazky)
	to co mam (otisk prstu, sken obliceje, sken zil v rukou, sken ocniho pozadi, pristupova karta, autentizator, fleska s klicem, hlas)
e)
	to co znam - casto to zaheshuje a pak porovnana heshe
	to co mam - defakto dost podobne, vemu to co vyplivnul senzor, zaheshuju to a porovnavam
f)
	to co znam - lze zmenit, lze uhadnout/odpozorovat
	to co mam - blbe se krade (kdyz nepocitam flesku a kartu), casto nemeny



2. Praktická cvičení (https://elearning.jcu.cz/pluginfile.php/949567/mod_resource/content/1/lekce4.pdf)
a) Výpočet síly hesla
b) Pomůcky pro snadné zapamatování hesla
c) Aplikace pro správu heslel
d) Nastavení heslové politiky (Windows):
Ovládací panely - Nástroje pro správu - Místní zásady zabezpečení
Doporučené hodnoty:
Minimální délka hesla 8-9 znaků
Minimální životnost hesla (většinou mezi 1 a 7 dny)
Maximální životnost hesla (většinou ne více než 42 dnů)
Porovnávaná historie hesel by neměla být menší než 6
reseni:
a)
	V(n,k) = n^k
	*V(pocet znaku v sade, pocet znaku hesla) = pocet znaku v sade ^ pocet znaku hesla*
	heslo o dvou cislech -> 10^2=100
b)
	treba nejak oblibena veta, hlaska z filmu, apod.
c)
	1Password
	LastPass
	Bitwarden
	Dashlane
	NordPass
d)
	![[{29FF8948-4E9E-42EF-99CF-8F5E60F70EE0}.png]]


3. lekce 5 (https://elearning.jcu.cz/pluginfile.php/949568/mod_resource/content/1/lekce5.pdf)
a) V čem spočívá útok nazývaný “Password Spraying” a jaká je proti němu obrana?
b) Navrhněte vhodný mechanizmus tvorby uživatelského jména
c) Stejná jména a hesla ve veřejných i vnitřních sítích
Opatření: 
	Není vhodné používat ve veřejných sítích stejné názvy účtů a hesla, jako v sítích chráněných. Neustále jsme svědky úniků účtů z eshopů, hotelů, seznamek a dalších veřejných služeb. První co útočník vyzkouší, je použít uniklá jména účtů a hesla k průniku do chráněné (vnitřní sítě).
Opatření: 
	Heslo by nemělo být použité dvakrát nikdy. Ani napříč systémy v chráněné síti. 
Samostatná práce: Srovnejte se SSO (Single Sign-On).
d) Samostatná práce: Vyberte několik dalších útoků z PTES standardu a pokuste se najít opatření, která jim zabrání.
reseni:
a)
	Password spraying je to ze vemu jedno velice caste heslo a vyzkousim ho na vsech uctech
b) 
	kus jmena, kus prijmeni, cislo pracoviste (treba cislo budovy nebo oddeleni) a nahodny znak
c) 
	mnohem jednodusi pouzivani u SSO ale velke ryziko kdyz by se nekdo cizy dostal na ucet (jeden ucet, hodne sluzeb)
d) 
	1) Enumerace uživatelských účtů (User Enumeration)
		- tudiz utocnik hleda existujici uzivatele pomoci chybove hlasky "Uzivatel jiz existuje"
		-> treba misto Uzivatel jiz existuje pouzit Chyba pri registraci a pridat CAPTCHA aby to neslo nabotit
	2) Man in the Middle
		- tudiz utocnik se chova jako prostrednik mezi komunikaci ostatnich, odposlouchava a meni komunikaci
		-> pouzit sifrovanou komunikaci (SSH,atd)
	3) Command Injection
		- utocnik vlozi do pole pro prihlaseni skodlivy prikaz
		-> nezpracovavat input od uzivatelu jako prikaz

4. **Zabezpečení síťových služeb** (https://elearning.jcu.cz/pluginfile.php/949569/mod_resource/content/2/2_zabezpeceni_sitovych_sluze.pdf)
Síťové služby jsou služby spuštěné na počítači a naslouchající na síťovém rozhraní. Jsou charakterizované číslem portu (např. WEB server 80, ssh 22, telnet 23, ssh 22 apod).
	a) Zjistěte jaký je rozdíl mezi portem a socketem a vypište síťové služby naslouchající na Vašem počítači. O jaké služby se jedná a na jakých portech naslouchají (nápoveda: netstat)?
	b) Bezpečnost počítače/serveru lze zvýšit, když vypneme nepotřebné služby. Uveďte postup, jak vypínat/zapínat služby na Vašem počítači.
	c) Některé služby jsou historicky považované za více rizikové, pokuste se uvést některé příklady.
	d) Co to je firewall a k čemu slouží?
	e) Jaký je rozdíl mezi stavovým a bezstavovým firewallem (filtrem)?
	f) Co to je aplikační firewall?
	g) Síťové služby musí být udržovány aktuální, protože se v nich často objevují chyby, které může útočník zneužít (viz. databáze chyb, o které jsme mluvili na úvodních přednáškách). Jak je zajišťována aktuálnost služeb?
	**Cvičení:**
	h) viz body a a b výše plus: Jak je realizován firewall na zařízení které používáte?
	k) Jak byste na svém firewallu nastavili blokování všech požadavků o spojení na služby přicházejících ze sítě, kromě požadavků přicházejících na WEB server (TCP porty 80 a 443)?
	i) Uveďte příklady aplikačních firewallů.
	j) Vyberte si jednu, nebo více síťových služeb běžících na Vašem počítači (pokud nemáte počítač, nebo na něm žádná síťová služba neběží, tak libovolnou službu, která Vás napadne) a najděte v databázi chyb nedostatky této služby za poslední rok.
	m) Popište, jak zajišťujete aktualizaci služeb na svém počítači/telefonu a jak se nastavuje.
reseni:
a)
	port - ciselne oznaceni ciste te sluzby (53 - DNS)
	socket - ip + port + protokol (192.168.122.1:53/tcp)
	ss -a | grep LISTEN	![[Pasted image 20250416171507.png]]
b) 
	kill
	pkill
	sudo systemctl stop sluzba
	sudo systemctl disable sluzba
c)
	telnet
	ftp
	smb (pri spatne konfiguraci)
	nejake webove servery
d)
	takovy bod pres kterou jde vsechna komunikace mezi sitemi, slouzi jako kontrola/aplikator jeho pravidel
	nastavim firewall tak aby na me nikdo z netu nemohl ale ja do netu ano
e)
	stavovy firewall 
		- je schopny sledovat vse co se v provozu deje, filtruji tudiz na zaklade provozu (dynamicke filtrovani)
	nestatovy
		- kontroluje provoz na zaklade klicovych hodnot (ip adresy, porty, atd.) a porovnava je s tabulkou pravidel
f)
	webovy aplikacni firewall
	sleduje pozadavky a odpovedi webove stranky a hleda ty skodlive, pak to zablokuje a da je na cernou listinu
	kdyz treba dam pozadavek ve stylu login, admin, pass 1234, tak veme tento pozadavek a zablokuje jej, zbytek propusti
g)
	castemi aktualizacemi
	pouzit ruzne zaplaty *kdyz mam nejakej nastroj kterej vim ze je tam nejaka chyba ale existuje zaplata tak ji pouziju*
h)
	pomoci gufw (Uncomplicated Firewall)
	Profile: Public
	Incoming: Reject
	Outgoing: Allow
	![[Pasted image 20250416181805.png]]
k)
	pridal bych pravidla (rules) pro tyto porty
	sudo ufw allow 80/tcp
	sudo ufw allow 443/tcp
	nebo graficky ![[Pasted image 20250416182307.png]]
i)
	ModSecurity
	Iron Bee
	F5
j) 
	openSSH
	https://nvd.nist.gov/vuln/detail/CVE-2025-27731
	Improper input validation in OpenSSH for Windows allows an authorized attacker to elevate privileges locally.
	8.4.2025
m)
	sudo apt update && sudo apt upgrade