/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author fiser
 */
public class Obchod {
    private List<Vozidlo> nabidka;

    public Obchod() {
        this.nabidka = new ArrayList();
    }

    public void pridejAuto(Karoserie karoserie, Motor motor, String nazev, String znacka, Pneu[] pneu, double cena){
        nabidka.add(new Auto(karoserie, motor, nazev, znacka, pneu, cena));
    }
    
    public void zobrazNabidku(){
        for(Vozidlo v: nabidka){
            System.out.println(v);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public List<Vozidlo> getNabidka() {
        return nabidka;
    }

    public void setNabidka(List<Vozidlo> nabidka) {
        this.nabidka = nabidka;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nabidka);
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
        final Obchod other = (Obchod) obj;
        return Objects.equals(this.nabidka, other.nabidka);
    }
    
 
    @Override
    public String toString() {
        return "obchod{" + "nabidka=" + nabidka + '}';
    }
    
    
    
}
