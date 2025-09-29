- abeceda
	- sigma
- retezec
	- hromada znaku abecedy
	- prazdny retezec 
		- lambda (**λ**)
		- $$
		λ
$$
	- mnozina vsech retezcu 
		- sigma s hvezdou
		$$
		Σ^*
$$
	- mnozina vsech neprazdnych 
		- sigma s pluskem
		- $$
		Σ^+
$$

- formalni jazyk
	- L
	- podmnozina mnoziny vsech moznych retezccu nad danou abecedou
		- proste kus z Σ^*
	- vycet
		- vypise vse co je v nem
		- L = {1, 11}
	- charakteristicka vlastnosti
		- L5 = {0^n x 1^n:n je elementem N}
	- operace
		- mnozinove operace
			- sjednoceni, prunik, doplnek (opak jazyka), rozdil (to co je rozdilny)
		- retezcove
			- soucin (proste plus v jave), iterace (pocet opakovani znaku a^2 -> aa), reverze (jes -> sej)

- regularni vyrazy
	- sjednoceni
		- 1 + 0 -> {0, 1, 10}
	- zretezeni
		- 1 . 0 -> {10}
	- iterace
		- 1^* -> {lambda, 1, 11, 111, 1111, ...}

- klasifikace jazyku
	- formalni jazyk
	- rekurzivne spocetne
	- kontextove
	- bezkontextove
	- a neco