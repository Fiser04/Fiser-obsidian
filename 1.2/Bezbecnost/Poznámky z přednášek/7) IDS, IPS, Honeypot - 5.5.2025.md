IDS/IPS
	- zarizeni ktere zachytaba veskery sitovy provoz
	- je pripojen na routeru
	- IDS
		- detekuje
	- IPS
		- blokuje
		- je v nem firewall
	- jsou 2 typy
		- definovany pravidly
			- *hale tenhle packet prisel, tak je to utok*
			- detekuje jen ty ktere jsou v pravidlech
			- neni schopen detekovat novy typ utoku
		- podle anomalii (NBA)
			- tyhle systemy naslouchaji treba 2 tydny
			- vytvori si obraz o tom co se tam deje
			- jakmile se najednou neco deje co je neobvykle tak to nahlasi
			- vytvari falesne hlaseni, ale dokaze najit i nove typy utoku
	- pouzivaji se 2 ruzne zpusoby typu pravidel
		- blackmodel
			- presne blacklistnu to co nechci
		- whitemodel
			- presne napisu to co chci

Honeypot
	- *mimic ale komp*
	- pocitac ktery se tvari jako server s horsim zabezpecenim a loguju vse co utocnik delal
	- pak ty logy vemu a vytvorim podle nich pravidla
	- existuje vice typu
		- nizko interaktinvi
			- otevreny nejaky porty a simuluje par sluzeb
			- je tam ssh tak nastaveny ze vsechny prihlasovaky jsou funkcni
		- vysoce interaktivni
			- drahy a slozity
			- simuluji do podrobna vsechny sluzby
	- kdyz je honeypot u vnitr a neco zaznamena tak bud
		- uz je utocnik uvnitr
		- uzivatel se spletl a omylem se tam dostal

SIEM
	- vsechny logy se posilaji na SIEM, ktery je mnohem hloubjeji ve siti
	- bezi na nem neco podobneho jako na IDS, takze dokaze najit ze je neco spatne
	- dokaze data agregovat
		- *propojovat data a podle kontextu se rozhodovat*
		- *v systemu je ze pracuje na pocitaci v kancelari, pri to ale ani neprisel do prace*