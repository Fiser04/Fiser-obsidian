/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kolekcezk;

/**
 *
 * @author fiser
 */
public class KolekceZK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nabidka<Dort> nabidka = new Nabidka<>();
        
        nabidka.pridej(new Dort("prazsky", 200));
        System.out.println(nabidka.vypis());
    }
    
}
