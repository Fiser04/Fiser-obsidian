Data a databáze (Data, databáze, databázový systém, SŘBD, vývoj databází)
	- data
		- dohodnutym zpusobem zaznamenana fakta
		- *rada cisel*
	- informace
		- data kterym dame kontext (vyznam)
		- *rada cisel -> telefoni cislo*
	- databaze
		- usporadana data podle nejake struktury
	- databazovy system
		- databaze s systemem rizeni dat
	- SŘBD
		- system rizeni dat
	- model
		- zjednodusena reprezentace reality
	- analitik
		- vytvari model
	- designer
		- navrhuje databazi podle modelu
		- struktura a typ
	- coder
		- ten co ji napise
	- pozadavky na nastroj pro analyzu
		- jednoduchy
		- jednoznacny
		- pochopitelny
		- univerzalni
	- pan Codd
		- autor clanku o relacnich databazich


Entitně relační model (Entita, instance, atribut, relace (vztah), kardinalita, parcialita)
	- entita
		- pojmenovana mnozina instanci
	- instance
		- prvek instance
	- atribut
		- vlastnost
	- relace (vztah)
		- vztah mezi enitytama
		- *stat ma mesta*
	- kardinalita
		- to jsou vztahy podle poctu
		- 1:1
			- *Jeden student má jedno osobní číslo.*
		- 1:M
			- *Jeden učitel učí mnoho studentů.*
		- M:N
			- *Studenti jsou zapsáni do mnoha kurzů, kurzy mají mnoho studentů.*
	- parcialita
		- to je moznost jestli to nastane
		- musi/nemusi


Relační model (Relace, atribut, doména, klíč, superklíč, cizí klíč)
	- relace
		- "tabulka"
		- realcni schema + data
		- relace je mnozina uz uskupenych entic
	- relacni schema
		- mnozina atributu
	- atribut
		- vlastnost
	- domena
		- mnozina vsech moznych hodnot ktere mohou nastat
		- *musim se narodit pred tim nez umru*
	- klic
		- mnozina atributu
		- musi byt
			- unikatni
			- minimalni
	- super klic
		- mnozina 2 atributu u kterych se kazdy zaznam lisi
		- unikatni
	- primarni klic
		- nemeny
		- nenulovy
		- unikatni
		- minimalni
	- cizy klic
		- prenos primarniho klice z jedne tabulky do druhe
		- musi byt stejny datovy typ
	- relacni model neumi m:n
		- resi asociaci


SQL (Historie SQL, normy, DDL, DML, DCL, TCL)
	- historie
		- vznik v 70. letech firmou IBM pod nazvem SEQUEL (Structured English QUEry Language)
	- normy
		- SQL-86 (SQL1)
			- prvni standard
		- SQL-92 (SQL2)
			- pridani veci jako JOIN
		- SQL-1999(SQL3)
			- objektove typy a rekurze
	- DDL
		- Data **Definition** Language
		- struktura databaze
		- CREATE, ALTER, DROP
	- DML
		- Data **Manipulation** Language
		- prace s daty
		- SELECT, INSERT, UPDATE, DELETE
	- DCL
		- Data **Control** Language
		- prace s pravy
		- GRANT, REVOKE 
	- TCL
		- **Transaction Control** Language
		- sprava transakci
		- COMMIT, ROLLBACK, SAVEPOINT


Normální formy (1NF, 2NF, 3NF)
    - 0NF
	    - data jsou v relacich
	    - jsou tam primarni klice, atd.
	- 1NF
		- data jsou atomicka
	- 2NF
		- plna funkcni zavislost
		- **vsechny atributy jsou funkce zavisle na primarnim klici a kandidaty**
		- proste kdyz vemu primarni klic tak mi musi z nej vychazet i dalsi atribut
		- poruseni vede k redundanci
	- 3NF
		- nesmi nastat transportni zavislost
		- **z jednoho atributu nesmi vychazet druhy**


Indexace (Práce s pamětí, použité datové struktury)
	- prace s pameti
		- data se ukladaji do bloku
			- vymezena velikost na disku
			- aby se nemuselo neustale alogovat dalsi prostor tak se aloguje po velikostech
	- full table scan
		- postupne taham bloky do pameti a skenuju je
		- pro zlepseni se pouziva styl FAT file system
			- do tabulky zapisuju kde to je (id a lokace na disku)
	- datove struktury
		- B+ stromy
			- b = vyvazeny
			- ![[Pasted image 20250507155118.png]]
		- hash index
			- udelem z hodnoty hash (otisk) hodnoty
			- treba sectu a pak modulo a podle toho to hledam
		- bitmapovy index
			- udelam tabulku ve stylu
			- muz zena helikoptera
			- 1   0    0
			- 0   1    0
			- 0   0    1
			- a hledam podle 1
		- full textovy index
			- rozlozeni slov
	- indexuje se primarni klic a to co casto hledame


