- zaklady algoritmu
	- algoritmus -> presny navod/postup
	- casteji se setkame s planem (neni na nej kladen takovy pozadavek)
	- z planu pak prevest na algoritmus (jednoduse receno)
	- hlavni znaky
		- rezultativnost - ma cil
		- konecnost - ma konec
		- determinismus - je jasne v kazdem okamziku co se deje a co bude (error handaling)
		- elementarnost - pouziti zakladnich procedur (kroku), aby ten cil to dokazal chapat (1+1 vs udelej mi prumer z ...)
		- ? efektivnost - minimalni pouziti casu pro vzladnuti ukolu (viz O(n))
		- ? hromadnost a univerzalita - vyuziti algoritmu na vice veci (neudelam 1+1, ale kalkulacku co umi scitat)

- procesni struktury
	- to jak data spracovavam

- kroky pri vytvareni algoritmu 
	- zakladni
		- vykonny/operacni krok
			- cinnost ve stylu jako jdi_vpred, c=a+b
		- prikaz skoku v algoritmu
			- skok vpred/vzad
			- v jave implementovano v while a for
		- vetveni/rozhodovaci
			- if, switch case
	- rozsireny
		- poskladane z jinych
		- cyklus
			- opakovani
		- vstup a vystup
			- podobaji se vykonnym krokum
			- System.in, System.out

- datove struktury
	- resi mi data

- ukladani dat
	- pametovy prostor pro data
		- bere v uvahu typ (kvuli efektivite, int vs String)
	- promena
		- pametove misto k ukladani dat pri behu
		- obsah lze zmenit
	- konstanta
		- promena s jen READ pravy
	- oznacovani
		- x, vek, nasobicHlavniHodnoty

- dostupnost dat
	- promene
		- globalni
			- lze pracovat vsude (this.promena)
		- lokalni
			- zustava a zanika po konci algoritmu
	- podle kdy vznika
		- staticka (nemysleno static v jave)
			- defakto na zacatku, u kterych znam
		- dynamicka
			- postupne si je vytvarim

- jednoduche datove typy
	- ciselne
		- int (bud 0-4miliardy nebo <-2miliardy;2miliardy>, real(mantisa), byte
		- double (cislo * 10 na neco)
			- + dokazu se dostat na hodne male cisla
			- - zaokrouhluje (0 muze byt 0.00000005)
		- date a cas
			- od 1900 nebo od 1970 v milisekundach
	- znakove (kodovani znaku)
		- UTF8 (bud jedno bytovy nebo dvou), UTF16 (musi byt dvou bytovy), ascii
	- boolean
		- true/false, 0/1
		- stacil by jeden bit, ale pouziva se Byte

- slozene datove typy (skladaji se z kolekci)
	- skladaji se z zakladnich udaju
	- deli se na
		- s ruznym vyznamem
			- objekt
		- s stejnym vyznamem
			- pole, seznam
		- usporadane/neusparadane
			- seznam vs mnozina
	- priklady kolekci
		- zaznam
		- staticke pole (String[ ] s)
		- dynamicky seznam (jednosmerny, obousmerny LinkedList, FIFO (fronta), LIFO (zasobnik)), mapy (mam klic a hodnotu), stromy (binarni, vyvazene)
	- soubory
		- zvlastni typ kolekce, resime zpusob ulozeni
		- binarni vs textove
			- v zasade to same
			- textovy je binarni kterymu clovek rozumi jako textu
				- misto @#453sSDF23$242w je "nazdar"
				- ma radkovani narozdil od binarnich
		- sekvencni vs nahodny pristup
			- sekvencni je jednosmerny seznam
				- proste nactu vse postupne
			- nahodny je jakoby prace s polem
				- odkazuju se na urcitou pozici kde mam udaj ktery chci

- prostredky pro vyjadreni
	- prirozeny jazyk
		- "Popišme postup tak, aby byl použitelný pro dvě libovolná přirozená čísla (nejen pro 6 a 15):
			- označme zadaná čísla x a y a menší z nich d
			- není-li d společným dělitelem x a y, pak zmenšíme d o 1, test opakujeme a skončíme, až d bude společným dělitelem x a y"
	- graficky
		- pomoci vyvojovich diagramu
		- PS Diagram
	- pseudojazyk
		- `nsd(x,y):`
			`if x<y then d:=x else d:=y;`
			`while d "není dělitelem" x or d "není dělitelem" y do`
				`d:=d-1;`
			`nsd:=d;"
	- programovaci jazyk
		- `int nsd(int x, int y)`
			`{`
				`int d;`
				`if (x<y) d=x;`
				`else d=y;`
				`while (x%d!=0 || y%d!=0)`
					`d--;`
				`return d;`
			`}`

