//Den 14
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylisty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/**
 *
 * @author fiser
 */
public class Arraylisty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // arraylist = rozsiritelne pole plne objektu
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3); //pridej
        list.add(6);
        list.add(0);
        System.out.println(list);
        
        
        ArrayList<String> ovoce = new ArrayList<>();
        ovoce.add("Jablko");
        ovoce.add("Hruska");
        ovoce.add("Jahoda");
        System.out.println(ovoce);
        
        //Odstran
        ovoce.remove("Hruska");
        System.out.println(ovoce);
        
        //Prehod
        ovoce.set(0, "Ananas");
        System.out.println(ovoce);
        
        //Ziskej na pozici
        System.out.println(ovoce.get(0)); 
        
        //Velikost pole
        System.out.println(ovoce.size()); 
        
        //Seradit pole
        //nebudu pouzivat nejake algoritmy, proste zavolam Collections
        ArrayList<Integer> cisla = new ArrayList<>();
        cisla.add(56);
        cisla.add(3234);
        cisla.add(-82374);
        cisla.add(123132);
        cisla.add(9);
        Collections.sort(cisla);
        System.out.println(cisla);
        

    }
    
}
