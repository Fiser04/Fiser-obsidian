package com.mycompany;

import java.util.Scanner;

/**
Úkol: Vytvořte program, který načte libovolný textový soubor a provede jeho analýzu.
Program musí umět:
    Načíst soubor zadaný uživatelem.
    Spočítat a vypsat:
        Počet řádků.
        Počet slov.
        Počet znaků (s mezerami i bez).
        Nejčastěji se vyskytující slovo.
    Výsledky analýzy uložit do nového souboru analyza_vystup.txt.
Pokrytá látka: Textové soubory, řetězce, cykly, HashMap pro počítání slov, výjimky.
 */
public class App {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Ctenar ctenar = new Ctenar(sc.nextLine());
            System.out.println(ctenar.nejcastejsiString());
            //System.out.print(ctenar.getInputString());
            //System.out.println(ctenar.getPocetRadku());
            // System.out.println(ctenar.pocetSlov());
            //System.out.println(ctenar.pocetZnakuBezMezer());
            //System.out.println(ctenar.pocetZnakuSMezerama());
        }
    }
}
