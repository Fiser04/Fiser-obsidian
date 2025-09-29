//Den 5
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whileloops;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class WhileLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        /*jednorazova kontrola
        if (name.isEmpty()) {
            System.out.print("Vloz jmeno: ");
            name = sc.nextLine();
        }
         */
 /*
        //dokud je jmeno prazdne, ptej se
        while (name.isEmpty()) {
            System.out.print("Vloz jmeno: ");
            name = sc.nextLine();
        }
        System.out.println("Ahoj " + name);
         */
 /*
        //nekonecny loop
        while (true) {
            if (name.equals("q")) {
                break;
            } else {
                System.out.print("Vloz jmeno: ");
                name = sc.nextLine();
                System.out.println("Ahoj " + name);
            }
        }
         */
        do {
            System.out.print("Vloz jmeno: ");
            name = sc.nextLine();
        } while (name.isEmpty());
        System.out.println("Ahoj " + name);
        sc.close();
    }

}
