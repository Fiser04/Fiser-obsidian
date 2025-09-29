//Den 7
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hazenikostkou;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author fiser
 */
public class HazeniKostkou {

    /**
     * @param args the command line arguments
     */
    static int celek;
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Kolik kostek hazite: ");
            int kolikrat = sc.nextInt();
            if (kolikrat > 0) {
                for (int i = 0; i < kolikrat; i++) {
                    showKostka(randomizedNumber());
                    Thread.sleep(1000);
                }
                System.out.println("Celkem jste hodili: " + celek);
            } else {
                System.out.println("kladnej pocet prosim");
            }
        } catch (Exception e) {
            System.out.println("to neni cislo");
        }
        sc.close();
    }

    static int randomizedNumber() {
        return random.nextInt(1, 7);
    }

    static void showKostka(int num) {
        switch (num) {
            case 1:
                System.out.printf("┌─────────┐\n│         │\n│    ●    │\n│         │\n└─────────┘\n");
                celek++;
                break;
            case 2:
                System.out.printf("┌─────────┐\n│ ●       │\n│         │\n│       ● │\n└─────────┘\n");
                celek += 2;
                break;
            case 3:
                System.out.printf("┌─────────┐\n│ ●       │\n│    ●    │\n│       ● │\n└─────────┘\n");
                celek += 3;

                break;
            case 4:
                System.out.printf("┌─────────┐\n│ ●     ● │\n│         │\n│ ●     ● │\n└─────────┘\n");
                celek += 4;

                break;
            case 5:
                System.out.printf("┌─────────┐\n│ ●     ● │\n│    ●    │\n│ ●     ● │\n└─────────┘\n");
                celek += 5;

                break;
            case 6:
                System.out.printf("┌─────────┐\n│ ●  ●  ● │\n│         │\n│ ●  ●  ● │\n└─────────┘\n");
                celek += 6;

                break;
        }
    }
}
