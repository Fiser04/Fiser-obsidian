//Den 5
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulackaswitches;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class KalkulackaSwitches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {
            try {
                System.out.print("zvolte operaci (+, -, *, /, ^, q): ");
                String operace = sc.nextLine();
                if ((operace.toLowerCase()).equals("q")) {
                    sc.close();
                    break loop;
                } else {
                    System.out.print("zadejte prvni cislo: ");
                    Double prvniCislo = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("zvolte druhe cislo: ");
                    double druheCislo = sc.nextDouble();
                    sc.nextLine();
                    double vysledek = 0;

                    switch (operace) {
                        case "+" -> {
                            vysledek = prvniCislo + druheCislo;
                            System.out.println("Vysledek je " + vysledek);
                        }
                        case "-" -> {
                            vysledek = prvniCislo - druheCislo;
                            System.out.println("Vysledek je " + vysledek);
                        }
                        case "*" -> {
                            vysledek = prvniCislo * druheCislo;
                            System.out.println("Vysledek je " + vysledek);
                        }
                        case "/" -> {
                            if (druheCislo == 0) {
                                System.out.println("nulou nelze delit");
                            } else {
                                vysledek = prvniCislo / druheCislo;
                                System.out.println("Vysledek je " + vysledek);
                            }
                        }
                        case "^" -> {
                            vysledek = Math.pow(prvniCislo, druheCislo);
                            System.out.println("Vysledek je " + vysledek);
                        }
                        default ->
                            System.out.println("toto neni operace");
                    }
                }
            } catch (Exception e) {
                System.out.println("spatny input");
                sc.nextLine();
            }
        }

    }

}
