//Den 15
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepce;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class Excepce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exception = ruzne zachytavani chyb, jako treba snaha delit nulou, spatny input atd.

        //System.out.println(1 / 0); --> toto vytvori ArithmeticException protoze delime nulou
        /*
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) { --> chyba pri matice
            System.out.println("Delis nulou");
        }
         */
        // VERZE 1 - Bez try with resources, neboli musim pouzit finally pro scanner
        /*
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("vloz cislo");
                int num = sc.nextInt();
                System.out.println(num);
            } catch (InputMismatchException e) { // --> chyba pri typu inputu
                System.out.println("to neni cislo");
            }
            finally{ //toto se pusti urcite po tom co to zkusi, hlavne tedy zavirani souboru, scaneru atd.
                sc.close();
            }
         */
        //VERZE 2 - try with resources, neboli nemusim resit scanner protoze ho to hned zavre
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("vloz cislo");
            int num = sc.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("toto neni cislo");
        }
    }

}
