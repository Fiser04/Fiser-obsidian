//Den 22
package scitani1don;

import java.util.Scanner;

public class Scitani1doN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vysledek = 0;
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        for(int i = 1; i<=input; i++){
        vysledek += i;
            }
        System.out.println(vysledek);
        sc.close();
    }
    
}
