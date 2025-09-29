//Den 4
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ternarnioperatory;

/**
 *
 * @author fiser
 */
public class TernarniOperatory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int skore = 60;
        
        //dosud znamej zapis
        if (skore >= 50){
            System.out.println("Uspel si");
        }else{
            System.out.println("Neuspel si");
        }
        
        //ternarni operator
        String prostel = (skore >= 50) ? "Uspel si" : "Neuspel si";
        System.out.println(prostel);  
        
        int number = 2;
        String jeSudy = ((number % 2) == 0) ? "Ano je" : "Ne neni";
        System.out.println(jeSudy);
        
        int hodin = 19;
        String americkyCas = (hodin >= 12) ? "PM" : "AM";
        System.out.println(hodin + " je " + americkyCas);
    }
    
}
