package com.mycompany;

/*
Úkol: Vytvoř program pro správu knih pomocí ArrayList.
Program musí umět:
    Třída Kniha má: název, autor, rok vydání, jeVypujcena (boolean)
    Použij ArrayList pro evidenci všech knih
    Metody:
        vypujcKnihu() - nastav jeVypujcena na true
        vratKnihu() - nastav jeVypujcena na false
        vyhledejPodleAutora() - vrátí knihy daného autora
    Vypiš všechny aktuálně vypůjčené knihy
    Vypiš knihy vydané po roce 2000
    */
public class App {

    public static void main(String[] args) {
        Knihovna knihovna = new Knihovna();
        Kniha kniha1 = new Kniha("asd", "ab", 1990);
        Kniha kniha2 = new Kniha("das", "maj", 2000);
        Kniha kniha3 = new Kniha("las", "jas", 2001);
        Kniha kniha4 = new Kniha("pas", "ias", 2020);
        knihovna.vytvorKnihu(kniha1);
        knihovna.vytvorKnihu(kniha2);
        knihovna.vytvorKnihu(kniha3);
        knihovna.vytvorKnihu(kniha4);

        knihovna.vypujcitKnihu(kniha1);
        knihovna.vypujcitKnihu(kniha3);
        System.out.println(knihovna.vyhledejKnihuPodleAutora("maj"));
        System.out.println();
        System.out.println(knihovna.vypsatVsechnyVypujceneKnihy());
        System.out.println();
        System.out.println(knihovna.vypsatKnihyVydanePo(2000));
    }
}
