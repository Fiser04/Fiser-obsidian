package com.mycompany;

public class Kocka extends Zvire {

    public Kocka(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public void zvuk() {
        System.out.println("Mnau");
    }
}
