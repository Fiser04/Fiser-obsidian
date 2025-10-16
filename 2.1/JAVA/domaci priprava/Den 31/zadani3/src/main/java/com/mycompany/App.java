package com.mycompany;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String input = "";
        try (Scanner sc = new Scanner(System.in)) {
            input = sc.nextLine();
            input = input.toLowerCase();
            input = input.replace(" ", "");
            if (funkce(input)) {
                System.out.println(input + " je palindrom");
            } else {
                System.out.println(input + " neni palindrom");
            }
        } catch (Exception e) {}
    }

    public static boolean funkce(String input) {
        char[] roztrhany = input.toCharArray();
        boolean jePalindrom = true;
        for (int i = 0; i < roztrhany.length; i++) {
            if (roztrhany[i] == roztrhany[(roztrhany.length - 1) - i]) {} else {
                jePalindrom = false;
            }
        }
        return jePalindrom;
    }
}
