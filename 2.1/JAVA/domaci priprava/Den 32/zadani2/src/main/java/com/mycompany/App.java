package com.mycompany;

/*
Úkol: Vytvořte program pro evidenci zboží na skladě. Položka zboží má název, kód, množství na skladě a pořizovací cenu.
Program musí umět:
    Přidat/odebrat kusy zboží.
    Vyhledat zboží podle kódu a zobrazit jeho stav.
    Zobrazit veškeré zboží, jehož množství je pod nastaveným minimem (např. 5 kusů).
    Načíst stav skladu ze souboru sklad.dat (pomocí objektového streamu).
    Uložit stav skladu do souboru sklad.dat.
Pokrytá látka: Třídy a objekty II, binární soubory, výjimky, ArrayList, řídicí struktury (cykly, podmínky).
 */
public class App {

    public static void main(String[] args) {
        Sklad sklad = new Sklad();
        //sklad.pridejZbozi(new Zbozi("brabora", "asd", 40, 2));
        //sklad.pridejZbozi(new Zbozi("mrkev", "ml", 60, 3));
        //sklad.pridejZbozi(new Zbozi("pomeranc", "sdf", 20, 10));
        //sklad.pridejZbozi(new Zbozi("zeli", "asd", 3, 21));
        //sklad.ulozitSoubor();
        sklad.nacistSoubor();
        sklad.vypisZboziPodLimitem();
    }
}
