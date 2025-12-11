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
	- mohu automatizovat nejake ukony
	- mohu efektivne hledat, nemusim furt davat `cd` a `ls` pomoci `find`

- Uveďte alespoň pět příkladů rutinních úloh, které lze automatizovat pomocí pokročilých nástrojů pro správu souborů, a stručně popište jejich přínos.
	- pripojovani disku
		- mountu adresar disku do urciteho adresare abych na nej mohl pristupovat
	- cisteni starych cache souboru (pr. davinci resolve rad zadelava disk, obcas to chce promazat)		
	- automaticke zalohovani na sitovy disk
	- konverze souboru (mohu mit balicek ktery umi konvertovat mezi png a jpg, ale ma hromadu prepinacu, tak to narvu do skriptu a mam klid)
	- vytvoreni souboru podle sablony

- Vysvětlete, k čemu slouží příkaz grep a jaké hlavní argumenty tvoří jeho syntaxi.
	- vytahovani textu z inputu
	- -i - neres velky maly
	- -f - adresar
	- -c - pocet existenci

- Jaký je hlavní rozdíl mezi příkazy seq a awk a proč je jejich kombinace užitečná pro generování a zpracování dat? Uveďte dva příklady použití.
	- seq - generace sekvence cisel
	- awk - dokaze i skripty

- Vysvětlete, k čemu slouží volba -i u příkazu grep a jaký je její praktický přínos při vyhledávání v souborech. Uveďte, jaké další dva přepínače můžete použít a kdy.
	- ignoruje velky a maly
	- -f file, primo z adresare
	- -V version, zjistit verzi grepu

- Co je to webový server? Jakou funkci zajišťuje a kd
	- server na kterem bezi web
	- serie sluzeb zajistujici odpoved na pozadavky get, post, apod.

- Co je to LAMP a co znamenají písmena L, A, M, P a k čemu ho můžeme využít?
	- Linux, Apache, MySQL, PHP
		- pro vytvoreni zakladni webovky

- Co je primárním úkolem webového serveru z pohledu prohlížeče?
	- odpovidat na get a na post

- Uveďte dva příklady populárních webových serverů zmíněných v prezentaci.
	- ngix
	- apache 2

- Jaký je hlavní rozdíl v architektonickém modelu pro zpracování požadavků mezi Apache a Nginx? Na jaký typ obsahu nebo způsob použití je který z nich vhodnější?
	- Apache thready, nginx eventy
	- apache pro dynamicky obsah kde je potreba modularita
	- nginx pro staticky obsah

- Jaká klíčová vlastnost Apache 2 zajišťuje jeho vysokou konfigurovatelnost a flexibilitu?
	- modularni
	- open source

- Pro jakou funkci je Nginx často ideální volbou, zejména pro rozložení zátěže na více serverů?
	- staticke weby
	- je rychlejsi

- Uveďte hlavní přínosy reverzní proxy.
	- ochrana proti utokum botu
	- kontrola zda je uzivatel validni
	- na server se dotazuje jen jiz znama sluzba, uzivatel jde k proxyne

- Vysvětlete, co je to databázový server. Jaké znáte a k čemu byste je využili.
	- server na kterem bezi databaze a mohu na ni pristupovat pomoci site
	- MySQL, MariaDB

- Jakými způsoby můžeme spravovat MySQL? Jak tyto způsoby získáme?
	- pomoci urcite aplikace jako treba dbeaber
	- pomoci command-liny
	- pomoci nejakeho weboveho prostrednika
		- myphpadmin

- Popište příklady hlavních typů hrozeb, kterým jsou operační systémy vystaveny.
	- ne zrovna chytry uzivatel nebo uzivatel ktery si mysli ze tomu rozumi a pak se divi ze mu po sudo rm -fr / nejde komp
	- malware
		- skodlivy kod, casto doneseny uzivatelem, ci prijde ze site
	- exploity

- Popište, co může narušení způsobit a jak by se projevilo.

- Co jsou kritické oblasti zranitelností operačních systémů a jaké známe?
	- pristupova prava
	- otevrene a nechrane sluzby
	- neaktualizovany software

- Jak byste zajistili bezpečnost OS z pohledu prevence, detekce a reakce?
	- antivirus
	- firewall
	- proskoleni uzivatelu
	- nebezet nepotrebne sluzby
	- aktualizovat

- Co je to Aplikační firewall (WAF) a jaká je jeho primární role v celkové bezpečnosti operačního systému (OS) a aplikací? Vysvětlete jeho fungování.
	- firewall pro webove aplikace, funguje na 7. vrstve osi modulu
	- operak to neresi
	- resi to utoky na web server pomoci treba sql injection a dalsi zname utoky (xss apod)

- Vysvětlete zásadní rozdíl mezi síťovým firewallem a aplikačním firewallem.
	- sitovy kontroluje packety ala odkud, od koho a kam to jde
	- aplikacni kontroluje vnitrek a hleda mozne utoky ala sql injection

- Jak aplikační firewall funguje a jaká pravidla můžeme aplikovat?
	- veme pozadavek, otevre ho, podiva se jestli tam nahodou neni neco co je znamyho ze bu mohlo byt utok
		- ' OR '1'='1

- Jaké známe aplikační firewally nebo služky, které ho zajišťují?
	- modsecurity
	- naxasi

- Co je to modSecurity a k čemu ho můžeme využít?
	- aplikacni firewall
	- aby mi na web server nedosel utok ala sqql injection, xss apod.

- Uveďte 3 druhy útoků, před kterými nás modSecurity chrání. Jak tyto útoky fungují a jakým způsobem jim modSecurity zamezí?
	- sql injection
	- xss
	- path traversal

