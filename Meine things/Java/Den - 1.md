### spring framework
- popularni framework pro vytvareni aplikaci v jave
	- *proste jakoby bedna s naradim pro praci*
- obsahuje moduli
	- core
		- resim dependecy
		- staram se o objekty
	- web
		- staveni samotne webove aplikace
	- data
		- prace s databazi
	- aop
		- aspect oriented programming
		- zabezpeceni apod. abych to nerval do coru
	- test
		- testovani

### spring boot
- pokud chci postavit webovou aplikaci tak potrebuju web server, atd., spring boot tuhle cast "preskakuje"

### dalsi spring projekty
![[Pasted image 20251105005735.png]]

### struktura projektu
- struktura souboru projektu
	- .mvn
		- aby compile probehl na vice pc s stejnou verzi mvn
	- mvnw
		- pro mac a linux
	- mvnw.cmd
		- pro windows
	- pom.xml
		- srdce maven projektu
		- dependecies
		- informace, apod
	- src
		- kod
		- java
			- pro javu
			- StoreAplication.java
				- muj main
		- resources
			- ne javovsky
			- pr html, css
			- aplication.properties
				- nastaveni databaze, atd.

### dependency managment
- dependency
	- knihovna treti strany, pouzivame je jako nastroje navic, ktere nemame jako zakladni
- spring boot starter web
	- takova smesice tech zakladnich
	- ![[Pasted image 20251105011617.png]]
	- maven center
		- npm ale pro maven a javu

### MVC spring bootu
- [[4 - MVC a MVP architektura]]
- MODEL VIEW CONTROLER
- ![[Pasted image 20251105013302.png]]
- 