package com.mycompany;

import java.io.Serializable;

public class Zbozi implements Serializable {

    private static final long serialVersionUID = 1L;
    String nazev = "";
    String kod = "";
    int mnozstvi = 0;
    int cena = 0;

    public Zbozi(String nazev, String kod, int mnozstvi, int cena) {
        this.nazev = nazev;
        this.kod = kod;
        if (mnozstvi > 0) {
            this.mnozstvi = mnozstvi;
        }
        this.cena = cena;
    }

    public void pridejMnozstvi(int kolik) {
        if (kolik > 0) {
            this.mnozstvi += kolik;
        } else {
            System.out.println("Nejde pridat mene jak jeden kus");
        }
    }

    public void odeberMnozstvi(int kolik) {
        if (kolik < this.mnozstvi) {
            this.mnozstvi -= kolik;
        } else {
            System.out.println("Tolik neni na sklade");
        }
    }

    @Override
    public String toString() {
        return (
            "\nNazev: " +
            this.nazev +
            "\nKod: " +
            this.kod +
            "\nMnozstvi: " +
            this.mnozstvi +
            "\nCena: " +
            this.cena
        );
    }
}
