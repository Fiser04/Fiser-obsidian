//Den 4
package prevodteplot;

import java.util.Scanner;

/*
 * @author fiser
 */
public class PrevodTeplot {

    public static void main(String[] args) {
        //vzorce pro vypocet
        //f = c * 1.8 + 32
        //c = (f - 32) / 1.8

        System.out.println("Pro ukonceni programu, napiste q (quite)");

        Scanner sc = new Scanner(System.in);
        double vysledek;
        double hodnota;
        String hodnotaString;
        String typ;
        //String vysledekString;

        while (true) {
            try { //try pouzivam abych chytil spatny input hodnoty
                System.out.print("Hodnota kterou chcete prevest: ");
                hodnotaString = sc.nextLine(); //input hodnoty na prevod
                hodnotaString = hodnotaString.replace(',', '.'); //kdyz uzivatel pouziva misto tecky carku
                if (hodnotaString.equals("q") || hodnotaString.equals("quite")) { //break pro input hodnoty
                    break;
                } else {
                    hodnota = Double.parseDouble(hodnotaString);
                    System.out.print("Zadejte mod\nz celsia na fahrenheit -> c\nz fahrenheitu na celsia -> f: ");
                    typ = (sc.next()).toLowerCase(); //input modu (toLowerCase() protoze se urcite nekdo najde a rekne "jakto ze tam nemuzu dat velky, vsak se to tak pise", tak rovnou chci pracovat s lower casem)
                    if (!(typ.equals("c") || typ.equals("f"))) { //kontrola jestli uzivatel vi kde je na klavesnici c a f
                        if (typ.equals("q") || typ.equals("quite")) { //break pro input modu
                            break;
                        } else {
                            System.out.println("Neplatny typ prevodu."); //oznameni o spatnem inputu modu
                            sc.nextLine(); // vycisti buffer
                            continue;
                        }
                    } else {
                        sc.nextLine();
                        vysledek = (typ.equals("c")) ? hodnota * 1.8 + 32 : (hodnota - 32) / 1.8; //pokud je typ c, tak pouzij ten prvni vzorec, jinak ten druhy
                        if (typ.equals("c")) {
                            System.out.printf("% .2f Fahrenheitu\n", vysledek); //zarovnani mezery a minusu (kladny versus zaporne), oriznuti na 2 desetina mista
                        } else {
                            System.out.printf("% .2f Celsia\n", vysledek); //zarovnani mezery a minusu (kladny versus zaporne), oriznuti na 2 desetina mista
                        }
                        /*
                        jiny zpusob printu
                        vysledekString = (typ.equals("c")) ? Math.round(vysledek * 100.0) / 100.0 + " Fahrenheitu"
                                : Math.round(vysledek * 100.0) / 100.0 + " Celsius";
                        System.out.printf("%s\n", vysledekString);
                         */
                    }
                }
            } catch (Exception e) {
                System.out.println("Toto neni cislo"); //oznameni o spatnem inputu hodnoty
            }
        }
        sc.close();
    }
}
