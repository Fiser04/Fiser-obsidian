/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01;

/**
 *
 * @author fialav06
 */
public class Moto extends Vozidlo{
    private int rozsahRiditek;

    public Moto(String id, int rozsahRiditek, String name) {
        super(id, name);
        this.rozsahRiditek = rozsahRiditek;
    }

    public int getRozsahRiditek() {
        return rozsahRiditek;
    }

    public void setRozsahRiditek(int rozsahRiditek) {
        this.rozsahRiditek = rozsahRiditek;
    }

    @Override
    public String toString() {
        return "Motorka{" +super.toString()+ "rozsahRiditek=" + rozsahRiditek + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.rozsahRiditek;
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
        final Moto other = (Moto) obj;
        return this.rozsahRiditek == other.rozsahRiditek;
    }
    
    
    
}
