//Den 6
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloops;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        for(int i = 0; i<6; i++){
            System.out.println(i);
        }
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("kolikrat to chces vypsat? ");
        int max = sc.nextInt();

        for (int i = 1; i < max + 1; i++) {
            System.out.println(i);
        }
        sc.close();

    }

}
