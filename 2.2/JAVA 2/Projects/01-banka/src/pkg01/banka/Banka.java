/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.banka;

/**
 *
 * @author fiser
 */
public class Banka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Ucet ucet1 = new Ucet("karel",0);
            ucet1.vklad(100);
            System.out.println(ucet1);
            ucet1.vklad(-100);
            System.out.println(ucet1);
        }
        catch (MyException ex) {
            System.out.println(ex.getZprava());
        }
    }
    
}
