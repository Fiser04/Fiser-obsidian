/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01;

/**
 *
 * @author fialav06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auta auta = new Auta();

        Vozidlo v1 = new Osob("1",4, "multipla");
        Vozidlo v2 = new Moto("2", 100, "yamaha");
        Vozidlo v3 = new Nakl("3", 4000, "nakladak");

//        auta.pridej(v1);
//        auta.pridej(v2);
//        auta.pridej(v3);
//        auta.remove(v3);


//        try {
//            auta.odebrat(v3);
//        } catch (PrazdnaKolekceException e) {
//            System.out.println(e.getMessage());
//        }
        //  auta.odebratFull(v3);
        //auta.pridejVozidlo(null);
        // auta.zobraz();
        
        
        
        AutaSKolekci<Vozidlo> jes = new AutaSKolekci<>();
    }

}
