V Java je jeden hlavni objekt Object
	-modifikace Object = modifikace vseho
-zalozeno na modelovani realneho sveta
-zalozeno na vytvareni struktury navzajem komunikujicich objektu
-komunikace probiha pomoci zprav
-caste pojmy: 
	-dedicnost
		-z objektu/typu lze vytvorit defakto strom 
			-"mam dopravni prostredek, ma vlastnosti jako rychlost, takze lod ma take vlastnost rychlost a lod ma svoje vlastni vlastnost plave"
			-defakto setrim kod tim 
	-zapouzdreni
		-objekt je ohraniceny
			-"objekt by se mel starat sam o sebe, neboli treba zarizeni resi teplotu aby se neprehral"
	-polymorfismus
-kazdy objekt ma sve atributy (pr vlastnost)
	-atributy jdou  prezentovat i jinym objektem, ktery predstavuje komponent
		-"auto ma motor"
-trida
	-popis skupiny objektu
		-stejne chovani, stejne vlastnosti
-komunikace
	-"posilani zprav"
	-jeden posle, druhej posloucha
		-"nastartuj auto > motor start"
-instance
	-konkretni objekt vytvoreny podle predpisu
	-"trida je lod(ma pohon, plave), instance je lod na rybniku x v case x s touhle barvou..."
	-je vytvoreno konstuktorem
		-hlavicka podobna metode, stejne jmeno jako trida
		-prazdny konstruktor je implicitni
		![[Pasted image 20241104102738.png]]
		![[Pasted image 20241104102907.png]]
	-chovani je odkazovano na tridu, vlastnosti ma svoje
		-"vlastnosti zmenim, chovani je dane tridou"
-zpravy
	- x = car.start();