- usecase
	- cinnost ktera muze byt vyuzivana
	- nesmi byt "spravovat " neco
	- nejlepsi predstava je tlacitko
		- smazat uzivatele
		- smazat objednavku

- pisu je bud v infinitivu a nebo v prubehovym
	- ale vzdy stejne

- dedicnost
	- pomoci gen/spec principu
		- smerem dolu dochazi k specializaci
		- *platba kartou je specialni pripad platba za ubytovani*
			- ![[Pasted image 20251030122858.png]]
		- dedicnost nesmi byt hiearchie useru, dedicnost tady je roli *tridni ucitel je specialni role ucitele*
			- ![[Pasted image 20251030123424.png]]


- use case diagram
	- vyuziti systemu akteru

- akter
	- cokoliv co cokoliv vyuziva
	- idealne neexistuje role user
	- *muze to byt jak clovek, tak i cast systemu snazici se o cinnost*

- recepce hotelu
	- ![[Pasted image 20251030114721.png]]
		- toto jde zjednodusit na usecase CRUDL (create, return, update, delete, list)
		- pokud neco z toho potrebuju tak si to vytahnu a vytvorim paskal jako *CUD*, atd.
	- ![[Pasted image 20251030115026.png]]
		- smazat -> odstranit z systemu
		- zruseni -> prenastaveni jednoho booleanu na false (platny = false)
	- ![[Pasted image 20251030115243.png]]
		- in
			- obsluha je prihlasena do systemu
		- out
			- vytvorena rezervace
		- scenar (linearni pruchod case)
			1. Obsluha zvolila vytvoreni rezervace *proste bro jebnul input ze chce vytvorit rezervaci, treba button*
			2. System vyzve k zadani pocatku (datetime) a konce rezervace (datetime)
			3. Obsluha zada a potvrdi zacatek a konec rezervace
			4. System zobrazi dostupne pokoje v zadanem obdobi (filtrace a razeni podle typ pokoje, poctu luzek, vyhled na more)
			5. Obsluha zvoli pokoj
				5.1.  (OPT) Ojednat doplnkovou sluzbu
					- ![[Pasted image 20251030122259.png]]
					- sipka extend 
					- je to jen optional, nemusi se vubec poustet
			6. [[6 - Use case diagram#^853822|System zobrazi detail pokoje]]
				- ![[Pasted image 20251030122420.png]]
				- sipka include
				- *pokazdy kdyz se budu snazit vytvorit pokoj tak se pusti zobrazit*
			7. Obsluha potvrdi rezervaci
	- ![[Pasted image 20251030121656.png]] ^853822

domaci ukol, dodelat carsharing
![[Pasted image 20251030130124.png]]