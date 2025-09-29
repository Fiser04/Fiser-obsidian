//Den 2
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcart;
import java.util.Scanner;
/**
 *
 * @author fiser
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String polozka;
        double cena;
        int pocet;
        String mena = "kc";
        double celkem;
        
        System.out.print("Co by si chtel koupti ");
        polozka = sc.nextLine();
        System.out.print("Cena jedne polozky? ");
        cena = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kolik toho potrebujes? ");
        pocet = sc.nextInt();
        sc.nextLine();
        
        celkem = cena * pocet;
        System.out.println("");
        System.out.printf("Celkove za %s das %.2f %s.\n", polozka, celkem, mena);
        sc.close();
    }
    
}
