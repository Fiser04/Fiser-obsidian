/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konstruktory;

/**
 *
 * @author fiser
 */
public class Studenti {
    String jmeno;
    int vek;

    public Studenti(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }
    
    void print(){
        System.out.println(jmeno);
        System.out.println(vek);
    }
    
    
}
