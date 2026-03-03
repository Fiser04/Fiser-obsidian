/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author fialav06
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean running = true;
        try (Scanner sc = new Scanner(System.in)) {
            while (running) {
                try {
                    System.out.println("Zadejte 2 cela cisla");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println(Calculator.podil(a, b));
                    running = false;
                } catch (MojeVyjmka e) {
                    System.out.println(e.getMessage());
                } catch (Exception ex) {
                    System.out.println("Nepodporovany input, zkuste to znovu");
                    sc.nextLine();
                }
            }
        }
    }

}
