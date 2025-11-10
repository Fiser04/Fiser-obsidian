package com.mycompany;

public class Kniha {

    String nazev, autor, stav;
    int rok;

    public Kniha(String nazev, String autor, String stav, int rok) {
        this.nazev = nazev;
        this.autor = autor;
        this.stav = stav;
        this.rok = rok;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStav() {
        return stav;
    }

    public void setStav(String stav) {
        this.stav = stav;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }
}
