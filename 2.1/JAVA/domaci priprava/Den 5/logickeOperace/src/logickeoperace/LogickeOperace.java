//Den 5
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logickeoperace;

/**
 *
 * @author fiser
 */
public class LogickeOperace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // || or (staci jedno aby platil)
        // && and (musi oba platit)
        // ! not (negace)
        double teplota = 20;
        boolean neprsi = true;
        if (teplota > 15 && teplota < 30 && neprsi) { //vsechny strany plati
            System.out.println("je v pohode");
        } else {
            System.out.println("je hnusne");
        }

        String input = "q";
        if (((input.toLowerCase()).equals("q")) || (input.toLowerCase()).equals("quite")) { //alespon jedna strana plati
            System.out.println("konec");
        }
        
        boolean lez = false;
        if (!lez){
            System.out.println("z false je true");
        }
    }

}
