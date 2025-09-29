//Den 12
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticp;

/**
 *
 * @author fiser
 */
public class StaticP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // static nam urcuje ze promena patri tride a ne objektu, pouziva se pro sdileni tech samych zdroju
        
        Pratele pritel1 = new Pratele("Havel");
        Pratele pritel2 = new Pratele("Karel");
        Pratele pritel3 = new Pratele("Josef");
        Pratele pritel4 = new Pratele("Marek");
        
        System.out.println(Pratele.pocetPratel);
        Pratele.printPratele();
    }
    
}
