- distribuce = debian (stable release)
- main package manager = nix
- hlavni jazyky = python a bash (mozna c++, ale to by me python musel hodne stvat)

- Hlavni cil
	- vytvorit distribuci s nastrojem rychleho set-upu pro jakykoliv predmet, tento nastroj umoznit pouzivat i dalsi cleny unixove komunity bez potreby vyuzivani me distribuce
		- Tak proc vubec resit tu distribuci, kdyz si to kdokoliv muze nainstalovat?
			1) Schopnost bude out of the box, zadna potreba instalace navic
			2) Distribuce bude vytvorena s myslenim na lidi kteri se boji terminalu
			3) Hlavni technicka podpora bude smerovana na distribuci (proste *"*Deje se to v mym milackovi? Twl, hned opravuju* ale *Co to je za Issue? Kamo, ty mas Arch s modifikovanym Kernelem, mas vsechno v dev verzi, i ls ti hazi chybu, ja se divim ze nabootujes. Tak az budu mit nekdy cas tak se na to podivam*)

1) vytvorit distribuci "jednoduchou" pro pouzivani pro studenty
	- pri instalaci moznost vybrat mezi jiz znamymi DE (kde, gnome)
		- optional - vytvorit i nejakej wm (hyprland treba)
2) vytvorit "store app" (*studentsky package manager*)
	- kompatibilni jak s Linux tak i s macOS
	- program ktery z adresare plne JSONu (ci jineho souboru) vytvori prostor pro one click instalaci, po instalaci se pusti definovany konfiguracni skript
		- JSON -> Parser -> List instalovatelnych aplikaci -> Tlacitko install
	- hlavni cizi dily
		- nix
			- hlavni package manager
			- Duvod: nejvetsi repository s plnou funkcnosti jak na linuxovych systemech tak i na macOS
			- *aplikace, nastroje, jazyky apod*
		- docker
			- kontejnarizace
			- *databaze, jiz predpripraveny backend, apod*
		- git, wget, apod
			- pro vse ostatni
	- bude existovat nastroj pro vytvareni techto JSONu
	- JSON bude vypadat neco jako:
		- ![[JSON-vzor.png]]
		- *ps. hodne hruby navrh*
	- verzovani bude podle tvurce JSONu
		- kolonka pro verzy
		- nevyplnena -> nejnovejsi a aktualizovatelna
		- kolonka pro zamrazeni verze
			- zadne aktualizace
			- vzdy se stahne jen ta urcita verze
	- hruby nacrt gui (*velice hruby*, vytvoreno v excelu)
		- ![[gui-vzor.png]]
	- 2 hlavni moznosti aktualizovani "repozitare"
		- vytvorit github repository CISTE na JSONy, ucitele budou vytvaret pull requesty, pak student vyvola update
			- pr. zmackne dve sipky do kruhu, napise "repository update" do cli, apod
		- ucitel bude tyto jsony zasilat studentum, student ho jej pak vlozi do urciteho adresare
3) vytvorit a otestovat sadu JSONu
	- zeptat se vsech ucitelu (ktery software potrebuji pro vyuku)
	- vytvorit tyto JSONy podle pozadavku
4) urcit minimalni pozadavky na system
	- urcit nejtezsi program potrebny pro rozbehani
	- nejspise docker na konci dne, ten ma dost vysoky pozadavky
5) Testovani
	- prvni faze bude jen ciste moje testovani
	- druha faze bude testovne nasazeni do ruznych virtualek a pocitacu, studenti testujici muj vyrobek pak vyplni formular