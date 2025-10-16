package com.mycompany;

import java.util.regex.*;

public class App {

    public static void main(String[] args) {
        String regularniVyraz = "\\d+[\\d., ]*Kc";
        String retezec =
            "Ceny jsou: 150 Kc, 300 000 Kc, 2999 Kc, 75,50 Kc a zdarma.";
        Pattern pattern = Pattern.compile(regularniVyraz);
        Matcher matcher = pattern.matcher(retezec);
        while (matcher.find()) {
            String potentialPrice = matcher.group();
            System.out.println("- " + potentialPrice);
        }
    }
}
