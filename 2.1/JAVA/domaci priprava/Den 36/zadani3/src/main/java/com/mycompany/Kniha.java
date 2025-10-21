package com.mycompany;

public class Kniha {

    String nazev;
    String autor;
    int rokVydani;
    boolean jeVypujcena;

    public Kniha(String nazev, String autor, int rokVydani) {
        this.nazev = nazev;
        this.autor = autor;
        this.rokVydani = rokVydani;
        this.jeVypujcena = false;
    }

    public void vypujcit() {
        if (this.jeVypujcena) {
            System.out.println("Kniha je jiz vypujcena");
        } else {
            this.jeVypujcena = true;
        }
    }

    public void vratit() {
        if (this.jeVypujcena) {
            this.jeVypujcena = false;
        } else {
            System.out.println("Bro how, vsak ji tu mam na stole");
        }
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

    public int getRokVydani() {
        return rokVydani;
    }

    public void setRokVydani(int rokVydani) {
        this.rokVydani = rokVydani;
    }

    public boolean isJeVypujcena() {
        return jeVypujcena;
    }

    public void setJeVypujcena(boolean jeVypujcena) {
        this.jeVypujcena = jeVypujcena;
    }

    @Override
    public String toString() {
        return (
            this.nazev +
            " " +
            this.autor +
            " " +
            this.rokVydani +
            " " +
            this.jeVypujcena
        );
    }
}
