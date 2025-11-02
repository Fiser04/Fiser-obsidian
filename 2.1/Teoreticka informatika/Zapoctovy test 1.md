- regularni vyrazy
	- znaci se r
	- r = a + b
		- sjednoceni
		- 1 + 0 = { 0, 1 , 10, 01}
		- *proste bud to prvni, nebo to druhy nebo oboji v jakemkoliv poradi (01, 10)
	- r = a · b
		- zretezeni
		- 1 · 0 = { 10 }
		- *proste ty dve veci za sebou*
	- r = a*
		- iterace
		- a* = { ƛ , a, aa, aaa, ...}
		- *alespon nulakrat*

- upravy regularnich vyrazu
	- ![[Pasted image 20251031170741.png]]
	- (x + y)*  = (x* y*)*  je asi ten nejzajimavejsi, zbytek je klasika

- zapis jazyku
	- L = { w : w ∈ { a, b }* ∩ "aa" }
	- L -> jazyk
	- w -> slovo/slova
	-  { a, b }* ∩ "aa" -> nase abeceda a podminka
	- *jazyk je tvoreny ze slov, ktere jsou tvorene z abecedy "a" a "b" a musi obsahovat "aa"*

- *takze kdyz vemu regularni vyraz a vypisu vsechny mozne vysledky, tak mam jazyk*
	- r = ( a + b )*
	- L = { ƛ, a, b, ab, ba, aa, bb, aaa, ...}

- konecny automat
	- M = { q, Σ, δ, q0, F}
		- q -> mnozina stavu
			- *proste pocet kazdeho kruhu*
		- Σ -> vstupni abeceda
			- *mnozina vsech znaku*
		- δ -> prechodova funkce
		- q0 -> znak startu
			- *treba 0*
		- F -> mnozina koncu

- nedeterministicky (NKA)
	- muzu jit jednim znakem do vice stavu
	- je zjednoduseny
- deterministicky
	- presny
