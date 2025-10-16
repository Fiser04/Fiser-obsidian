package com.mycompany;

import java.util.regex.*;

public class App {

    public static void main(String[] args) {
        String regularniVyraz = "^\\d{2}.\\d{2}.\\d{4}$";
        String[] dny = { "12.05.2023", "invalid", "1.1.2023" };
        Pattern pattern = Pattern.compile(regularniVyraz);
        for (String datum : dny) {
            Matcher matcher = pattern.matcher(datum);
            if (matcher.matches()) {
                System.out.println(datum + " -> Splnuje");
            } else {
                System.out.println(datum + " -> Nesplnuje");
            }
        }
    }
}
