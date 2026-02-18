/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02.evidencevozidel;

import java.util.Objects;

/**
 *
 * @author fiser
 */
public class Auto {
    private String jmeno;
    private String barva;

    public Auto(String jmeno, String barva) {
        this.jmeno = jmeno;
        this.barva = barva;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getBarva() {
        return barva;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.jmeno);
        hash = 67 * hash + Objects.hashCode(this.barva);
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
        if (!Objects.equals(this.jmeno, other.jmeno)) {
            return false;
        }
        return Objects.equals(this.barva, other.barva);
    }

    @Override
    public String toString() {
        return "Auto{" + "jmeno=" + jmeno + ", barva=" + barva + '}';
    }
    
    
    
}
