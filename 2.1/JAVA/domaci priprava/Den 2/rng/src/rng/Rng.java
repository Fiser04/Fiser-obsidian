//Den 2
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rng;

import java.util.Random;
/**
 *
 * @author fiser
 */
public class Rng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        number = random.nextInt(); //-2 miliardy az +2 miliardy
        number = random.nextInt(1,7); //cisla 1 az 6, od i a do
        System.out.println(number);
        
        double smallNumber = random.nextDouble();
        System.out.println(smallNumber);
        
        boolean isHead = random.nextBoolean();
        System.out.println(isHead);
        if(isHead){
            System.out.println("Head");
        }else{
            System.out.println("Tail");
        }
        
    }
    
}
