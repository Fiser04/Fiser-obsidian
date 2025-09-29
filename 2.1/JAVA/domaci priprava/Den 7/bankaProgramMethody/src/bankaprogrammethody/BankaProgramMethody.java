//Den 7
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaprogrammethody;

import java.time.chrono.ThaiBuddhistEra;
import java.util.Scanner;

public class BankaProgramMethody {

    static double zustatek = 1000;
    static boolean isOn = true;
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a ano, jsou to hroznej kod, taky neresim nejaky dalsi osetreni ala nekdo vlozi minus nebo vybere minus (nekonecne prachu)
        do {
            try {
                printMenu();
                caller(sc.nextInt());
            } catch (Exception e) {
                System.out.println("tak vis co je to cislo?");
                sc.nextLine();
            }
        } while (isOn);
        sc.close();
    }

    static void printMenu() {
        System.out.printf(
                "BANKA LE CHLEB\n1 - zustatek na ucte\n2 - vlozit penize\n3 - vybrat penize\n4 - konec\n"
        );
    }
    static void caller(int s) {
        switch (s) {
            case 1:
                System.out.println("Vas zustatek cini: " + getZustatek());
                break;
            case 2:
                vlozit();
                System.out.println("Vas novy zustatek cini: " + getZustatek());
                break;
            case 3:
                vybrat();
                System.out.println("Vas novy zustatek cini: " + getZustatek());
                break;
            case 4:
                isOn = false;
                System.out.println("Koncim");
                break;
            default:
                System.out.println("bracho, 1 az 4");
        }
    }

    static double getZustatek() {
        return zustatek;
    }

    static void vlozit() {
        System.out.print("Kolik chcete vlozit? ");
        zustatek += sc.nextDouble();
    }

    static void vybrat() {
        System.out.print("Kolik chcete vlozit? ");
        zustatek -= sc.nextDouble();
    }
;

}
