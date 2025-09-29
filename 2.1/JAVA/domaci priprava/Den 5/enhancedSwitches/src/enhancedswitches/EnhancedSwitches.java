//Den 5
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enhancedswitches;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class EnhancedSwitches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napis jaky je den");
        String den = sc.nextLine();

        switch (den.toLowerCase()) {
            case "pondeli" ->
                System.out.println("je pracovni den");
            case "utery" ->
                System.out.println("je pracovni den");
            case "streda" ->
                System.out.println("je pracovni den");
            case "ctvrtek" ->
                System.out.println("je pracovni den");
            case "patek" ->
                System.out.println("je pracovni den");
            case "sobota" ->
                System.out.println("je vikend");
            case "nedele" ->
                System.out.println("je vikend");
            default ->
                System.out.println("toto neni den v tydnu");
        }

        //ale jakmile mam to stejne v outputu tak muzu jet pomoci carky
        switch (den.toLowerCase()) {
            case "pondeli", "utery", "streda", "ctvrtek", "patek" ->
                System.out.println("je pracovni den");
            case "sobota", "nedele" ->
                System.out.println("je vikend");
            default ->
                System.out.println("toto neni den v tydnu");
        }
        sc.close();
    }
}
