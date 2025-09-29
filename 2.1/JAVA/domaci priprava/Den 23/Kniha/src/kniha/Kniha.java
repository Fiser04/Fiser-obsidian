/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kniha;

/**
 *
 * @author fiser
 */
public class Kniha {

    String nazev;
    String autor;
    int rokVydani;

    public Kniha(String nazev, String autor, int rokVydani) {
        this.nazev = nazev;
        this.autor = autor;
        this.rokVydani = rokVydani;
    }

    @Override
    public String toString() {
        return "Nazev teto knihy je " + this.nazev + ", jeji autor je " + this.autor + " a jeji rok vydani je " + this.rokVydani;
    }

}
