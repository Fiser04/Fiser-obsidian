- **vytvarim tridy a metody ktere se snazi chovat obecneji, schopnost pracovat s. vice datovymi typy a nejsou presne vazany na nejaky urcity**
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