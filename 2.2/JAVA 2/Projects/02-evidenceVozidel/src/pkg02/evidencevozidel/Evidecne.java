/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02.evidencevozidel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author fiser
 */
public class Evidecne {
    private List<Auto> listaut = new ArrayList<>();

    public void pridejAuto(Auto auto){
        this.listaut.add(auto);
    }
    
    public void odstranAuto(Auto auto){
        this.listaut.remove(auto);
    }
    
    public void showAll(){
        for (Auto a : this.listaut){
            System.out.println(a);
        }
    }

    public List<Auto> getListaut() {
        return listaut;
    }

    public void setListaut(List<Auto> listaut) {
        this.listaut = listaut;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.listaut);
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
        final Evidecne other = (Evidecne) obj;
        return Objects.equals(this.listaut, other.listaut);
    }

    @Override
    public String toString() {
        return "Evidecne{" + "listaut=" + listaut + '}';
    }
    
    public Auto findByName(String name) throws Exception {
        Auto a = null;
        for(Auto auto : this.listaut){
            if(auto.getJmeno().equals(name)){
                a = auto;
            }
        }
        
        if(a == null){
            throw new Exception("auto nenalezeno");
        }
        
        return a;
    }
    
}
