package com.mycompany;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        boolean nemamInput = true;
        int inputCislo = -1;
        String input = "";
        try (Scanner sc = new Scanner(System.in)) {
            //INPUT
            while (nemamInput) {
                System.out.println("Kolik prvocisel chcete vypsat?");
                input = sc.nextLine();

                try {
                    inputCislo = Integer.parseInt(input);
                    if (inputCislo > 0) {
                        nemamInput = false;
                    } else {
                        System.out.println("Cislo musi byt vetsi jak 0");
                    }
                } catch (Exception e) {
                    System.out.println("Toto neni cislo");
                }
            }

            for (int i : funkce(inputCislo)) {
                System.out.println(i);
            }
        } catch (Exception e) {}
    }

    public static int[] funkce(int inputCislo) {
        int cisloZkoumane = 2;
        int[] pole = new int[inputCislo];
        int pozice = 0;
        boolean jePrvocislo = true;
        while (pozice < inputCislo) {
            jePrvocislo = true;
            for (int i = 2; i < cisloZkoumane - 1; i++) {
                if (cisloZkoumane % i == 0) {
                    jePrvocislo = false;
                    break;
                }
            }
            if (jePrvocislo) {
                pole[pozice] = cisloZkoumane;
                pozice++;
            }
            cisloZkoumane++;
        }
        return pole;
    }
}
