//Den 3
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vyuzitimatematiky;
import java.util.Scanner;
/**
 *
 * @author fiser
 */
public class VyuzitiMatematiky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //c=odmocnina(a^2 + b^2)
        Scanner sc = new Scanner(System.in);
        
        System.out.print("A: ");
        double a = sc.nextInt();
        System.out.print("B: ");
        double b = sc.nextInt();
        double c = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );
        System.out.printf("%.3f\n", c);
        
        //kruh
        System.out.print("r: ");
        double r = sc.nextDouble();
        double obvod = 2.0 * Math.PI * r;
        double obsah = Math.PI * Math.pow(r, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.printf("Obvod je %.3f.\n", obvod);
        System.out.printf("Obsah je %.3f.\n", obsah);
        System.out.printf("Volume je %.3f.\n", volume);
        
        
        sc.close();
    }
    
}
