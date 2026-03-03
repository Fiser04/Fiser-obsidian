- **vytvarim tridy a metody ktere se snazi chovat obecneji, schopnost pracovat s vice datovymi typy a nejsou presne vazany na nejaky urcity**
- negenericke kolekce
	- kolekce typovany pro objecty typu Object
	- ![[Pasted image 20260224095344.png]]
	- **Objevuji se chyby za behu**
- genericka kolekce
	- naznacene typovim parametrem
	- ![[Pasted image 20260224095458.png]]
	- **Snaha je prenechat hledani chyb prekladaci**

- prinosy generickeho pristupu
	- explicitne urcit typu
		- eliminace pretypovani
	- silnejsi typova kontrola podle statickeho typu
	- moznost vyuziti generickych algoritmu

- definice
	- schopnost parametrizovani
	- typovy parametr je zastupnym znakem

![[Pasted image 20260224095950.png]]

- jmenne konvence
	- jedno velke pismeno
	- ![[Pasted image 20260224100323.png]]

- typovy parametr
	- zastupne oznaceni typu
- typovy argument
	- konkretni typ dosazeny
- instance parametrizovaneho typu
	- generický typ po dosazení typového argumentu za typový parametr
	- *ne instance ve smyslu bezici trida, ale jako "dedicna"*
- parametricky typ
	- faze predpisu
	- za T muzu mit cokoliv
	- Box< T >

- instanece generickeho typu
	- Box< String >

- pouziti
	- ![[Pasted image 20260224101634.png]]
- omezeni
	- omezuje se ze shora slovem extends
	- takze T musi byt podtyp
	- lze i vicenasobne pomoci &
		- vznika prunik (*prusecik*)
	- kdyz tam dam Integer tak tam Object nedam

- zastupne znacky (wildcards)
	- libovolny ale nam neznamy datovy typ
	- vs typovy parametr
		- konkretni je kdyz chci s ni pracovat
		- otaznik jediny co rika *bude to genericky lol* tudiz s nim nemohu nadale pracovat
	- ![[Pasted image 20260224103448.png]]
	- lze udelat i omezeni z dola
		- jdu nahoru
		- kdyz tam dam Integer, tak muzu tam dat Object

- implementace genericity
	- vymazani typu
		- typovy parametr je zmenen na nejvyssi mozny typ (v zakladu object) s extends (ta nejvyssi)
			- tudiz kdyz mam Node< T > tak kdekoliv kde bude T tak bude Object
	- premostovani metody
		- nekdy si musi prekladac zachovat znalost o typu
		- prekladac si tudiz vytvari premostovaci metodu (bridge)
		- *defakto metoda ktera jen pretypuje object na to co chci*

- typi vyuziti
	- pouziti jiz existujicich
		- ArrayList
	- navrh a definice generickych typu a metod

- limity
	- nelze pouzit jako genericky typ primitivni typ
		- nemuzu mit ArrayList< int >
		- muzu mit ArrayList< Integer >
	- nelze vytvaret instance typovych parametru
		- `E element = new E(); // compile time error`
			- nelze to udelat na 100%, ale muze byt neco takoveho, ALE, neni to to same
				- `public static <E> void append(List<E> list, Class<E> cls)throws Exception {E elem = cls.newInstance();list.add(elem);}`
	- nelze vytvaret pole parametrickych typu
		- `List<Integer>[] lists = new List<Integer>[2];// compile-time err.`
	- nelze zachytit instanci parametrickeho typu
		- `catch(T e)` nelze
	- nelze mit generickou vyjimku
		- `class MathException<T> extends Exception { … } // compile-time error`
	- nelze pretezovat metody
		- `public class Example { public void print(Set<String> strSet) { } // compile-time err. public void print(Set<Integer> intSet) { } // obojí Set<E> }`
