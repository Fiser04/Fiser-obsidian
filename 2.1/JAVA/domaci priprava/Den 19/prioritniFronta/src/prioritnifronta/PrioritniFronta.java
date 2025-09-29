//Den 19
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prioritnifronta;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author odkolin
 */
public class PrioritniFronta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // priorit queue = FIFO, ALE radim je podle urcite priority, 
        /*  priklad je treba ze mam mladeho krale a stareho chudaka, 
            chudak prisel prvni tak by mel jit na radu prvni 
            ale kral ma vetsi dulezitost tak pujde on prvni
         */
        
        //CISLA
        /*Queue<Double> queue = new PriorityQueue<>(); //od nejmensiho
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); //od nejvetsiho
        
        queue.offer(0.54);
        queue.offer(0.234);
        queue.offer(0.3042);
        queue.offer(0.92123);
        */
        
        //STRING
        //Queue<String> queue = new PriorityQueue<>(); //od a do z
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder()); //od z do a
        queue.offer("H");
        queue.offer("C");
        queue.offer("A");
        queue.offer("Z");
        
        
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        
    }
}