- Co je podstatou útoku SQL Injection (SQLi) a jakým způsobem může útočník tuto techniku zneužít k získání neoprávněného přístupu k datům?
	- narvu do textovyho pole text ktery by mi muze pomoci ziskat neco co bych mit nemel
	- ' OR '1'='1
	- je dost velka sance ze je tam ucet admin a kdyz dam te prikaz tak to proste vyhodi true

- Vysvětlete, jaký je rozdíl mezi útoky Cross-Site Scripting (XSS) a Cross-Site Request Forgery (CSRF) z hlediska toho, co útočník provede a co je zneužito.
	- xss
		- nekam kde ocekavam nejakou hodnotu kterou primo rvu do pak do html, tak proste tam hodim ukonceni te casti html, dam zacatek scriptu a napisu ten scriptu
		- cil je tedy stat se uzivatelem s nejakym opravnenim
	- csrf
		- dostat info z serveru pomoci interakce jiz znameho uzivatele
		- pouziva se spolecne treba s socialnim inzenyrstvim

- Uveďte alespoň jedno konkrétní doporučené opatření pro prevenci útoku SQL Injection (SQLi) a jedno pro Cross-Site Scripting (XSS).
	- nebrat raw data od uzivatele jako input pro web
	- mit aplikacni firewall, ktery by kontroloval co posila

- Vysvětlete, co je to virtualizace platformy, a popište role softwaru hostitele a softwaru hosta.
	- vemu jeden hardware a narvu na nej x serveru
	- software hostitele
		- nastroj pro virtualizaci
		- vytvaret virtualky, mazat, pristupovat apod
	- software hosta
		- ten samotny server

- Uveďte dva hlavní důvody, proč virtualizace vznikla a jaký problém řešila v oblasti využití hardwarových zdrojů.
	- muzu na jednom procesoru mit hodne virtualek
	- takze koupim jeden vykonny procesor a budu tam mit 20 serveru, a ne mit 20 ruznejch procesoru, kazdej server na jeden

- Vysvětlete rozdíl mezi plnou virtualizací, paravirtualizací a emulací z pohledu fungování i výkonu.
	- emulace je na vykon nejhorsi
		- prekladam muj input a muj hardware na predpokladany aby mohl bezet emulovany software
		- arm na x64
	- paravirtualizace
		- komp vi o tom zarizeni
	- virtualize
		- komp nema tucha


- Porovnejte virtualizaci a kontejnerizaci.
	- u kontejnarizace izoluji jednotlive aplikace
	- u virtualizace jednotlive operacni systemy

- Co je to Docker a Podman? Vysvětlete výhody obou
	- aplikace pro kontejnarizaci
	- podman je zadarmo

- Co je to mikroservisní architektura? Jaké má vlastnosti a výhody?
	- roztrhani jednotlivych sluzeb na samostatne jednotky
	- kdyz chci neco aktualizovat, vymenit, kdyz neco chcipne atd atd, tak nemusim aktualizovat celek, ale jen tu jednu sluzbu

- Co je to clustering v kontextu operačních systémů, jaký je jeho hlavní cíl a kde se s ním setkáme?
	- mam jeden hlavni "komp", ktery dava prikazy vsem poddanym

- Co je to vestavěný systém a jak se liší od univerzálního počítače z hlediska jeho hlavního účelu? Jaké vlastnosti/parametry má typický hardware?
	- jednoucelova jednotka, nedela nic jineho nez prave tu jednu vec

- Vysvětlete real-time os, jeho vlastnosti a oblasti typického použití.
	- system ktery ma nejakou casovou dobu na aktivni vyreseni problemu

- Co je to IoT zařízení? Jaké vlastnosti má IoT? Kde se s nimi setkáme?
	- vestavene zarizeni v internetu

- Vysvětlete, co je to firewall a popište jeho hlavní funkci a jaké firewally známe.
	- filtrovat provoz podle jeho filtru
	- staticky/dynamicky firewall
		- podle toho jestli si dela sam pravidla nebo ne
	- packetovy (sitovy)
		- rozhoduje se podle IP a portu
	- aplikacni
		- prozkoumava zpravu, jestli tam nahodou neni neco skodliveho

- Vysvětlete, co je to antivirus a popište jeho hlavní funkci a jaké antiviry známe.
	- aplikace ktera aktivne skenuje nasi pamet a disk jestli nahodou neexistuje proces/soubor ktery se nahadou podoba tomu co ma v databazi jako virus, jestli ano tak ho smaze, da do karanteny, nahlasi, apod
	- avast, awg, defender, eset, mcfee, kaspersky

- Vysvětlete, co je to šifrování disku a popište jeho hlavní funkce a přínosy.
	- data jsou zapisovany na disk neprecitelne, jen uzivatel ma klic k rozlusteni
	- kdyz mi nekdo veme disk, tak ho neprecte

- Jaké útoky mohou ohrožovat šifrovaný disk a jak fungují?
	- bruteforce
	- coldboot
		- vemu ramky, zmrazim je, pak je prectu a hale co tu je, heslo na odsifrovani
	- socialni inzenyrstvi

- Na jaká média můžeme zálohovat?
	- interni/externi disky
	- cloud, sitovy disk
	- pak vsechny ruzny typy, zalezi co to je
		- dokument muzu vytisknout a hodit do trezoru apod

- Jaká rizika jsou motivací k zálohování?
	- nahla ztrata dat nebo zarizeni
	- prirodni katastrofy
	- nastvanej bratr co si rekne ze rozmlati komp