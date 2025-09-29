//Den 2
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatment;
import java.util.Scanner;
/**
 *
 * @author fiser
 */
public class IfStatment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kolik vam je let? ");
        int vek = sc.nextInt();
        
        if (vek >= 18){
            System.out.println("Jsi dospely");
        }else if (vek > 60){
            System.out.println("Jsi duchodce");
            //co se stane kdyz ale teda zadam vek vetsi jak 60?
            //no proste to vypise ze jsi dospely protoze je to kontroluje driv a pak na vse ostatni se vykasle
        }else if (vek < 0){
            System.out.println("Jeste nejsi narozen");
        }else if (vek == 0){
            System.out.println("Jsi mimino");
        }else{
            System.out.println("Nejsi dospely");
        }
        sc.next();
        System.out.println("Jak se jmenujete? ");
        String name = sc.nextLine();
        
        if (name.isEmpty()){
            System.out.println("Nezadal jste jmeno");
        }else{
            System.out.printf("Ahoj %s\n", name);
        }
        sc.close();
    }
    
}
