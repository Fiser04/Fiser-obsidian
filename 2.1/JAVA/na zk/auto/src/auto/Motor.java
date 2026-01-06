package auto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fiser
 */
public class Motor {
    private int obsah;
    private double vykon;
    private double vyska, sirka, delka;

    public Motor(int obsah, double vykon, double vyska, double sirka, double delka) {
        this.obsah = obsah;
        this.vykon = vykon;
        this.vyska = vyska;
        this.sirka = sirka;
        this.delka = delka;
    }

    public int getObsah() {
        return obsah;
    }

    public void setObsah(int obsah) {
        this.obsah = obsah;
    }

    public double getVykon() {
        return vykon;
    }

    public void setVykon(double vykon) {
        this.vykon = vykon;
    }

    public double getVyska() {
        return vyska;
    }

    public void setVyska(double vyska) {
        this.vyska = vyska;
    }

    public double getSirka() {
        return sirka;
    }

    public void setSirka(double sirka) {
        this.sirka = sirka;
    }

    public double getDelka() {
        return delka;
    }

    public void setDelka(double delka) {
        this.delka = delka;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.obsah;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.vykon) ^ (Double.doubleToLongBits(this.vykon) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.vyska) ^ (Double.doubleToLongBits(this.vyska) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.sirka) ^ (Double.doubleToLongBits(this.sirka) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.delka) ^ (Double.doubleToLongBits(this.delka) >>> 32));
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
        final Motor other = (Motor) obj;
        if (this.obsah != other.obsah) {
            return false;
        }
        if (Double.doubleToLongBits(this.vykon) != Double.doubleToLongBits(other.vykon)) {
            return false;
        }
        if (Double.doubleToLongBits(this.vyska) != Double.doubleToLongBits(other.vyska)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sirka) != Double.doubleToLongBits(other.sirka)) {
            return false;
        }
        return Double.doubleToLongBits(this.delka) == Double.doubleToLongBits(other.delka);
    }

    @Override
    public String toString() {
        return "Motor{" + "obsah=" + obsah + ", vykon=" + vykon + ", vyska=" + vyska + ", sirka=" + sirka + ", delka=" + delka + '}';
    }
    
    
}
