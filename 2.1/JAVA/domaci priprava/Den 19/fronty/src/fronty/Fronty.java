//Den 19
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fronty;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author odkolin
 */
public class Fronty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // queue = FIFO (first in first out), rada lidi treba, prisel jsem prvni tak i prvni budu odchazet
        //Queue<String> queue = new Queue<String>(); toto nelze, protoze Queue je interface
        
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("cislo1"); //pridam
        queue.offer("cislo2");
        queue.offer("cislo3");
        queue.offer("cislo4");
        System.out.println(queue);
        queue.poll(); //odstranim toho prvniho
        System.out.println(queue);
        System.out.println(queue.peek()); //zobrazim dalsiho na rade
        System.out.println(queue.contains("cislo3")); //vraci true kdyz tam je objekt
        
        /*
        pouziti queue:
            keyboard buffers
            printer queue
            LinkedList, PriorityQueus, Brethsearch 
        */
    }
    
}
