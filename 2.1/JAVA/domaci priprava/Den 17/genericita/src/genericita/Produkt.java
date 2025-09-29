/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericita;

/**
 *
 * @author odkolin
 */
public class Produkt<T, U> {
    T polozka;
    U cena;

    public Produkt(T polozka, U cena) {
        this.polozka = polozka;
        this.cena = cena;
    }

    public T getPolozka() {
        return polozka;
    }

    public void setPolozka(T polozka) {
        this.polozka = polozka;
    }

    public U getCena() {
        return cena;
    }

    public void setCena(U cena) {
        this.cena = cena;
    }
    
    
}
