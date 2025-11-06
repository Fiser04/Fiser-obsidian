- OWASP
	- nevydelecna organizace ktera se zajima o zabezpeceni webu
- OWASP TESTING GUIDE
	- seznam vsech testu ktere mam udelat abych otestoval zabezpeceni webu (pres 150 testu)
- OWASP LIVE CD
	- jejich zvlastni distribuce na testovani
	- nebo proste pouziju kalinu

- url
	- protocol://hostname/cesty/skript a argument

- mam webovou aplikaci a chci najit vsechny weby na ip
	- oskenovat porty, at vim kde vsude je nejakej webovej server
	- hostname (v URL)
		- https://assetfinder.attaxion.com/scan/jo.jcu.cz
	- adresar/soubor (v URL)
	- pomoci argumentu/parametru
	- certifikaty

- robots.txt
	- soubor kde je vse co nechci aby google zobrazoval

- verze webserveru
	- nmap -sV adresa
	- mc adresa port
		- HEAD kde protokol
		- ![[Pasted image 20251106160140.png]]

- konfiguracni nedostatky webu
	- zjisti jaky sifrovani web pouziva pri komunikaci v https
		- SSL 2,3 a TLS 1.0 jsou jiz prorazeny
		- jsem pak schopen cist a menit komunikaci
		- nmap -sV --script ssl-enum-ciphers -p 443 host
			- vsechny scripty jsou v /esr/share/nmap/scripts
			- pr. vulners
	- zjistit webove aplikace konfiguratory zarizeni
		- routery, apod
		- https://www.exploit-db.com/google-hacking-database
			- web shell
				- narvu si do napadeneho php, ktery mi pusti terminal toho samotneho webu
				- neklikat na ne
	- soubory
		- jmena hesla do databaze, apod
	- klasicka chyba
		- web musi bezet na svym uzivateli, ne root
		- web musi mit korenovy adresar jen ten jeden urcity kterej je pro nej, ne /