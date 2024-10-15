Datove typy
	Specifikuje
		Mnozina hodnot
		Mnozina operaci
	Pr typu
		int
			32bit, cela cisla, cca +-2 miliardy
			mnozina operaci
				aritmeticke +,-,x,/
				relacni (porovnavaci) = =,<=,>=,!=,>,<
		byte (8bit)
			-128 ... 127
		double (64bit)
		boolean (8bit)
			false/true
		char (16bit)
			znak
		short
		long
		float
Promenne a prirazeni
	deklarace (a inicializace)
		int alfa;
		alfa = 0;
		or
		int alfa = 0;
Literal
	to co ukladam do promene
		Literal pro datovy typ int je 34
		Literal pro datovy typ string je "jes"
		Literal pro datovy typ boolean je false
		...
Konstanta
	deklarace je stejna jako promena ale je nemena (nelze pouzit prirazovaci prikaz)
	nepsane pravidlo - konstanta se pise caps-lockem
	final int MAX = 100;
Vyraz
	prava strana prirazovaciho prikazu
	vyraz muze obsahovat
		premenne
		konstanty
		volani funkci
		binarni operatory
		unarni operatory
		zavorky
	resi se priorita
		x + y / 2 = x + (y / 2)
Aritmeticke operatory
	unarni - (zmena znamenka)
	binarni x,/,% (nasobeni, deleni, zbytek po deleni)
	binarni +,- (scitani, deleni)
	specialni operatory
		x++ (dej promenou a pak pricti 1), ++x (pricti 1 jednicku a pak dej promenou)
		x--, --x
Relacni operatory
	porovnavani
	>,<,>=,<=,= =,!=
Logicke operatory
	unarni ! (negace)
	binarni && (AND)
	binarni || (OR)
Matematicke funkce
	abs, sin, cos, sqrt (druha odmocnina), log (prirozeny logaritmus)
	je potreba knihovna Math
	