package com.mycompany;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getDayOfYear());
        System.out.println(365 - ld.getDayOfYear());
    }
}
