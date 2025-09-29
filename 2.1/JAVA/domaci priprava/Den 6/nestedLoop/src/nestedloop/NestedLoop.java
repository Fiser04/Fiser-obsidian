//Den 6
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedloop;

/**
 *
 * @author fiser
 */
public class NestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //loop v loopu
        int[] cisla = {1, 2, 3};
        for (int i = 0; i < cisla.length; i++) {
            for (int j = i; j < cisla.length; j++) {
                System.out.print(cisla[j]);
            }
            System.out.println();
        }
    }

}
