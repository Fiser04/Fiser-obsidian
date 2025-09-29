//Den 12
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepisovanimethod;

/**
 *
 * @author fiser
 */
public class PrepisovaniMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pes pes = new Pes();
        Kocka kocka = new Kocka();
        Ryba ryba = new Ryba();

        pes.behani();
        kocka.behani();
        ryba.behani();
        /*output
        tohle zvire prave bezi
        tohle zvire prave bezi
        tohle zvire prave bezi
         */
        //od kdy ryba bezi, takze se musi prepsat methoda
        
    }

}
