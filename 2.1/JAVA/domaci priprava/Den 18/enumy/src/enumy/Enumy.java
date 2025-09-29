//Den 18
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumy;

import java.util.Scanner;

/**
 *
 * @author odkolin
 */
public class Enumy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //enums je takova trida pro aliasy
        Scanner sc = new Scanner(System.in);
        System.out.println("Jaky je den tydnu");
        String odpoved = sc.nextLine().toUpperCase();
        
        try {
            Den den = Den.valueOf(odpoved);
            System.out.println((den.getDenCislo()));
            
            switch (den) {
                case PONDELI, UTERY, STREDA, CTVRTEK, PATEK:
                    System.out.println("Je pracovni den");
                    break;
                case SOBOTA, NEDELE:
                    System.out.println("Je vikend");
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (AssertionError assertionError) {
            
        } catch(IllegalArgumentException il){
            System.out.println("Toto neni den v tydnu");
        }
        sc.close();
    }
    
}
