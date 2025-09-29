//Den 16
package opratka;

import com.sun.source.tree.BreakTree;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Opratka {

    public static void main(String[] args) {
        //opratka, hadani slova
        /*
            user input
            cteni souboru
            random na pick slova
            objesenec ascii
            projit charaktery jestli se rovnaji
            chyba = zmena ascii, dobre zmena znaku z _ na znak
            to cele jet v whilu a koncit zmenou promneny na false
        
            co by slo jakozto mit svoji vlastni tridu:
                precteni souboru a random pick, aby me returnul string toho slova
                teoreticky by sla i vlastni trida pro prohledavani slova, ktera by returnula jestli tam je a kdyz tak list s pozicemi
                na zaklade toho returnu se rozhodnu na poupravovani ascii nebo jen schovaneho slova
         */
        String cestaSouboru = "text.txt";
        boolean jeSpusteno = true;
        int pocetChyb = 0;
        String vybraneSlovo;
        int pocetSpravne = 0;

        try (Scanner sc = new Scanner(System.in)) {
            PickSlova pickSlova = new PickSlova(cestaSouboru);
            VykresleniZnaku vykresleniZnaku = new VykresleniZnaku();
            vybraneSlovo = pickSlova.getSlovoVybrane(); //precte soubor a vybere slovo
            System.out.println(vybraneSlovo);
            KontrolaSlova kontrolaSlova = new KontrolaSlova(vybraneSlovo.toLowerCase());

            while (jeSpusteno) {

                String input = sc.nextLine(); //input
                if (vybraneSlovo.toLowerCase().contains(input.toLowerCase())) {
                    System.out.println(kontrolaSlova.reseni((input.charAt(0))).toLowerCase());
                    pocetSpravne += kontrolaSlova.pocetNalezenych;
                    if (pocetSpravne == vybraneSlovo.length()) {
                        jeSpusteno = false;
                    }
                } else {
                    if (pocetChyb == vykresleniZnaku.postavaList.size() - 1) {
                        jeSpusteno = false;
                    } else {
                        pocetChyb++;
                        System.out.println(vykresleniZnaku.postavaList.get(pocetChyb));
                        System.out.println("Pocet chyb: " + pocetChyb);
                    }
                }
                System.out.println(pocetSpravne);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException ex) {
            System.out.println("io ex");
        }
    }

}
