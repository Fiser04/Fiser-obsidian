//Den 5
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overenipouzitiuzivatelskehojmena;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class OvereniPouzitiUzivatelskehoJmena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4 - 12 znaku
        // nesmi mit mezery
        System.out.print("Zadej jmeno uzivatele: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.length() >= 4 && input.length() <= 12 && !(input.contains(" "))) {
            System.out.println("Validni jmeno");
        }else{
            System.out.println("Nevalidni jmeno");
        }

        sc.close();
    }

}
