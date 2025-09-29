//Den 23
package bankovnictvijednoduche;

/**
 *
 * @author fiser
 */
public class BankovnictviJednoduche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankovniUcet bankovniUcet = new BankovniUcet("Franta lala", 5000);
        bankovniUcet.showZustatek();
        bankovniUcet.addPenize(300);
        bankovniUcet.addPenize(-100);
        bankovniUcet.takeOut(60000);
        bankovniUcet.takeOut(60);
        
    
}}
