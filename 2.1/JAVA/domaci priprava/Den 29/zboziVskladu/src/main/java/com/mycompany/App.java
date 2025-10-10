package com.mycompany;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Sklad sklad = new Sklad("skladiste 1");
        sklad.addToSklad(
            new Zbozi(
                0,
                "rohozka ruzova",
                "rohozka",
                "rohozka ruzove barvy",
                "1.9.2020"
            )
        );
        sklad.addToSklad(
            new Zbozi(
                1,
                "office chair",
                "furniture",
                "black chair with adjustable height",
                "15.3.2021"
            )
        );

        sklad.addToSklad(
            new Zbozi(
                2,
                "monitor 24 inch",
                "electronics",
                "LCD monitor with Full HD resolution",
                "10.7.2022"
            )
        );

        sklad.addToSklad(
            new Zbozi(
                3,
                "wooden table",
                "furniture",
                "oak wood table with two drawers",
                "5.11.2020"
            )
        );

        sklad.addToSklad(
            new Zbozi(
                4,
                "mechanical keyboard",
                "electronics",
                "mechanical keyboard with RGB lighting",
                "22.1.2023"
            )
        );

        sklad.addToSklad(
            new Zbozi(
                5,
                "desk lamp",
                "lighting",
                "LED desk lamp with adjustable arm",
                "30.5.2021"
            )
        );
        System.out.println(sklad.searchZbozi(null, "desk lamp"));
        sklad.vypisZboziPodleDruhu();
        sklad.removeFromSklad(sklad.searchZbozi(1, ""));
        System.out.println(sklad.searchZbozi(1, ""));
    }
}
