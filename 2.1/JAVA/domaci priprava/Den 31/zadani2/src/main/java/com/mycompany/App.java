package com.mycompany;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        boolean nemamInput = true;
        String input = "";
        try (Scanner sc = new Scanner(System.in)) {
            while (nemamInput) {
                System.out.println("Kolik prvocisel chcete vypsat?");
                input = sc.nextLine();
                try {
                    int inputCislo = Integer.parseInt(input);
                } catch (Exception e) {
                    System.out.println("Toto neni cislo");
                }
            }
            System.out.println(input);
        } catch (Exception e) {}
    }
}
