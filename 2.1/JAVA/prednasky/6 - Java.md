- datove struktury
	- typovany jazyk (int, String, ...)
	- datovy typ
		- mnozina hodnot (int)
		- mnozina operaci (!=, >, ...)
	- primitivni datovy typ
		- ![[Pasted image 20251020095545.png]]
		- co realne staci
			- int, double
			- char
			- boolean (realne jeden byte)
	- slozite datove typy
		- odkaz na pamet (odkaz na objekty)

- teminologie
	- promena
		- datovy prvek (*objekt*) s menou hodnotou
	- deklarace
		- int i;
		- int x, y;
	- inicializace
		- i = 0;
	- deklarace a inicializace
		- int i = 0;
	- prirazovaci priklaz
		- i = 37;
	- lokalni promena
		- nema definovanou hodnotu


- literaly a konstanty
	- nemena konkretni hodnota
	- inicializuje se jen jednou
	- final int I = 34;
	- casto se pise velkymi pismeny s potrzitkem
		- final int MAX = 100;

 - vyrazy
	 - predepisuje zpusob vypoctu hodnoty urciteho typu
	 - x + y * z -> x + (y * z)
	 - x + y + z -> (x + y) + z

- prirazovaci prikaz
	- promena = vyraz; (j=5;)
	- promena = promena operace vyraz; (j = j + 5;)
	- promena operace = vyraz; (j+=5;)

- typove konverze
	- implicitni
		- automaticky
	- explicitni
		- musim ji ja sam resit

- operatory
	- aritmeticke
		- unarni
			- - (-20)
		- binarni
			- * ,  / , %
			- + , -
		- inkrementacni a dekrementacni
			- x++, x--
			- ++x, --x
	- relacni
		- > , < , == , !=, >=, <=
	- logicke
		- !, ||, &&

- navratovy typ funkce
	- public *int* max(int a, int b){}

- prikaz vetveni
	- prikaz if() a switch()

- prikaz cyklu
	- while(), do ... while(), for()

- prikaz skoku
	- continue
		- preskoci pruchod cyklem
	- break
		- ukonci cely cyklus

 - procedury a funkce
	 - volam ten samej kod nekolikrat
	 - snaha o hromadnost
	- funkce vraci hodnotu (int, String, ...)
	- procadura nevraci (void)
	- obecne jmeno je Methoda
	- parametr
		- konkretni hodnota
		- int n = funkce(*x*);
	- argument
		- zastoupeni
		- int funkce( *int n* ){}

- static
	- tridni methody a promene

- jednoduche kolekce
	- pole
		- nemenitelna velikost
		- jen jeden datovy typ
		- 