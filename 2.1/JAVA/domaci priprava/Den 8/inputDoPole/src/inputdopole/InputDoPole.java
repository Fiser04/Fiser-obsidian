//Den 8
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputdopole;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class InputDoPole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kolik polozek chcete vlozit: ");
        int pocetPolozek = sc.nextInt();
        sc.nextLine();
        String[] polozky = new String[pocetPolozek];
        for (int i = 0; i < pocetPolozek; i++) {
            System.out.print("Nazev polozky: ");
            polozky[i] = sc.nextLine();
        }
        for (String polozka : polozky) {
            System.out.println(polozka);
        }
        sc.close();

    }

}
