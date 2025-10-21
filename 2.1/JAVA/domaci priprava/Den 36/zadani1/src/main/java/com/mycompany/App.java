package com.mycompany;

/*
Úkol: Vytvořte program pro analýzu výsledků testů žáků. Test má 5 žáků, každý žák má 3 pokusy z testu.
Program musí umět:
    Vytvořit 2D pole 5x3 s výsledky testů (body 0-100)
    Pro každého žáka najít:
        Nejlepší pokus
        Průměr všech pokusů
    Pro každý testový pokus (sloupec) najít:
        Nejhorší výsledek
        Průměr všech žáků
    Vytvořit jednorozměrné pole s finálním výsledkem každého žáka (nejlepší pokus)
    Seřadit žáky podle finálních výsledků (sestupně)
 */
public class App {

    public static void main(String[] args) {
        int[][] pole = new int[5][3];
        pole[0] = new int[] { 30, 20, 60 };
        pole[1] = new int[] { 70, 10, 20 };
        pole[2] = new int[] { 80, 90, 10 };
        pole[3] = new int[] { 74, 23, 100 };
        pole[4] = new int[] { 80, 35, 2 };

        int delkaPole = pole.length;
        int delkaPodpole = pole[0].length;
        //nejlepsi vysledek zaka
        System.out.println("Nejlepsi vysledek");
        int[] nejlepsiVysledekPole = new int[pole.length];
        for (int i = 0; i < pole.length; i++) {
            nejlepsiVysledekPole[i] = pole[i][0];
            for (int j = 0; j < pole[i].length; j++) {
                if (pole[i][j] > nejlepsiVysledekPole[i]) {
                    nejlepsiVysledekPole[i] = pole[i][j];
                }
            }
        }
        for (int i = 0; i < nejlepsiVysledekPole.length; i++) {
            System.out.println(nejlepsiVysledekPole[i]);
        }

        //prumer vysledku zaka
        System.out.println("\n\nPrumer zaka");
        int soucet = 0;
        int[] prumer = new int[pole.length];
        for (int i = 0; i < pole.length; i++) {
            soucet = 0;
            for (int j = 0; j < pole[i].length; j++) {
                soucet += pole[i][j];
            }
            prumer[i] = soucet / pole[i].length;
        }
        for (int i = 0; i < prumer.length; i++) {
            System.out.println(prumer[i]);
        }

        //nejhorsi vysledek z tridy
        System.out.println("\n\nNejhorsi vysledek testu");
        int[][] poleOtoceno = new int[delkaPodpole][delkaPole];
        for (int i = 0; i < delkaPodpole; i++) {
            for (int j = 0; j < delkaPole; j++) {
                poleOtoceno[i][j] = pole[j][i];
            }
        }

        int[] nejhorsiVysledky = new int[poleOtoceno.length];
        for (int i = 0; i < poleOtoceno.length; i++) {
            int nejhorsiVysledek = poleOtoceno[i][0];
            for (int j = 0; j < poleOtoceno[i].length; j++) {
                if (nejhorsiVysledek > poleOtoceno[i][j]) {
                    nejhorsiVysledek = poleOtoceno[i][j];
                }
            }
            nejhorsiVysledky[i] = nejhorsiVysledek;
        }

        for (int i = 0; i < nejhorsiVysledky.length; i++) {
            System.out.println(nejhorsiVysledky[i]);
        }

        //Prumer zaku v testu
        System.out.println("\n\nPrumery testu");
        int[] prumeryTestu = new int[poleOtoceno.length];
        for (int i = 0; i < poleOtoceno.length; i++) {
            soucet = 0;
            for (int j = 0; j < poleOtoceno[i].length; j++) {
                soucet += poleOtoceno[i][j];
            }
            prumeryTestu[i] = soucet / poleOtoceno[i].length;
        }

        for (int i = 0; i < prumeryTestu.length; i++) {
            System.out.println(prumeryTestu[i]);
        }

        /*
        String odpoved = "";
        for (int i = 0; i < poleOtoceno.length; i++) {
            for (int j = 0; j < poleOtoceno[i].length; j++) {
                odpoved += poleOtoceno[i][j] + " ";
            }
            odpoved += "\n";
        }
        System.out.println(odpoved);
        */

        //serazeni studentu podle vysledku
        System.out.println("\n\nSerazeni studentu");
        int[] studenti = new int[nejlepsiVysledekPole.length];
        for (int i = 0; i < studenti.length; i++) {
            studenti[i] = i + 1;
        }

        boolean zmeneno = true;
        while (zmeneno) {
            zmeneno = false;
            for (int i = 0; i < studenti.length; i++) {
                if (i != studenti.length - 1) {
                    if (nejlepsiVysledekPole[i] < nejlepsiVysledekPole[i + 1]) {
                        int temp = studenti[i];
                        studenti[i] = studenti[i + 1];
                        studenti[i + 1] = temp;
                        temp = nejlepsiVysledekPole[i];
                        nejlepsiVysledekPole[i] = nejlepsiVysledekPole[i + 1];
                        nejlepsiVysledekPole[i + 1] = temp;
                        zmeneno = true;
                    }
                }
            }
        }

        for (int i = 0; i < studenti.length; i++) {
            System.out.println(studenti[i] + " " + nejlepsiVysledekPole[i]);
        }
    }
}
