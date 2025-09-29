//Den 10
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hraciautomat;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author fiser
 */
public class HraciAutomat {

    static Random random = new Random();
    static char[] znaky = {'P', 'O', 'W', 'S', 'U'};
    static int zustatek = 100;
    static int prihoz;
    static int[] nahodnaHodnoty = new int[znaky.length];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vitejte ve kaasinu, pro ukonceni zmacknete q");
        do {
            try {
                System.out.print("Vas prihoz: ");
                String userInput = sc.nextLine();
                if (userInput.equalsIgnoreCase("q")) {
                    break;
                }
                prihoz = Integer.valueOf(userInput);
                if (prihoz < 1) {
                    continue;
                }
                randomNum();
                exportZanku();
                odmenyZaProtoceni();
                System.out.println("Vas zustatek cini: " + zustatek);
            } catch (Exception e) {
                System.out.println("nevhodny input");
            }

        } while (muzeHrat());
        sc.close();
        System.out.println("Dekujeme a prejeme vam krasny den");
    }

    static void randomNum() {
        int pocetZnaku = znaky.length + 1;
        for (int i = 0; i < nahodnaHodnoty.length; i++) {
            nahodnaHodnoty[i] = random.nextInt(1, pocetZnaku);
        }
    }

    static void exportZanku() {
        for (int i = 0; i < nahodnaHodnoty.length; i++) {
            System.out.print(znaky[nahodnaHodnoty[i] - 1]);
        }
        System.out.println();
    }

    static void odmenyZaProtoceni() {
        zustatek -= prihoz;
        for (int i = 0; i < nahodnaHodnoty.length; i++) {
            for (int j = i + 1; j < nahodnaHodnoty.length; j++) {
                if (nahodnaHodnoty[i] == nahodnaHodnoty[j]) {
                    zustatek += prihoz * 2;
                }
            }
        }
    }

    static boolean muzeHrat() {
        return (zustatek > 0) ? true : false;
    }
}
