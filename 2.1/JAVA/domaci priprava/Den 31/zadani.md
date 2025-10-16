Zadání 1 (Základy, vstup/výstup, proměnné)
Napište program, který načte od uživatele dvě celá čísla (např. a a b). Program vypíše jejich součet, rozdíl, součin a podíl (celočíselné dělení). Ošetřete případ, kdy by b bylo nula a hrozilo by dělení nulou.

Zadání 2 (Řídicí struktury - podmínky, cykly)
Napište program, který najde a vypíše všechna prvočísla v rozsahu od 2 do N, kde N je celé číslo zadané uživatelem.

Zadání 3 (Funkce a procedury)
Napište funkci s názvem jePalindrom, která přijme řetězec a vrátí true, pokud je řetězec palindromem (čte se stejně zepředu i zezadu), jinak vrátí false. Ignorujte velikost písmen a mezery. Následně tuto funkci použijte v hlavním programu, který načte slovo od uživatele a vypíše výsledek.

Zadání 4 (Pole)
Napište program, který načte od uživatele posloupnost celých čísel (předem neznámou délku) a uloží je do pole. Program následně najde a vypíše druhé nejmenší číslo v zadané posloupnosti. Pokud takové číslo neexistuje (např. jsou všechna stejná), vypíše vhodnou zprávu.

Zadání 5 (Třídy a objekty I - využití externích tříd)
Vytvořte program, který pomocí třídy LocalDate zjistí aktuální datum a následně vypočítá a vypíše, kolik dní uplynulo od začátku aktuálního roku a kolik dní zbývá do konce aktuálního roku.

Zadání 6 (Soubory a výjimky)
Napište program, který ze vstupního textového souboru vstup.txt načte řádky a zapíše je do výstupního souboru vystup.txt v obráceném pořadí (tj. první řádek ve výstupu bude poslední řádek vstupu atd.). Program musí korektně ošetřovat všechny potenciální výjimky související s prací se soubory.

Zadání 7 (Třídy a objekty II - návrh vlastních tříd)
Navrhněte a implementujte třídu Student. Student má jméno, příjmení a identifikační číslo (osobní číslo). Dále navrhněte třídu Trida, která reprezentuje školní třídu. Třída má název (např. "IT1") a obsahuje seznam studentů. Implementujte metody pro přidání studenta, odebrání studenta podle osobního čísla a výpis všech studentů třídy.

Zadání 8 (Dědičnost a polymorfismus)
Vytvořte abstraktní nadtřídu Zvire s atributy jmeno a vaha a abstraktní metodou zvuk(). Dále vytvořte alespoň dvě podtřídy, např. Pes a Kocka, které metodu zvuk() implementují (pes vrátí např. "haf", kočka "mňau"). V hlavním programu vytvořte kolekci zvířat (obsahující instance psů i koček) a pro každé zvíře v kolekci vypište jeho jméno a zavolejte metodu zvuk().

Zadání 9 (Datové struktury - základy)
Napište program, který simuluje frontu (Queue) v obchodě. Program bude v cyklu nabízet možnosti: 1) Přidat nového zákazníka do fronty (zadáno jménem), 2) Odebrat dalšího zákazníka z fronty (obsloužit), 3) Zobrazit celou frontu, 4) Konec. Pro práci s frontou využijte rozhraní Queue.

Zadání 10 (Kombinace - algoritmy, OOP, soubory)
Vytvořte program pro evidenci jednoduchého skladu. Navrhněte třídu PolozkaSkladu s atributy nazev, cena a mnozstvi. Hlavní program bude načítat ze souboru sklad.txt počáteční stav skladu (formát souboru si navrhněte) a poté umožní uživateli interaktivně: přidat novou položku, odebrat určité množství položky (podle názvu), zobrazit celkovou hodnotu zásob na skladě a uložit aktuální stav skladu zpět do souboru při ukončení programu.
