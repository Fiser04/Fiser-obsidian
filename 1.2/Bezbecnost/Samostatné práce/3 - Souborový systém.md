[[14.4.2025 - Souborovy system]]

Jaký souborový systém je používán v operačním systému Windows a jaký v operačním systému Linux?
	- Windows
		- NTFS (Windows NT file system)
	- Linux
		- zalezi, ja mam ext4, ale pouziva se jeste btrfs


Jak funguje autorizace v NTFS souborovém systému?
	- kontroluje to nastaveni toho samotneho souboru/slozky
	- vlastnosti -> zabezpeceni
	- poupravuji v seznamu kdo (uzivatel, skupina) a prava
	 ![[Pasted image 20250418210708.png]]


Jak funguje autorizace v souborovém systému na Linuxu (co znamenají práva r w x v případě souboru a adresáře)?
	- jsou dany prava, lze je videt pomoci prikazu `ls -l`, prvni je vlastnik, skupina, ostatni
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
	- lze je zmenit pomoci `chmod` (zmena prav), `chown` (zmena vlastnika) a `chgrp` (zmena skupiny)![[Pasted image 20250418210810.png]]


Jaké bezpečnostní riziko představuje nastavený SUID bit na souboru v Linuxovém souborovém systému?
	- SUID bit (s) znamena ze pustim process ne se svym opravnenim ale s opravnenim vlastnika
	- nebezpecne kdyz ma kdokoliv jiny nez vlastnik pravi write


Jakým způsobem byste šifrovali celý souborový systém, nebo jednotlivé soubory pod operaćním systémem Windows a Linux?
	- Windows
		- cely ss
			- start -> manage bitlocker
		- jednotlivy soubor
			- vlastnosti -> obecne -> upresnit -> sifrovat obsah
	- Linux
		- cely ss
			- pri instalaci OS, nebo nastroji po
		- jednotlivy soubor (hodne zpusobu)
			- `gpg -c filename` *zasifrovat*
			- `gpg -d filename` *desifrovat*


Obrana proti škodlivému kódu
Škodlivý kód může do systému proniknout pomocí následujících vektorů útoku:
- zneužitím chyby v konfiguraci systému
- prolomením autentizace
- zneužitím chyby síťové služby
- interakcí uživatele
Konfigurací, autentizací a omezením počtu síťových služeb společně s jejich filtrováním se zabývají předchozí lekce. Jak lze ještě minimalizovat riziko zneužítí síťových služeb?
	- aktualizovat, nemit pustene zbytecne, mit firewall aby se utocnik nedostal na me, kontrolovat jestli nahodou neni nejaka prolomena


Co to jsou aktualizace systému a jaký mají smysl?
	- nahrada starsi verze za novejsi
	- ve stare verzi muze byt bezpecnostni dira a v nove muze byt jiz opravena


Jak lze sníźit, nebo eliminovat riziko, že škodlivý kód pronikne do systému pomocí interakce uživatele (stažení škodlivé aplikace, otevření škodlivé přílohy emailu, klik na zákeřný odkaz, vloření nakaženého média apod.)?
	- proskolenim
	- zablokovani znamych webu
	- nejdrive scan flesky pak az mount


Co to je antivirový program a jak funguje? Uveďte konkrétní příklady antivirů.
	- program ktery hleda skodlivy kod, jak skenem souboru na disku, tak i skenu RAM a zamezuje jeho zpusteni
	- windows defender, ClamAV, Avast, AWG, Avira, MalwareBite, ESET


Jak vypíšete a nastavíte přístupová práva k souboru v operačním systému Windows a Linux?
	- Windows
		- vlastnosti -> zabezpeceni
	- Linux
		- ls -l
		- `chmod`, `chown`, `chgrp`


Uveďte příklaz operaćního systému Linux, který najde všechny soubory s nastaveným SUID bitem a s právem zápisu pro každého.
	- `find / -type f -perm -4000 -perm -0002 -ls 2>/dev/null`
	- *hledej v root adresari typ file s opravnenim SUID a s opravnenim write pro ostatni, pak zobraz podprobnosti a nevypisuj hlasku permision denied*


Zjistěte, jak je nastaven systém aktualizací na Vašem osobním počítači a telefonu.
	- notebook
		- aktualizuji manualne
			- `sudo apt update && sudo apt upgrade`
			- `flatpak update`
	- mobil
		- dostanu notifikaci, kliknu a potvrdim ze chci nainstalovat


Zjistěte jak je nastaven antivirový systém na Vašem počítači (kdy probíhá kontrola disku, je kontrolováno každé připojené externí úložiště apod.).
	- aktualizace jsou nastaveny automaticky
	- disk nejdrive manualne mauntnu a pustim kontrolu
	- sken probiha vzdy vecer