package com.mycompany;

import java.io.Serializable;

public class Zbozi implements Serializable {

    String nazev;
    double cena;
    private static final long serialVersionUID = 1L;

    public Zbozi(String nazev, double cena) {
        this.nazev = nazev;
        this.cena = cena;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return nazev + " " + cena + " kc";
    }
}
