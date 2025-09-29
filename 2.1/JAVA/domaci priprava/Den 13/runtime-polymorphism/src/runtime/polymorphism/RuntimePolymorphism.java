//Den 13
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runtime.polymorphism;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class RuntimePolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //az kdyz program bezi tak se rozhodne jaky typ to je
        Animal animal;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 je pes, 2 je kocka");
        int vyber = sc.nextInt();
        if (vyber == 1) {
            animal = new Pes();
            animal.speak();
        } else if (vyber == 2) {
            animal = new Kocka();
            animal.speak();
        }
        
        sc.close();
    }

}
