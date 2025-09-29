//Den 2
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamemadlibs;

import java.util.Scanner;
/**
 *
 * @author fiser
 */
public class GameMadLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String pridavne1;
        String pridavne2;
        String podstatne;
        String sloveso;
        String pridavne3;
        
        System.out.printf("Vloz prvni pridavne jmeno: \n");
        pridavne1 = sc.nextLine();
        System.out.printf("Vloz podstatne jmeno: \n");
        podstatne = sc.nextLine();
        System.out.printf("Vloz druhe pridavne jmeno \n");
        pridavne2 = sc.nextLine();
        System.out.printf("Vloz sloveso: \n");
        sloveso = sc.nextLine();
        System.out.printf("Vloz treti pridavne jmeno: \n");
        pridavne3 = sc.nextLine();
        
        System.out.printf("Dnes jsem byl v %s zoo.\n", pridavne1);
        System.out.printf("V akvarku jsem videl %s.\n", podstatne);
        System.out.printf("%s byl %s a %s.\n", podstatne, pridavne2, sloveso);
        System.out.printf("By jsem %s.\n", pridavne3);
        sc.close();
    }
    
}
