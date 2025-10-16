package com.mycompany;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cislo1 = sc.nextInt();
            sc.nextLine();
            int cislo2 = sc.nextInt();
            System.out.println(
                "Soucet cisel " +
                    cislo1 +
                    " a " +
                    cislo2 +
                    ": " +
                    (cislo1 + cislo2)
            );
            System.out.println(
                "Rozdil cisel " +
                    cislo1 +
                    " a " +
                    cislo2 +
                    ": " +
                    (cislo1 - cislo2)
            );
            System.out.println(
                "Soucin cisel " +
                    cislo1 +
                    " a " +
                    cislo2 +
                    ": " +
                    (cislo1 * cislo2)
            );
            if (cislo2 == 0) {
                throw new Exception("Nejde delit nulou");
            } else {
                System.out.println(
                    "Podil cisel " +
                        cislo1 +
                        " a " +
                        cislo2 +
                        ": " +
                        (cislo1 / cislo2)
                );
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
