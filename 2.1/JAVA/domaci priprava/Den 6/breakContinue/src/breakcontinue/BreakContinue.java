//Den 6
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakcontinue;

/**
 *
 * @author fiser
 */
public class BreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //break - konec
        //continue - skip
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

}
