/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author fialav06
 */
public class Auta {

    private List<Vozidlo> list = new ArrayList();

    public void pridej(Vozidlo v) throws PradavaniNullException {
        if(v == null){
            throw new PradavaniNullException("zkouska pridani null");
        }
        this.list.add(v);
    }
    
    public void pridejVozidlo(Vozidlo v){
        try {
            pridej(v);
        } catch (PradavaniNullException e) {
            System.out.println(e.getMessage());
        }
    }

    public void odebrat(Vozidlo v) throws PrazdnaKolekceException {
        if (this.list.isEmpty()) {
            throw new PrazdnaKolekceException("nic tam neni");
        }
        this.list.remove(v);
    }
    
    public void odebratFull(Vozidlo v){
        try {
            odebrat(v);
        } catch (PrazdnaKolekceException e) {
            System.out.println(e.getMessage());
        }
    }

    public void remove(Vozidlo v) {
        try {
            if (this.list.isEmpty()) {
                throw new PrazdnaKolekceException("nic tam neni, ale vubec");
            }
        } catch (PrazdnaKolekceException e) {
            System.out.println(e.getMessage());
        }
    }

    public void zobraz() {
        for (Vozidlo v : list) {
            System.out.println(v);
        }
    }

    public List<Vozidlo> getList() {
        return list;
    }

    public void setList(List<Vozidlo> list) {
        this.list = list;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.list);
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
        final Auta other = (Auta) obj;
        return Objects.equals(this.list, other.list);
    }

    @Override
    public String toString() {
        return "Auta{" + "list=" + list + '}';
    }

    
    
    
    
    
    
    
}
