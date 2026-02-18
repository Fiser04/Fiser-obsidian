- defensivni programovani
	- jednodussi resit prevenci nez nasledky
	- iterakce klient-server
		- predpoklad dobreho chovani od klienta (kontrola pozadavku u klienta) vs predpoklad spatneho chovani (kontrola pozadavku na serveru)
		- nejlepsi je to resit na serveru, protoze pokud klient vola methodu serveru xkrat, tak se musi xkrat resit

- typicke chyby
	- nespravna implementace
	- nepatricna zadost o objekt
		- nullpointer, index
	- nekonzistentni/nevhodny stav objektu
		- zmena chovani objektu na ktere zalezi neco jine

- prace s chybami
	- ohlasovani
	- zpracovavani