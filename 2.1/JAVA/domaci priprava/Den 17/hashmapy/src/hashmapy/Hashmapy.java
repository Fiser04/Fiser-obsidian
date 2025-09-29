//Den 17
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmapy;

import java.util.HashMap;

/**
 *
 * @author odkolin
 */
public class Hashmapy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // hashmap = rekneme ze to udrzuje nejaka data <Key, Value>, key bude jedinecny, podivej se do genericita
        HashMap<String, Double> map = new HashMap<>();

        map.put("Jablko", 5.2);
        map.put("Hruska", 6.3);
        map.put("Banan", 4.7);
        System.out.println(map); //{Banan=4.7, Hruska=6.3, Jablko=5.2}, teoreticky muzu rict ze to je arraylist ALE key si urcuju ja a ne system cislem
        map.put("Banan", 3.2); //prepisovani hodnot
        System.out.println(map);
        map.remove("Hruska"); //odstraneni
        System.out.println(map);

        System.out.println((map.get("Jablko"))); //vrati cenu
        System.out.println((map.containsKey("Banan"))); //vrati true/false jestli existuje takovyhle klic

        System.out.println(map.containsValue(5.2)); //vrati true/false jestli existuje tato hodnota (value)
        
        System.out.println(map.size()); //vrati velikost, stejne jako u pole ci array listu
        
        for(String s : map.keySet()){
            System.out.println(s + " stoji " + map.get(s) + " korun");
        }

    }

}
