/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01;

/**
 *
 * @author fialav06
 */
public abstract class prvek implements Comparable<prvek> {
    protected String id;

    public prvek(String id) {
        this.id = id;
    }

    
    public String getId() {
        return id;
    }

    @Override
    public int compareTo(prvek o) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return Integer.compare(this.id, o.getId());
    }
    
}
