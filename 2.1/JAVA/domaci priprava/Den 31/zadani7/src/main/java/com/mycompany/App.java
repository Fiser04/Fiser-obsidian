package com.mycompany;

public class App {

    public static void main(String[] args) {
        Trida trida1 = new Trida("IT1");
        trida1.pridejStudenta(new Student("franta", "lala", 1));
        trida1.pridejStudenta(new Student("pepek", "namornik", 2));
        trida1.pridejStudenta(new Student("jan", "houbar", 3));
        trida1.vypisStudentu();
        trida1.vymazStudenta(2);
        trida1.vypisStudentu();
    }
}
