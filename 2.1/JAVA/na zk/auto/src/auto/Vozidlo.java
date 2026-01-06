/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auto;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author fiser
 */
public abstract class Vozidlo {
    private String nazev, znacka;
    private Pneu[] pneu;

    public Vozidlo(String nazev, String znacka, Pneu[] pneu) {
        this.nazev = nazev;
        this.znacka = znacka;
        this.pneu = pneu;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public Pneu[] getPneu() {
        return pneu;
    }

    public void setPneu(Pneu[] pneu) {
        this.pneu = pneu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nazev);
        hash = 43 * hash + Objects.hashCode(this.znacka);
        hash = 43 * hash + Arrays.deepHashCode(this.pneu);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vozidlo other = (Vozidlo) obj;
        if (!Objects.equals(this.nazev, other.nazev)) {
            return false;
        }
        if (!Objects.equals(this.znacka, other.znacka)) {
            return false;
        }
        return Arrays.deepEquals(this.pneu, other.pneu);
    }

    @Override
    public String toString() {
        String pneuString = "";
        for(int i = 0; i<this.pneu.length; i++){
            pneuString+=this.pneu[i];
        }
        return "Vozidlo{" + "nazev=" + nazev + ", znacka=" + znacka + ", pneu=" + pneuString + '}';
    }
    
}
