
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean running = true;
        try (Scanner sc = new Scanner(System.in)) {
            while (running) {
                try{
                    System.out.println(Textering.kontrollen(sc));
                    running = false;
                } catch (MujException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
}
