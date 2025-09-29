//Den 8
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pole2d;

/**
 *
 * @author fiser
 */
public class Pole2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pole v poli jakoby
        String[] ovoce = {"Jablko", "Hruska", "Pomeranc"};
        String[] zelenina = {"Mrkev", "Zeli", "Kapusta"};
        String[] masa = {"Kreci", "Veprove", "Hovezi", "Jehneci"};
        
        String[][] jidlo = {ovoce, zelenina, masa};
        
        jidlo[0][1] = "Tresen";
        for(String[] typJidla : jidlo){
            for(String potravina : typJidla){
                System.out.print(potravina + " ");
            }
            System.out.println();
        }
    }
    
}
