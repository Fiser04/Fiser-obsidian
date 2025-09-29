//Den 8
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telefon;

/**
 *
 * @author fiser
 */
public class Telefon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] telephone = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };
        
        for(char[] radek : telephone){
            for(char tlacitko : radek){
                System.out.print(tlacitko + " ");
            }
            System.out.println();
        }
    }

}
