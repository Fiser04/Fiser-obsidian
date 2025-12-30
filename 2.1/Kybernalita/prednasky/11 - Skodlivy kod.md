- https://virustotal.com/
- pousteni v sandboxu

- testovani antiviru
	- https://eicar.org/

- IOC
	- informace comfortace
	- vse cim jsem schopny identifikovat ten skodlivy kod

- ruzne typy
	- funkce
		- spyware
			- posila co delate nekam, vase soubory apod
		- ransomware
			- zasifruje celej disk
		- back-door
			- vzdaleny pristup do pc, abych se mohl zdalene pripojit
	- jak se siri
		- exploit
			- chyba v kodu
		- cerv (morrisuv cerv)
			- sam se siri
		- trojsky kun
			- schovanej za jinou vec
		- rootkit
			- zchovani sam sebe
			- upravim prikazy, knihovny apod
		- virus
			- sam se nesiri, musi interakci
		- logicka bomba
			- pusti se jen diky urcite situaci
			- blbej priklad *patek 13.*
			- pusti treba ransomware, nebo smaze celej disk
		- stahovac (loader)
			- stahne to skodlivej kod

- pro kazdy skodlivy kod ma prostredi
	- zarizeni (procesor)
	- operacni system

- methody infekce
	- boot virus
		- narval se virus primo do boot partitionu
	- beh v pameti, apod

- analyza
	- podivam se jestli bezim ve virtualce

- botnet
	- sit ovladnutych pocitacu
	- tuto sit mohu pak pronajimat treba na utoky
	- NEJIT po jejich centru, centum to zjisti a pusti ddos na vas
	- nejlespi ochrana je proste zamezit pristup, treba firewallem
	- obrana
		- erd, antivir
		- ips
		- system detekce anomalii (NBA)

- archivovat vir muzeme obskurnimi archivatory, takze antivir to nezvladne detekovat

- lze odvazet pozornost zahlcenim
	- zipbomba - antivir
	- ddos