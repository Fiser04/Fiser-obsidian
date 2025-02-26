https://www.algoritmy.net/article/75/Porovnani-algoritmu
Selection sort
	hleda minimum a da ho na zacatek (prohazuje)
	n^2
	4, 8, 9, 2
	2, 8, 9, 4
	2, 4, 9, 8
	2, 4, 8, 9
	optimalizace defakto neni
Buble sort
	hleda minimum ve dvojicich
	n^2
	7, 9, 12, 6
	7, 9, 6, 12
	7, 6, 9, 12
	6, 7, 9, 12
	optimalizace
		pridam bool, kdyz se neco zmeni zmenim bool, pokud nezmeni tak konci
		preskakovani posledniho cisla
Insert sort
	vytvari skupinky, ktere pak s jednim cislem porovnava, pak to vklada na spravne misto (posouva)
	n^2
	1, 4, 6, 2, 5
	1 |, 4, 6, 2, 5
	1, 4 |, 6, 2, 5
	1, 4, 6 |, 2, 5
	1, 2, 4, 6 |, 5
	1, 2, 4, 5, 6
	optimalizace (mala)
		poprve vzit druhe cislo
Merge sort
	roztrha to na mensi pole
	nejlepsi je nlog(n), nejhorsi je nlog(n)
	![[Pasted image 20241023172816.png]]
Quick sort
	nejhorsi pripad n^2, jinak nlog(n)
	https://www.algoritmy.net/article/10/Quicksort