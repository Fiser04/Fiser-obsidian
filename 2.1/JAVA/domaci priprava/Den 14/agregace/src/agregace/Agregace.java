/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agregace;

import java.awt.print.Book;

/**
 *
 * @author fiser
 */
public class Agregace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // mam 2 objekty, kniha a knihovna, agregace je to co v databazich bylo sipkama, knihovna ma vice knih, kniha je jen v jedne knihovne
        Kniha kniha1 = new Kniha("Slovnik", 480);
        Kniha kniha2 = new Kniha("Pohadka", 293);
        Kniha kniha3 = new Kniha("Povidky", 120);
        
        Kniha[] knihy = {kniha1, kniha2, kniha3};
        
        Knihovna knihovna = new Knihovna("Zizkovo", knihy, 2003);
        
        knihovna.ukazInfo();
    }
    
}
