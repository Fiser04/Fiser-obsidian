//Den 3
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulackauroku;
import java.util.Scanner;
/**
 *
 * @author fiser
 */
public class KalkulackaUroku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //nevim jestli je to urok, nemam tucha jak jsou vsechny teoreticky nazvy v bankovnictvi, proste to kolik teoreticky dostanete za to ze mate penize v bance
        Scanner sc = new Scanner(System.in);
        
        double original;
        double procento;
        int delkaIntervalu;
        int pocetLet;
        double celek;
        
        System.out.print("Kolik chcete vlozit? ");
        original = sc.nextDouble();
        System.out.print("Jake je procento? ");
        procento = sc.nextDouble() / 100;
        System.out.print("Pocet neceho za rok? ");
        delkaIntervalu = sc.nextInt();
        System.out.print("Na jak dlouho (roky)? ");
        pocetLet = sc.nextInt();
        
        celek = original * Math.pow(1 + procento / delkaIntervalu, delkaIntervalu * pocetLet);
        System.out.println(celek);
        
        
        
        sc.close();
    }
    
}
