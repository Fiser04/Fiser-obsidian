//Den 23
package nacteniavypocteni;

/**
 *
 * @author fiser
 */
public class NacteniAvypocteni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nazevSoubor = "text.txt";
        Nacitac nacitac = new Nacitac(nazevSoubor);
        nacitac.nacteniSouboru();
    }
    
}
