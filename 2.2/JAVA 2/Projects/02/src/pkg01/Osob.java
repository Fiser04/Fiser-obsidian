/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01;

/**
 *
 * @author fialav06
 */
public class Osob extends Vozidlo{
    private int pocetSedacek;

    public Osob(String id, int pocetSedacek, String name) {
        super(id, name);
        this.pocetSedacek = pocetSedacek;
    }

    public int getPocetSedacek() {
        return pocetSedacek;
    }

    public void setPocetSedacek(int pocetSedacek) {
        this.pocetSedacek = pocetSedacek;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.pocetSedacek;
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
        final Osob other = (Osob) obj;
        return this.pocetSedacek == other.pocetSedacek;
    }

    @Override
    public String toString() {
        return "Osobni{" +super.toString() + "pocetSedacek=" + pocetSedacek + '}';
    }

    @Override
    public int compareTo(prvek o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
