authentizace = overeni identity
autorizace = pusteni na zaklade authentizace (pristup na sit, ...)

typy authentizace
	- to co znam
		- heslo, pin
		- vyhoda
			- lze zmenit
			- nepotrebuju ctecku
		- nevyhoda
			- tezko se to pamatuje
			- ...
	- to co mam
		- kryptograficky klic (fleska, karta)
		- biometrie (prst, oblicej, ocni pozadi, krevni reciste, hlas)
			- vyhoda
				- jednoduchost (proste dojdu, prilozim prst a jsem tam)
			- nevyhoda
				- nelze zmenit (nemam nekonecno prstu, oci, rukou, ...)

authentizace jmenem a heslem
	- to co znam
	- musim heslo chranit
		- nesmi nekde vyset
	- slozitost hesla
		- nesmi jit snadno uhadnout
		- dostatecna delka
		- pocet moznosti
			- V’(n,k) = n^k
				- n = pocet znaku v znakove sade
				- k = delka hesla
	- hrozba utajeni hesla
		- odposlech na siti
			- sifrovana komunikace (https, ssh, ...)
		- ziskani ulozeneho hesla (treba nekde v souboru)
		- ziskani hesla z operacni pameti
		- získání hesla pomocí sociálního inženýrství
			- fishing, atd.
		- fyzicky utok
			- proste ukradnu ten komp, vydirani, muceni, atd.
	- vynutit bezpecnostni politiku
		- s rozumem
			- treba nenutit menit hesla kazdej mesic
			- je to na adminovi (podle sily hesel, atd.)
				- doporuceni je kdyz neni dvoufaktorova authentizace 42 dnu, s asi pul roku (takle to bylo pred par lety, ZKONTROLUJ JAK JE TO DNES, TO CHCE U ZKOUSKY)
		- jak moc se to heslo musi menit
			- treba zmen 8 znaku
		- interval meneni hesel
			- resilo by to obejiti povinosti menit heslo (dojdu, dam zmenit heslo, dam zmenit ..., dokud nepresahnu historii hesel)
		- zamykani uctu
			- resi to brute force
	- jednorazova hesla
		- minimalizuje hrozby
			- hadani, odposlech, ziskani ulozeneho
		- treba to co mobil generuje pri vicefaktorove authentizaci

vicefaktorova authentizace
	- casto dvoufaktorova (heslo - kod z SMS, heslo - biometrie, ...)
	- smysluplnejsi je kdyz je to na vice zarizeni
		- treba se chci prihlasit na kompu a druha authentizace je na mobilu

dnes je vse zahashovano
	- vemu heslo, zahashuju a overim hash
	- casto SHA256
