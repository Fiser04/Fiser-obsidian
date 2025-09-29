//Den 8
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pole;
import java.util.Arrays;
/**
 *
 * @author fiser
 */
public class Pole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //kolekce hodnot stejneho typu
        String[] ovoce = {"jablko", "hruska", "merunka"};
        System.out.println(ovoce.length);

        //pomoci klasickeho for loopu
        for (int i = 0; i < ovoce.length; i++) {
            if (i == ovoce.length - 1) {
                System.out.printf("%s\n", ovoce[i]);
            } else {
                System.out.printf("%s, ", ovoce[i]);
            }
        }
        //Arrays.sort(ovoce);
        //Arrays.fill(ovoce,"2");
        
        //lepsi postup, pomovi for each
        for(String jednoOvoce : ovoce){
            if(jednoOvoce.equals(ovoce[ovoce.length - 1])){
                System.out.printf("%s\n", jednoOvoce);
            }else{
                System.out.printf("%s, ", jednoOvoce);
            }
        }
    }

}
