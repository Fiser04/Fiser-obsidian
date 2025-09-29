//Den 22
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vypocetstariauta;

/**
 *
 * @author fiser
 */
public class VypocetStariAuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Auto felda = new Auto("skoda", 300000, 2001);
        felda.AddKilomete(40000);
        System.out.println(felda.najeto);
        System.out.println(felda.vekVozidla());
    }
    
}
