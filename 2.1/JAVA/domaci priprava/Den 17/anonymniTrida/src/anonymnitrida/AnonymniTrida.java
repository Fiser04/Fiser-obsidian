//Den 17
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anonymnitrida;

/**
 *
 * @author odkolin
 */
public class AnonymniTrida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // anonymni trida je trida bez jmena, pouziva se na one time use
        Pes pes = new Pes();
        pes.stek();
        //ale co kdyz je nejakej pes postizenej, prece nebudu kvuli nemu delat celou novou tridu
        Pes pesPostiho = new Pes(){
            @Override
            void stek(){
                System.out.println("HUF");
            }
        };
        pesPostiho.stek();
    }
    
}
