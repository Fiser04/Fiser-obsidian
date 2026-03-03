/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01;

/**
 *
 * @author fialav06
 */
public abstract class Vozidlo extends prvek implements Comparable<Vozidlo>{
    private String name;

    public Vozidlo(String id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final Vozidlo other = (Vozidlo) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Vozidlo{" + "name=" + name + '}';
    }

    @Override
    public int compareTo(Vozidlo o) {
        return (o.getName().compareTo(name));
    
}
}
