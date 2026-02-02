#### Typy sluzeb
- sluzby ovladani souboru
	- vstup a vystup operace
- datove sluzby
	- transakce a manipulace
	- methoda save()
- logika dat
	- operace a omezeni dat
	- *jak jako ze si se narodil zitra*
- logika aplikace
	- algoritmus aplikace
	- *ha, 1+1, no, to bude... 3*
- prezentacni logika
	- rizeni interakce
	- *hej zmrde, ja chcu na jiny okno*
- prezentacni sluzby
	- zobrazeni vysledku
	- prijem vstupu
	- *proste gui lol*

#### Varienty architektur
- Klient/server se vzdakenymi daty
	 - ![[Pasted image 20250924085107.png]]
	- potreba silnejsi klient
- Klient/server se vzdalenou prezentaci
	- ![[Pasted image 20250924085134.png]]
	- potreba silnejsi server
- Klient/server s rozdelenou logikou
	- ![[Pasted image 20250924085146.png]]
	- kdyz server nestiha, tak se zapoji klient do prace
- Trivrstva architektura
	- ![[Pasted image 20250924085157.png]]
	- ve svete javy
		- oracle - tomcat - jfx/swing
	- ve svete c#
		- mssql - iis - win forms
	- ve svete php
		- mysql - apache - php
	- ziskavam rozlozeni zateze

#### MVC
- **webove aplikace**
- stara technologie
- ![[Pasted image 20251001083038.png]]
- postup
	- kliknu na neco
	- vytvorim request
	- controller prijme request
	- controller rozhodne co udela
	- upravi view a nebo model
	- zasle nove html
	- uzivatel ho zobrazi
- bfu
	- basic fucking user/basic franta uzivatel
- controller
	- prezentacni logika
	- aplikacni logika
- model
	- prevod dat mezi databazi a objekty
		- objektove relacni mapovani
- view
	- prezentacni sluzby
- spoje
	- komunikace
		- od uzivatele a k nemu
	- rizeni
		- ten zbytek

#### MVP
- **widgetovy system** (windows forms, windows presentation system)
- ![[Pasted image 20251022095102.png]]
- postup
	- bfu komunikuje s view
	- view zachyceny vstup posila na presenter
	- presenter ovlada view

#### MVVM
- **widgetovy system** (windows presentation system)
- *nova generace mvp*
- ![[Pasted image 20251022095420.png]]
- view-model
- binding
	- provazani gui a datoveho modelu
		- *tpc, v datech je zmena, ihned musim zmenit gui*
	- *ale HLAVNE treba kdyz budu mit v gui tlacitko "smazat", tak se mi odemkne az po vybrani ceho*

#### Udalostni system
- predavani adres method v pameti
- objekt
	- kus pameti
	- vznika podle tridy
	- obsahuje
		- eventy
		- methody
		- instancni promene
		- vlastnosti
	- takze methoda je vlastne taky kus pameti
	- a kdyz vemu adresu ty methody a narvu to do listu tak je to list eventu
- Delegate
	- odkaz na methodu
- handler
	- zachycuje event
- Observer
	- *dneska je pohodka v jobu co, jen tak proste sledovat jestli se neco nedeje a dneska je klid..., tpc, zmena, rychle musime na to zareagovat*
	- ![[Pasted image 20260202161411.png]]
		- vizObj cumi na DataObj

#### Design patterns
- vytvareni
	- singletone
		- jen jedna instance objektu pro cely kod
		- *pico ale uz, na co mi je kurwa mit 50 instanci pripojeni k databazi, mi staci jen jedna*
	- factory
		- vyrvareni objektu vzoru, trida je oddelena od instance
		- *prijdu do dilny a postastavim tank* vs *postavim fabriku na tanky a pak stavim tank*
- strukturalni
	- adapter
		- propojuju na sebe 2 nezavisle veci
		- *pico, fakt ale uz, proc ti zkurveni briti musi mit postizenou zasuvku, ted si musim koupit nejakej adapter*
		- mam vice databazi, ale vsechny nejsou stejne (jedna je mysql, druha postgres), takze potrbuju **adapter** na to abych mohl pouzivat oboje
			- takze udelam interface ktery se bude pripojovat
	- fasada
		- zabaluju vice trid do jednoho objektu
- chovani
	- strategy
		- vytvarim strukturu ktera by sla popripade pak jednoduse vymenit
		- pres dedicnost si vybiram strategii
		- ![[Pasted image 20251105091251.png]]
	- observer

#### Dependency injection
- snizit zavislost v kodu
- mam dve osoby, hrace a poradce
	- *hej poradce, podej mi hul*, poradce vybere spravnou hul, poradce predava hul hraci *na ty kulhava kundo*

#### N vrstva
- ![[Pasted image 20260202164254.png]]
- presentation layer
	- gui
- business layer
	- aplikacni logika
	- *vemu objekty a nejak je prekopu aby byly citelny a pripraveny na prezentaci*
- data access layer
	- jedina ma pristup k datum jako k takovym
	- repository
		- obaluje data
		- methody create, list, ...
	- vytahne data z databaze a predela je na objekty
	- DTO = data transfer object
	- POCO/POJO = play all c#/java object
- entity layer
	- databaze

#### Distribuce
- instalator
	- klasickej wizard
- portable
	- prekopanej instalator
- na web server
	- "publikuju" kod
	- nahraju ho na web server (treba is, apache, nginx)
	- reknu serveru "hale tohle je aplikace"
	- microservices ftw
		- horizontalni skalovani
			- vice instanci
		- vertikalni
			- silnejsi komp

#### Clean architecture
- *zlobri jsou jako cibule* ... *smrdej?*
- ![[Pasted image 20251210083257.png]]
	- business entities
	- use case = sluzby
	- controller = jak to bude videt
	- databaze a zobrazeni
- nejdu pri vyvoji jako u N-vrstvy (kde musim nejdrive delat databazi), ale nejdrive si udelam treba jednu entitu a postupne pridelavam funkcionalitu