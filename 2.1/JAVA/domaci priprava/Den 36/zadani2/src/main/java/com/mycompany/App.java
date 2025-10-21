package com.mycompany;

/*
Úkol: Rozšiř předchozí program pomocí OOP. Vytvoř třídu Zak a VysledkyTestu.
Program musí umět:
    Třída Zak má: jméno, příjmení, věk
    Třída VysledkyTestu má: žáka (Zak), pole s 3 pokusy, metody:
        nejlepsiPokus(), prumer(), jeProspel() (prospěl pokud alespoň 1 pokus ≥ 50)
    V hlavním programu vytvoř pole objektů VysledkyTestu
    Najdi všechny prospělé žáky
    Vypiš žáka s nejlepším výsledkem
Pokrytá látka: Třídy a objekty I, pole objektů, jednoduché metody, kompozice
 */
public class App {

    public static void main(String[] args) {
        VysledkyTestu[] pole = new VysledkyTestu[3];
        pole[0] = new VysledkyTestu(
            new int[] { 35, 60, 40 },
            new Zak("Jan", "Novak", 14)
        );
        pole[1] = new VysledkyTestu(
            new int[] { 35, 20, 10 },
            new Zak("Ondrej", "Fiala", 15)
        );
        pole[2] = new VysledkyTestu(
            new int[] { 90, 100, 80 },
            new Zak("Matej", "Babis", 16)
        );

        boolean jsouVsePoleOK = true;
        for (int i = 0; i < pole.length; i++) {
            if (!pole[i].jePolePlne()) {
                jsouVsePoleOK = false;
            }
        }

        if (jsouVsePoleOK) {
            for (VysledkyTestu vysledkyTestu : pole) {
                if (vysledkyTestu.prospel()) {
                    System.out.println(vysledkyTestu);
                }
            }

            int nejlepsiVysledek = pole[0].nejlepsiVysledek();
            int index = 0;
            for (int i = 0; i < pole.length; i++) {
                if (nejlepsiVysledek < pole[i].nejlepsiVysledek()) {
                    nejlepsiVysledek = pole[i].nejlepsiVysledek();
                    index = i;
                }
            }

            System.out.println(pole[index]);
        } else {
            System.out.println("Pole nejsou plna");
        }
    }
}
