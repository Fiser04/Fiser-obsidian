[[4) Authentizace - 24.3.2025]]

Vyjmenujte co nejvíce v současnosti používaných autentizačních mechanizmů (jméno heslo,
otisk prstu, …).
	- jmeno heslo, kod, gesto, kontrolni otazky, otisk prstu, sken obliceje, sken zil, sken ocniho pozadi, hlas, pristupova fleska, pristupova karta, viceklicove reseni


Seznamte se s nimi, a stručně popište jejich principy fungování.
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


U každého mechanizmu uveďte jeho výhody a nevýhody.
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


Definujte vlastnosti bezpečného hesla v případě autentizace založené na jménu a heslu.
	- dostatecna delka
		- 12 a vice znaku
	- pouzivat velke i male pismena
	- pouzivat cisla
	- pouzivat specialni znaky


Pokuste se určit optimální složení hesla (délku a použité znakové sady). Vycházejte z výpočtu
VARIACÍ (statistika) délky hesla, znakové sady a časové náročnosti vyzkoušení všech možných
vypočtených VARIACÍ hesla.
	- kdyz budu mit heslo skladajici se z velkych a malych pismen (26+26), z cisel (10) a z specialnich znaku (cca 32 *ty casto pouzivane*) tak mam znakovou sadu o 94 znacich
	- rekneme ze mam heslo o delce 12 znaku
	- tudiz 94 ^ 12 = 4.7x10^23
	- podle tabulky https://www.redeszone.net/app/uploads-redeszone.net/2020/09/Tiempo-que-tarda-un-hacker-en-crackear-tu-contrasena.jpg toto heslo bude trvat prolomit 34 000 let


Proč není z uživatelského hlediska optimalní používat složité znakové sady? A jak by tedy mělo
vypadat ideální heslo?
	- heslo se muze stat nezapamatovatelnym
	- ale muze to udelat tak ze si vybereme treba oblibenou vetu/hlasku a poupravit tak aby byla pouzita co nejvetsi zankova sada, treba misto mezer pouzivat tecku, na konec a zacatek dat cisla apod.


Co to je entropie hesla?
	- mira sily hesla
	- resi predvidatelnost


Jak by mela být hesla (a autentizační údaje obecně) chráněna?
	- sifrovani
	- nepouzivat stejne vsude
	- pouzivat spravce hesel
	- neukladat do prohlizece bez nejakeho zabezpeceni
	- neposilat


Jak se řeší správa uživatelských účtů ve velké odrganizaci (nápověda: identity access management IAM)?
	- IAM je defakto system ktery nam dovoluje ridit authentizaci, role, prava, hierarchii, apod.


Co to je SSO (single sign on)?
	- pouzivam jednu sluzbu na ktere mam ucet abych se prihlasil i do dalsich sluzeb
	- napriklad tady jako pomoci microsoft uctu se prihlasim do wstag


Co to je “Password Spraying” ?
	- poupraveny brute-force
	- nejdrive se zkousi zname kombinace (ucet admin, heslo adminadmin)


==Zjistěte, jak v operačním systému, který používáte na svém počítači:==
Nastavíte jednotlivé požadavky na heslovou politiku:
- délku hesla
- znaky, které musí být v heslu použity
- životnost hesla (doba po které je uživatel nucen heslo změnit)
- počet neúspěšných pokusů o přihlášení, po kterém je jméno a heslo zablokováno
-debian
	- `sudo apt install libpam-cracklib libcrack2 wbritish`
	- `sudo nvim /etc/pam.d/common-password`
	- `password required pam_cracklib.so minlen=10` *minimalni delka 10*
	- `dcredit=-1` *alespon jedno cislo* 
	- `ucredit=-1` *alespon jedno velke pismeno* 
	- `lcredit=-1` *alespon jedno male pismeno* 
	- `ocredit=-1` *alespon jeden specialni znak*
	- `sudo nvim /etc/log.defs`
	- `PASS_MAX_DAYS 30` *musi se menit po 30 dnech*
	- `PASS_MIN_DAYS 0` *doba co musi uplinout od posledni zmeny, tady muze ho zmenit hned po zmene*
	- `PASS_WARM_AGE 7` *dostane varovani pred vynucenou zmenou hesla, tady je to 7 dni*
	- `sudo nvim /etc/pam.d/common-auth`
	- `auth required pam_faillock.so preauth silent deny=5` *po peti pokusech uzamkne ucet*


Pokuste se ve svém systému identifikovat uživatele, kteří nejsou využíváni a bylo by je možné zrušit (uživatele reálně bez konzultace nerušte :-)))
	- `cat /etc/passwd` *abych vypsal vsechny uzivatele*
	- `sudo apt install lastlog2` *nastroj ktery dokaze vypsat posledne prihlasene uzivatele, pokud je Never tak vim ze se nikdy neprihlasil*
	- `lastlog -b 90` *vypisu ucty co se neprihlasili za poslednich 90 dni*


Existují ve vašem systému, nebo na systémech v domácí síti nezměněná implicitní hesla? (Implicitní hesla jsou hesla nastavená výrobcem zařízení/operačního systému a je nutné je ihned po uvedení zařízení do provozu změnit)
	- ano, kdyz budu pocitat defaultne zamceny ucet root, kteremu jsem pri instalaci nezadal heslo, takze ma heslo defakto null