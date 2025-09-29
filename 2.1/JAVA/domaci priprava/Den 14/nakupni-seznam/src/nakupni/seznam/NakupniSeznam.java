//Den 14
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nakupni.seznam;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author fiser
 */
public class NakupniSeznam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("zadejte jidlo, pro ukonceni vlozte 'q'");
        ArrayList<String> jidlo = new ArrayList<>();
        while (true) {            
            input = sc.nextLine();
            if (input.equals("q")){
                break;
            }else{
                jidlo.add(input);
            }
        }
        System.out.println(jidlo);
        for(String s : jidlo){
            System.out.println("Jidlo na pozici "+ (jidlo.indexOf(s)+1) + " je " + s);
        }
        sc.close();
    }
    
}
