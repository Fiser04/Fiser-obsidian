package com.mycompany;

import java.io.Serializable;

//Systém musí umět evidovat knihy (název, autor, rok vydání, dostupnost)
public class Kniha implements Serializable {

    private String nazev, autor;
    private int rokVydani;
    private boolean zapujceno; //dostupnost
    private static final long serialVersionUID = 1L;

    public Kniha(String nazev, String autor, int rok) {
        this.nazev = nazev;
        this.autor = autor;
        this.rokVydani = rok;
        this.zapujceno = false;
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

    public boolean isZapujceno() {
        return zapujceno;
    }

    public void setZapujceno(boolean zapujceno) {
        this.zapujceno = zapujceno;
    }

    private String stringZapujceni() {
        if (this.zapujceno) {
            return "Zapujcena";
        } else {
            return "Volna";
        }
    }

    @Override
    public String toString() {
        return (
            "Nazev: " +
            this.nazev +
            ", Autor: " +
            this.autor +
            ", Rok vydani: " +
            this.rokVydani +
            ", Dostupnost: " +
            stringZapujceni()
        );
    }
}
