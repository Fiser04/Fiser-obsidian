//Den 17
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericita;

import java.util.ArrayList;

/**
 *
 * @author odkolin
 */
public class Genericita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // <T> type parametr (proste aby tam neco bylo, placeholder), takze proste si to predstavim jako popelnici
        // <String> type argument, a tohle zase trideny odpad
        
        
        //jiz znamy type argument
        ArrayList<String> ovoce = new ArrayList<>();
        ovoce.add("jablko");
        ovoce.add("tresen");
        ovoce.add("hruska");
        
        Box<String> box = new Box<>();
        box.setCokoliv("banan");
        System.out.println(box.getCokoliv());
        
        //muzu mit vice typu <T, U>
        Produkt<String, Integer> produkt = new Produkt<>("Puska", 400);
        
        produkt.setCena(500);
        System.out.println(produkt.getCena()+ " " + produkt.getPolozka());
    }
    
}
