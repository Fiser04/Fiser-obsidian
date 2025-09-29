//Den 13
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacy;

/**
 *
 * @author fiser
 */
public class Interfacy {
    public static void main(String[] args) {
        /*
        interface = pomoci abstraktu muze mit trida vice rodicu
        */
        
        Kralik kralik = new Kralik();
        Ryba ryba = new Ryba();
        Jestrab jestrab = new Jestrab();
        
        kralik.utect();
        jestrab.lovit();
        
        ryba.lovit();
        ryba.utect();
    }
    
}
