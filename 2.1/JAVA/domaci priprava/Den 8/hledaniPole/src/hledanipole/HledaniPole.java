//Den 8
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hledanipole;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class HledaniPole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] jmenaPole = {"jan", "marek", "gregor", "rehor", "vojtech"};
        System.out.print("hledane jmeno: ");
        String hledaneJmeno = sc.nextLine();
        boolean nalezen = false;
        
        for(int i = 0; i< jmenaPole.length; i++){
            if((hledaneJmeno.toLowerCase()).equals(jmenaPole[i].toLowerCase())){
                System.out.printf("hledane jmeno ma index %d\n", i);
                nalezen = true;
                break;
            }
        }
        if(!nalezen){
            System.out.println("Nenalezen");
        }
        
        sc.close();
    }

}
