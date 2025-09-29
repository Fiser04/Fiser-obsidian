//Den 11
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objekty;

/**
 *
 * @author fiser
 */
public class Objekty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objekt je entita drzici data (atributy) a funkce (metody)
        // pro vytvoreni objeku je potreba trida, ktera slouzi jako blueprint
        
        auto tutel = new auto();
        
        tutel.maTechnickou = false;
        
        System.out.println(tutel.vyrobce);
        System.out.println(tutel.model);
        System.out.println(tutel.rocnik);
        System.out.println(tutel.cena);
        System.out.println(tutel.maTechnickou);
    }
    
}
