/*//den 1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

/**
 *
 * @author fiser
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vek; //deklarace
        vek = 20; //prirazeni
        String jmeno = "Adam"; //lze najednou, text
        final int rokNarozeni = 2000; //vytvoreni konstanty, cele cislo
        System.out.printf("Jmeno je %s, narodil se v %d a je mu %d\n", jmeno, rokNarozeni, vek);
        
        double cena = 20.99; //desetine cislo
        System.out.printf("Cena je %.2f\n", cena);
        
        char zavinac = '@'; //charakter
        System.out.printf("Zavinac vypada takto %s\n", zavinac);
        
        boolean jeOtevreno = false; //defakto jeden bit, 0 nebo 1 (pro nas false/true)
        if (jeOtevreno) { //pokud jeOtevreno je pravda tak:
            System.out.printf("Je otevreno\n");
        }else{ //jinak:
            System.out.printf("Je zavreno\n");
        }
        
        String nazevFirmy = "SB";
        String logoBarva = "cerna";
        String umisteni = "Benesov";
        System.out.printf("Tato firma se jmenuje %s, jeji znak je %s a nachazi se v %s.\n", nazevFirmy, logoBarva, umisteni);
        
        
    }
    
}
