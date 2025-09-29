//Den 12
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dedicnost;

/**
 *
 * @author fiser
 */
public class Dedicnost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // jakoby prenechavam atributy, zvire -> ptak -> orel

        Pes pes = new Pes();
        Kocka kocka = new Kocka();
        Rostlina rostlina = new Rostlina();
        
        System.out.println(pes.zije);
        System.out.println(kocka.zije);
        pes.jist();
        kocka.jist();
        rostlina.fotosinteza();
         
    }

}
