/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01.banka;

import java.util.Objects;

/**
 *
 * @author fiser
 */
public class Ucet {
    private String jmeno;
    private int stav = 0;

    public Ucet(String jmeno) {
        this.jmeno = jmeno;
    }
    
    public Ucet(String jmeno, int stav){
        this.jmeno = jmeno;
        this.stav = stav;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getStav() {
        return stav;
    }

    public void setStav(int stav) {
        this.stav = stav;
    }

    @Override
    public String toString() {
        return "Ucet{" + "jmeno=" + jmeno + ", stav=" + stav + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.jmeno);
        hash = 23 * hash + this.stav;
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
        final Ucet other = (Ucet) obj;
        if (this.stav != other.stav) {
            return false;
        }
        return Objects.equals(this.jmeno, other.jmeno);
    }
    
    public void vklad(int castka) throws  MyException{
        if(castka >= 0){
            this.stav += castka;
        }
        else{
            throw new MyException();
        }
    }
    
    public void vyber(int castka) throws MyException{
        if((this.stav - castka > 0) && castka >=0){
            this.stav -= castka;
        }
        else{
            throw new MyException();
        }
    }
}
