package com.mycompany;

/*
Zadání 1: Evidence knih v knihovně
Úkol: Vytvořte program pro správu knih v knihovně. Kniha má název, autora, ISBN a rok vydání.
Program musí umět:
    Přidat novou knihu.
    Najít knihu podle názvu nebo autora a vypsat její detaily.
    Načíst seznam knih ze souboru knihy.txt (formát: název;autor;ISBN;rok).
    Uložit celý seznam knih do souboru knihy.txt.
    Ošetřit základní výjimky (např. chybějící soubor).
Pokrytá látka: Třídy a objekty II, textové soubory, výjimky, pole/ArrayList, algoritmy vyhledávání.
 */
public class App {

    public static void main(String[] args) {
        Knihovna knihovna = new Knihovna();
        //knihovna.pridejKnihy(new Kniha("Ano", "Babis", "sfsfs", 1922));
        //knihovna.pridejKnihy(new Kniha("Ne", "Turek", "ls", 1939));
        //knihovna.pridejKnihy(new Kniha("Mozna", "Tomio", "asd", 1945));
        //knihovna.pridejKnihy(new Kniha("Tak urcite", "Macinka", "dfsf", 2025));
        knihovna.pridejKnihy(new Kniha("Zora", "Jej", "dfsasaff", 2023));

        System.out.println(knihovna.vyhledejKnihu("Ano", ""));
        knihovna.ulozit();
    }
}
