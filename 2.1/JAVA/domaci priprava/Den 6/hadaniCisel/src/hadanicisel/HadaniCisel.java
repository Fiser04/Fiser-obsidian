//Den 6
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hadanicisel;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class HadaniCisel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean prvniPokus = true;
        int cisloUzivatele;
        int pocetPokusu = 0;
        int min = 1;
        int max = 10;
        int cisloHadane = random.nextInt(min, max+1);
        try {
            do {
                if (prvniPokus) {
                    System.out.printf("Vitejte v hre kde mate typnout cislo mezi %d a %d\n", min, max);
                    System.out.print("Vas typ je: ");
                    prvniPokus = false;
                }
                cisloUzivatele = sc.nextInt();
                if(cisloUzivatele > cisloHadane){
                    System.out.print("Prestrel, zkuste to znovu: ");
                } else if(cisloUzivatele < cisloHadane){
                    System.out.print("Moc malo, zkuste to znovu: ");
                }
                pocetPokusu++;
            } while (cisloUzivatele != cisloHadane);
            System.out.println("Vyhra, cislo bylo " + cisloHadane + ", zkusili jste to " + pocetPokusu + " krat");

        } catch (Exception e) {
            System.out.println("toto neni validni cislo");
        }

        sc.close();

    }

}
