package com.mycompany;

import java.util.ArrayList;

public class Regal {

    String nazev = "";
    ArrayList<Kniha> knihy = new ArrayList<Kniha>();

    public Regal(String nazev) {
        this.nazev = nazev;
    }

    public void PridatKnihuDoRegalu(String nazevKnihy) {
        knihy.add(new Kniha(nazevKnihy));
    }

    public void VypsatKnihy() {
        for (Kniha k : this.knihy) {
            System.out.println(k.nazev);
        }
    }
}
