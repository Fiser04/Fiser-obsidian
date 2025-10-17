package com.mycompany;

public class Kniha {

    String jmeno;
    String autor;
    String kod;
    int rokVydani;

    public Kniha(String jmeno, String autor, String kod, int rokVydani) {
        this.jmeno = jmeno;
        this.autor = autor;
        this.kod = kod;
        this.rokVydani = rokVydani;
    }

    @Override
    public String toString() {
        return (
            "Jmeno: " +
            this.jmeno +
            "\nAutor: " +
            this.autor +
            "\nKod: " +
            this.kod +
            "\nRok vydani: " +
            this.rokVydani
        );
    }
}
