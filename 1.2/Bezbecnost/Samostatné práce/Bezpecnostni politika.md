Uvod
	Tento dokument popisuje ochranu zarizeni Lenovo Thinkpad T480 s operacnim systemem Debian Trixie jak pred fyzickou hrozbou, tak i hrozbou v virtualnim svete.

Politka hesel
	Navrh silneho hesla
		- Alespon 12 znaku
		- Velke pismena
		- Mala pismena
		- Cisla
		- Specialni znaky (pokud jsou povoleny)
	Zakaz pouzivani stejneho hesla u vice sluzeb.
	Je povolena moznost pouzivani duveryhodneho spravce hesel.

Pristupova bezpecnost
	Uzivatel Root musi byt vzdy uzamcen.
	Uzivatel musi mit silne heslo (viz. Politika hesel).
	Zarizeni se musi uzamykat automaticky pri uspani.
	Je povinnost pri kazdem odchodu od zarizeniho jej zamykat.

Ochrana pred skodlivym kodem
	Na zarizeni musi bezet spravne nastaveny antivirus s schopnosti skenovani hrozeb v realnem case.
	Instalace programu a baliku probiha jen pomoci overenych zdroju:
		- debian repository
		- flatpak
		- github (jen u duveryhodnych projektu)
	Pravidelne aktualizovat kazdy druhy den.

Fyzicka bezpecnost
	Zarizeni nesmi byt ponechano na jakemkoli verejnem miste, ci miste s jednoduchym */snadnym* pristupem bez dozoru (pr. v internet kafe, v nezamcenem aute, atd.).
	Je zakazano pripojovat jakekoliv nezname externi datove zarizeni (flesh drive, ssd, atd.).
	Po dobu nepouzivani musi byt zarizeni zamceno na nepristupnem miste.
	Pristup do BIOS/UEFI a do boot menu musi byt chraneno silnym heslem (viz. Politika hesel).

Bezpecne chovani uzivatele
	Uzivatel ma zakazano navstevovat verejne zname nebezpecne webove stranky a stahovat podezrele soubory ("pirated movie", "free RAM", "cracked", atd.).
	Zakaz otevirani neznamych odkazu a priloh z e-mailu.

Sitova a bezdratova bezpecnost
	Automaticke pripojovani povolit jen duveryhodnym WIFI.
	Zakaz pripojeni na jakoukoliv verejne dostupnou WIFI bez pouziti VPN.
	Nastaveny firewall, tak ze to co jde do vnitr je zakazano (Incoming reject) a to co je ven povoleno (Outcoming allow).
	Pouzivat jen duveryhodne poskytovatele VPN.
	Mit zapnuty bluetooth jen kdyz je potrebny.

Ochrana pred ztratou dat
	Povinne pravidelne zalohovani dulezitych dat, jak na fyzicky disk (aresar /home), tak i na github (config, poznamky).
	Povinne pravidelne vytvareni snapshotu systemu.

Logovani
	Na zarizeni musi probihat logovani pristupu (/var/log/auth.log a journalctl).

Pravidelne kontroly a bezpecnostni kroky
	Kazdy den
		Aktualizace databaze antiviru
		Sken antiviru
		Zaloha dulezitych souboru
	Jednou za 2 dny
		Aktualizace operacniho systemu, aplikaci a dalsich baliku
	Jednou tydne
		Vytvoreni snapshotu systemu
		Kotrola nastaveni firewallu a VPN
		Kontrola procesu ktere poslouchaji (LISTENING).
	Jednou mesicne
		Kontrola uzivatelu
		Kontrola nainstalovanych aplikaci
	Jednou za ctvr roku
		Revize bezpecnostni politiky