//Den 4
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package substringmetoda;
import java.util.Scanner;
/**
 *
 * @author fiser
 */
public class SubstringMetoda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //substring extrahuje cast stringu
        Scanner sc = new Scanner(System.in);
        System.out.print("Jaka je vase emailova adresa: ");
        String celaAdresa = sc.nextLine();
        try {
            String jmeno = (celaAdresa.substring(0, (celaAdresa.indexOf("@")))).replace(".", " ");
            if(jmeno.isEmpty()){
                throw new Exception();
            }else{
                String domena = celaAdresa.substring((celaAdresa.indexOf("@")) + 1, (celaAdresa.length()));
                System.out.printf("Vase jmeno je: %s\nVase domena je: %s\n", jmeno, domena);
            }
        } catch (Exception e) {
            if(celaAdresa.isEmpty()){
                System.out.println("Nic jste nezadali");
            }else{
                System.out.println("Toto neni emailova adresa");
            }
        }

        sc.close();
    }
    
}
