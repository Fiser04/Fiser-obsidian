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
public class Pneu {
    private double prumer, sirka;
    private PneuType pneuType;

    public Pneu(double prumer, double sirka, PneuType pneuType) {
        this.prumer = prumer;
        this.sirka = sirka;
        this.pneuType = pneuType;
    }

    public double getPrumer() {
        return prumer;
    }

    public void setPrumer(double prumer) {
        this.prumer = prumer;
    }

    public double getSirka() {
        return sirka;
    }

    public void setSirka(double sirka) {
        this.sirka = sirka;
    }

    public PneuType getPneuType() {
        return pneuType;
    }

    public void setPneuType(PneuType pneuType) {
        this.pneuType = pneuType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.prumer) ^ (Double.doubleToLongBits(this.prumer) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.sirka) ^ (Double.doubleToLongBits(this.sirka) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.pneuType);
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
        final Pneu other = (Pneu) obj;
        if (Double.doubleToLongBits(this.prumer) != Double.doubleToLongBits(other.prumer)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sirka) != Double.doubleToLongBits(other.sirka)) {
            return false;
        }
        return this.pneuType == other.pneuType;
    }

    @Override
    public String toString() {
        return "Pneu{" + "prumer=" + prumer + ", sirka=" + sirka + ", pneuType=" + pneuType + '}';
    }
    
    
}
