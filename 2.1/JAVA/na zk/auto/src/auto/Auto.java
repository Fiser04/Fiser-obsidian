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
public class Auto extends MotoroveVozidlo{
    private Karoserie karoserie;
    private double cena;

    public Auto(Karoserie karoserie, Motor motor, String nazev, String znacka, Pneu[] pneu, double cena) {
        super(motor, nazev, znacka, pneu);
        this.karoserie = karoserie;
        this.cena = cena;
    }

    public Karoserie getKaroserie() {
        return karoserie;
    }

    public void setKaroserie(Karoserie karoserie) {
        this.karoserie = karoserie;
    }
    
    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Auto{" + "karoserie=" + karoserie + ", cena=" + cena + '}' + " "+ super.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.karoserie);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.cena) ^ (Double.doubleToLongBits(this.cena) >>> 32));
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
        final Auto other = (Auto) obj;
        if (Double.doubleToLongBits(this.cena) != Double.doubleToLongBits(other.cena)) {
            return false;
        }
        return Objects.equals(this.karoserie, other.karoserie);
    }

    
}
