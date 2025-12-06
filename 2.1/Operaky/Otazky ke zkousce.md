- Vysvětlete klíčový rozdíl mezi programem a procesem v kontextu operačního systému.
	- proces je jedna instance ktera prave bezi a dela prave jeden ukol
	- program
		- bezici program je jen mnozina procesu
		- jinak je to skupina prikazu

- Popište, co je to deadlock a jaké jsou typické podmínky, které musí být splněny, aby k němu mohlo dojít.
	- jedna akce ceka na tu druhou a ta druha ceka na tu prvni
	- musi se cekat, cykleni, nejde prerusit, jedna vec muze mit jen jednu vec

- Vysvětlete hlavní rozdíl ve výkonu a procesu překladu mezi kompilovanými a interpretovanými jazyky.
	- kompilovany
		- kod se veme, prelozi se to do urciteho kodu kteremu rozumi prostredi a ten zdrojak se pousti
	- interpretovany
		- pousti se primo ten zdrojak

- Jaká je hlavní výhoda interpretovaných jazyků (jako je Bash nebo Python) z hlediska multiplatforního použití a proč je to v IT důležité?
	- nemusim to kompilovat pro kazdy operak/zarizeni zvlast

- Vysvětlete význam termínů "Shell" a “Bash” a popište, jakou roli hraje Bash v Unixových systémech.
	- prostrednik mezi osobou a operacnim systemem

- Vysvětlete, jak v terminálu vypíšete seznam běžících procesů, jaké informace uvidíte a jak některý proces ukončíte?
	- vetsinou pouzivam nejakou podobu top (btop, htop), jinak ps A a pak kill nebo pkill, vetsinou tam je nazev/cesta, kolik to zere ram, user pod kterym to bezi, kolik to zere cpu

- Vysvětlete význam prvního řádku v Bash skriptu, tzv. shebangu (např. #!/bin/bash), a proč je důležité jej uvést.
	- pod jakym shellem to mam poustet, protoze muzu mit treba nejake aliasy, nebo to chci poustet pod pythonovskym shellem a ty prikazy by byly uplne jiny

- Uveďte tři sady uživatelů, pro které se v Unixu definují souborová oprávnění, a jaký je jejich vztah k souboru.
	- owner, group, other

- Popište, jaké jsou tři základní typy oprávnění a jaké číselné hodnoty se jim přiřazují v systému Unixových oprávnění. Jaký příkaz použijeme pro nastavení těchto práv?
	- read (4), write (2), execute (1), pak je specialni s coz je execute as owner
	- chmod bud primo ciselne nebo +r/w/x pro vsechny

- Vysvětlete význam číselného kódu 755 pro souborová oprávnění v Unixu z hlediska vlastníka, skupiny a ostatních uživatelů. Jaký příkaz použijeme pro nastavení těchto práv?
	- vlastnik ma plne opravneni, skupina a ostatni muzou jen cist a spoustet
	- chmod 755 nazev_souboru

- Vysvětlete, jakým způsobem funkce 'Pipelines' (roura/svislítko |) v Bash zvyšuje efektivitu při práci s daty nebo příkazy.
	- veme output z jednoho prikazu a narve to do dalsiho
	- priklad uziti je grep

- Jaký je rozdíl mezi uživatelskou a systémovou proměnnou v Bash a uveďte příklad systémové proměnné?
	- uzivateskou si delam svoje
		- moje="jes"
	- systemova je preddefinovana systemem, zasadne se znaci velkymi pismeny (PATH)

- Vysvětlete, k čemu slouží poziční parametry ($1, $2, ...) v Bash skriptu a jak usnadňují automatizaci?
	- proste imput parametru, kdyz budu mit svuj vlastni "cat", do radky napisu cat neco a to neco se dostane jako hodnota promene do skriptu

- Proč se v Bash skriptech pro složitější matematické operace často používají externí nástroje jako bc? Co tento zajišťuje?
	- protoze bash neumi pocitat v desetinych, jen v int, bc = basic calculator
	- echo "scale=2; 10 / 3" | bc

- Jaký je hlavní rozdíl mezi příkazy ps a top z pohledu monitorování procesů na Linuxovém systému?
	- ps jednou vypise seznam procesu
	- top je aktivne aktualizuje

- Jaká je výhoda použití pole (array) v Bash skriptu oproti použití mnoha jednotlivých proměnných?
	- organizace, jednoduche prochazeni pomoci cyklu apod

- Popište, jak se pracuje s hodnotami v poli. Výpis celého pole, výpis konkrétní hodnoty, přidání a odebrání hodnot.
	- soubory=("file1.txt" "file2.txt" "file3.txt")
		for soubor in "${soubory[@]}"; do
		    echo "Zpracovávám: $soubor"
		done
	- echo "${soubory[1]}"
	- soubory+=("file4.txt")
	- unset soubory[1]

- Z jakých příkazů se skládá podmínka? Jaké máme logické operátory a aritmetická porovnání?
	- if [ podminka ]; then
	- elif [ podminka ]; then
	- else
	- fi
	- stringy [[]]
		- Rovnost - `==`
		- Nerovnost - `!=`
		- Prazdny - `-z "$str"`
		- Neprazdny - `-n "$str"`
		- Lexikograficky menší - `<`
		- Lexikograficky vetsi - `>`
	- cisla (())
		- - Rovnost - `==`
		- Nerovnost - `!=`
		- menší - `<`
		- vetsi - `>`
		- Větší nebo rovno - `>=`
		- Menší nebo rovno - `<=`

- Jaké známe typy cyklu v Bashi? Vysvětlete rozdíly a uveďte příklad použití.
	- for
		- vim jak dlouho pojede
		- for i in {1..100}; do
			- echo "n"
		- done
	- while
		- nekonecny ktery to nejdrive zkontroluje
		- kdyz je podminka true tak delej
	- until
		- opak while
		- kdyz je podminka false tak delej

- Uveďte, jakou funkci použijete pro zjištění zbytku po dělení. Jak tato funkce funguje a co vrací?
	- modulo
	- echo $((10 % 2))

- Proč je důležité ovládat pokročilé nástroje pro správu souborů z hlediska efektivity a úspory času? Na jaké úkony byste tyto nástroje využili?
	- 