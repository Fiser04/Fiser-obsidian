package com.mycompany;

/*
Úkol: Vytvořte zjednodušený bankovní systém. Účet má číslo účtu, jméno majitele a zůstatek.
Program musí umět:
    Vytvořit nový účet.
    Vyhledat účet podle čísla.
    Provést vklad na účet.
    Provést výběr z účtu (s kontrolou, zda je dostatek prostředků).
    Zobrazit výpis všech účtů v systému.
    Uložit a načíst všechny účty pomocí objektového streamu do souboru ucty.dat.
Pokrytá látka: Třídy a objekty II, zapouzdření (private atributy, public metody), binární soubory, výjimky, ArrayList.
 */
public class App {

    public static void main(String[] args) {
        Banka banka = new Banka();
        /*banka.pridatUcet(new Ucet("Karel", "Hynek", 1));
        banka.pridatUcet(new Ucet("Matej", "Gondek", 2));
        banka.pridatUcet(new Ucet("Jindra", "Koksal", 3));
        banka.pridatUcet(new Ucet("Vaclav", "Oi", 4));
        banka.pridejNaUcet(banka.vyhledatUcet(2), 3500.5);
        banka.vyberZUctu(banka.vyhledatUcet(2), 5000);*/
        System.out.println(banka.vyhledatUcet(2));
        banka.ukladani();
    }
}
