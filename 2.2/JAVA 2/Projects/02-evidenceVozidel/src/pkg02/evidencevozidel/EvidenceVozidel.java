/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.evidencevozidel;

/**
 *
 * @author fiser
 */
public class EvidenceVozidel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a = new Auto("multipla", "modra");
        Auto b = new Auto("passat", "zelenej");
        Evidecne e = new Evidecne();
        
        e.pridejAuto(a);
        e.pridejAuto(b);
        e.showAll();
        System.out.println();
        e.odstranAuto(a);
        e.showAll();
        System.out.println();
        try{
        System.out.println(e.findByName("passat"));
        }
        catch(Exception v){
            System.out.println(v.getMessage());
        }
    }
    
}
