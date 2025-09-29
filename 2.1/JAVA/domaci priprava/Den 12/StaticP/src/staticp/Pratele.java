/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticp;

/**
 *
 * @author fiser
 */
public class Pratele {

    String jmeno;
    static int pocetPratel;

    Pratele(String jmeno) {
        this.jmeno = jmeno;
        pocetPratel++;
    }

    static void printPratele() {
        System.out.println(pocetPratel);
    }
}
