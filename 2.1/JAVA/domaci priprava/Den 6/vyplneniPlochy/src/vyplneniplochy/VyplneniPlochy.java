//Den 6
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vyplneniplochy;
import java.util.Scanner;
/**
 *
 * @author fiser
 */
public class VyplneniPlochy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("vloz pocet radku: ");
        int pocetX = sc.nextInt();
        System.out.print("vloz pocet sloupcu: ");
        int pocetY = sc.nextInt();
        sc.nextLine();
        System.out.print("vloz charakter: ");
        char znak = ((sc.next()).trim()).charAt(0);
        
        for (int i = 0; i<pocetX; i++){
            for(int j = 0; j<pocetY; j++){
                System.out.print(znak);
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
