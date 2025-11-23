- struktualni diagram
- diagram trid
- hlavni element je trida
- https://www.itnetwork.cz/navrh/uml/uml-class-diagram-tridni-model
- navrh tridy
	- ![[Pasted image 20251113114633.png]]
		- private
			- viditelny jen pro ni
		- verejny
			- viditelny vsude


- vztahy
	- ![[Pasted image 20251113122730.png]]
	- dedicnost
	- realizace
	- kompozice
		- je soucasti
		- nedava smysl bez ni
		- vznika a zanika
		- D je soucasti B
		- takze B nemuze existovat bez D a naopak
		- pouzije se pri masterdetail
		- *clovek muze mit 0 az n adres, ale adresa musi mit jednu cloveka*
	- agregace
		- B je slozene z E, ale B muze existovat bez nej
		- napsat jen kdyz je B seznam E
	- asociacni trida
		- ![[Pasted image 20251120122731.png]]
		- master detail

![[Pasted image 20251113125029.png]]
 - produkt je bud *solitair* (jen jeden salek), a nebo set produktu (sada salku)

DU
- moje reseni![[Pasted image 20251120114801.png]]
- spravne![[Pasted image 20251120115316.png]]
- ![[Pasted image 20251120122138.png]]
- 