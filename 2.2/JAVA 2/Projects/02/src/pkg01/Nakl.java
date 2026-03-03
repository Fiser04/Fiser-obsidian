/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01;

/**
 *
 * @author fialav06
 */
public class Nakl extends Vozidlo{
    private int maxNosnost;

    public Nakl(String id, int maxNosnost, String name) {
        super(id,name);
        this.maxNosnost = maxNosnost;
    }

    public int getMaxNosnost() {
        return maxNosnost;
    }

    public void setMaxNosnost(int maxNosnost) {
        this.maxNosnost = maxNosnost;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.maxNosnost;
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
        final Nakl other = (Nakl) obj;
        return this.maxNosnost == other.maxNosnost;
    }

    @Override
    public String toString() {
        return "Nakladni{" + super.toString()+ "maxNosnost=" + maxNosnost + '}';
    }
    
    
    
}
