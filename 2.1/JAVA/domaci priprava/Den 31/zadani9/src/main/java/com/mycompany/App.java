package com.mycompany;

public class App {

    public static void main(String[] args) {
        Fronta fronta = new Fronta();
        fronta.pridatDoFronty(new Zakaznik("Franta lala"));
        fronta.pridatDoFronty(new Zakaznik("Petr hruska"));
        fronta.pridatDoFronty(new Zakaznik("Bota Rota"));
        fronta.pridatDoFronty(new Zakaznik("Oilada"));
        fronta.zobrazFrontu();
        fronta.odeberZfronty();
        System.out.println();
        fronta.zobrazFrontu();
    }
}
