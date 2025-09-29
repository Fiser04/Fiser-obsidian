//Den 9
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kamennuzkypapir;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author fiser
 */
public class KamenNuzkyPapir {

    static String[] kamenNuzkyPapir = {"Kamen", "Nuzky", "Papir"};
    static Random random = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            kontrola(randomNum(), inputToInt(sc.nextLine()));
        } catch (Exception e) {
        }
        sc.close();
    }

    static int randomNum() {
        return random.nextInt(0, 3);
    }

    static void kontrola(int generovaneCislo, int uzivateleCislo) {
        if (generovaneCislo == uzivateleCislo) {
            System.out.println("remiza");
        } else if (generovaneCislo == 0 && uzivateleCislo == 2
                || generovaneCislo == 2 && uzivateleCislo == 1
                || generovaneCislo == 1 && uzivateleCislo == 0) {
            System.out.println("vyhra");
        } else {
            System.out.println("prohra");
        }
        System.out.println(kamenNuzkyPapir[generovaneCislo]);
    }

    static int inputToInt(String input) throws Exception {
        switch (input.toLowerCase()) {
            case "kamen" -> {
                return 0;
            }
            case "nuzky" -> {
                return 1;
            }
            case "papir" -> {
                return 2;
            }
            default ->
                throw new Exception();
        }
    }

}