Transakce (CAP, ACID, transakční žurnál)
	- CAP
		- teoreticky koncept
		- konzistence - dostupnost - odolnost (vuci rozdeleni)
		- nelze najednou splnit vse
	- ACID
		- Atomicka
			- transakce je atomicka operace
			- *provede se cela nebo vubec*
		- Konzistentni
			- plati jen jedna pravda pro vsechny
			- *jedna pravna plati pro vsechny, jedna pravda plati pred transakci a dalsi po transakci*
		- Izolace
			- kazda transakce chraneno od te druhe
			- vice transakci probehnou ve stejnou chvili a neprekazi si
		- trvalost
			- transakce po dosazeni potvrzeni je povazovana za trvale ulozenou
			- *az se mi potvrdi (COMMIT) tak jsou data ulozena, kdyz se nepotvrdi tak data povazuji za neulozena*
	- transakcni zurnal
		- zurnal toho co se z daty delalo, kdyz by nastal vypadek, tak at se vi co se udelalo a obnovilo se to


Řízení konkurenčního přístupu k datům (Chyby při víceuživ. přístupu, zámky, známky, multiverze)
	- chyby pri viceuzivatelskem pristupu
		- dirty read
			- cteni dat ktera nebyla jeste potvrzena
		- ztrata aktualizovanych dat
			- problem jizdenek a 2 kupujici
		- nesprapny soucet
			- smichani aktualizovanych a neaktualizovanych dat
		- problem neopakovatelneho cteni
			- pocitam dph a najednou se zmeni
		- deadlock
			- proste se vice snazi o stejny data
	- zamek (lock)
		- zamykani radku
		- true/false
		- ochrana dat pred nekonzistentnimi operacemi
		- viceurovnovy zamek
			- sdilene
				- pro cteni
				- zacatek cteni -> +1 do x
				- konec cteni -> -1 do x
			- exkluzivni
				- pro zapis
				- jen jeden muze najednou zapisovat
		- dvoufazove zamykani
			- rozdelim do dvou fazi
			- nejdrive ziskavam zamky
			- pak je uvolnuju
			- existuji vice moznosti provedeni
				- pastupne nabirani a postupne uvolnit
				- najednou nabrat a postupne uvolnit
				- postupne nabrat a najednou uvolnit
	- znamka (timestamp)
		- vysvetleni
			- *X je jeden radek, v systemu bezi vetsi pocet transakci (T3, T10, T15), to cislo je ta znamka (id transakce posloupnosti), dam ke kazdemu X 2 hodnoty, WS (Write Stamp - posledni transakce ktera od sud cetla, na tom zalezi cteni) a RS (Read Stamp - nejmladsi transakce ktera od sud cetla, na tom zalezi zapis)*
			- *takze kdyz mam T3, T10, T15 a WS = 5 a RS = 12*
			- *T3, nepovolim cteni protoze je to mensi jak 5, nepovolim zapis protoze je to mensi jak 12*
			- *T10, povolim cteni protoze je vetsi jak 5, zapis nepovolim protoze je to mensi jak 12*
			- *T15, povolim cteni protoze je vetsi jak 5 a prepisu RS na 15, povolim zapis protoze je vetsi jak 12 (furt pracuje s starou hodnotou) a prepisu WS, WS nesmi byt vetsi jak RS*
		- problem nastava kdyz 2 najednou protoze to ze jenom precetl hodnotu tak uz to zmenilo RS a mezitim kdy jsem chtel jit zapsat tak si to nekdo taky precetl a ted potrebuju si to precist znovu atd.
	- multiverze
		- read-only operace provedou vzdy (teda kdyz ty data v tu dobu existovaly)
		- tudiz s kazdym zapisem vytvarim novou verzi dat (treba indexovat)
		- *mam T8, RS = 12 a WS = 5, tudiz mohu cist ale nemuzu psat, tak si to prectu a nic neprepisuju, najednou se vzala T15, ktera muze zapsat, no tak zapise ale zmeni se verze dat, ted je RS a WS = 15 a index je treba 2, ted najednou prisla T20, ta si precte a zapise, z RS a WS = 20 a index na 3, a cirou nahodou se probudila T13 ktera chce cist, no tak najdu transakci pro kterou si muze precist a precist muze taky, jen se udela dalsi verze 4 (ktery je uplne burt co se stalo v 3. verzy, proste to prepise) a najednou se spawne T3 a chce cist X, cist nemuze protoze X vzniklo az po transakci T3 a X vzniklo transakci T5*
			- + uchovavam v systemu vsechny verze dat ktere jeste potrebuju
				- *kdyz mam transakce ktery maji cislo az moc male tak je necham (zbyva mi transakce T20, T30, T40 a posledni verze jsou z T5 a T10, tak na co mi je T5 kdyz mam novejsi verzy a nemam nic mezi 5 a 10)*
			- + deadlock nenastane (protoze necekame)
			- - narok na pamet


Caste SQL prikazy
	- CREATE/ALTER/DROP
		- DATABASE
		- TABLE
	- SELECT/INSERT/UPDATE/DELETE
	- JOINS
		- INNER
			- vraci jen schodujici udaje
		- LEFT
			- vrati vse z leve a k tomu da schodujici z prave
		- RIGHT
			- vrati vse z prave a k tomu da schodujici z leve
		- FULL
			- vrati vse
		- CROSS
			- kartezsky soucin
