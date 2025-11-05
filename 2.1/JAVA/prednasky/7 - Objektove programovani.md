*Jak vytvaret*

- co je objektove programovani
	- zpusob reprezentace sveta okolo nas

- objekty spolu komunikuji pomoci zprav
	- *objekty clovek, sekacka, clovek chce posekat tak zatahne na sekacce lano*
	- event-based pristup
		- na zaklade udalosti se deje nejaka funkce
		- *zprava muze byt posunuti paky, sekacka dostane zpravu zrychli, zrychli*

- kazdy objekt ma
	- identifikator
		- specialni zpusob identifikace
		- *proste nazev, umisteni v pameti atd.*
	- atributy
		- vlastnosti
		- *auto ma znacku, vykon motoru, barvu*
		- lze odkazovat na jiny objekt
			- *kdyz mam promenou motor, tak motor ma svoji vlastni tridu a svoje vlastni atributy (typ paliva, typ oleje, vykon, ...)*
			- vazba IS-PART
	- chovani
		- to co ten objekt dela v case, tedy popis method
		- *nastartuj, pridej, brzdi*

- trida
	- blueprint
	- definuje spolecne rysy vsech objektu
	- vzdy zacina velkym pismenem (System, Scanner, ArrayList)

- instance
	- konkretni objekt, vytvoreny podle tridy
	- vznika konstrukterem
		- stejne jmeno se tridou
		- class Trida{
			- public Trida(){}
		- }

- instancni promene a methody
	- uchovava hodnoty promene ruzne pro kazdou instanci
	- *proste podle tridy mam plan, hale tady bude pocet pasazeru, konstruktorem tam ho narvu a ta instance ma ted presne dannou pocet pasazeru presne pro tu instanci*
	- dostupnost muze byt omezena (private/public)

- dedicnost
	- hierarchie
	- IS-A
	- *mam tridu kde jsou zapsany opakovany atributy*
	- *osobni automobil x nakladak, kazde vozidlo ma pneumatiky, motor, pocet sedadel, start(), brzdit(), ... a pak by byly specialy primo v te tride nakladak naloz(), vyloz()*
	- nejvysse je trida Object