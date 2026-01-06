/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auto;

import java.util.Objects;

/**
 *
 * @author fiser
 */
public class Karoserie {
    private String barva;
    private KaroserieTyp karoserieTyp;

    public Karoserie(String barva, KaroserieTyp karoserieTyp) {
        this.barva = barva;
        this.karoserieTyp = karoserieTyp;
    }

    public String getBarva() {
        return barva;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    public KaroserieTyp getKaroserieTyp() {
        return karoserieTyp;
    }

    public void setKaroserieTyp(KaroserieTyp karoserieTyp) {
        this.karoserieTyp = karoserieTyp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.barva);
        hash = 17 * hash + Objects.hashCode(this.karoserieTyp);
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
        final Karoserie other = (Karoserie) obj;
        if (!Objects.equals(this.barva, other.barva)) {
            return false;
        }
        return this.karoserieTyp == other.karoserieTyp;
    }

    @Override
    public String toString() {
        return "Karoserie{" + "barva=" + barva + ", karoserieTyp=" + karoserieTyp + '}';
    }
    
    
}
