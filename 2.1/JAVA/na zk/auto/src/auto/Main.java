/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auto;

/**
 *
 * @author fiser
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Obchod obchod = new Obchod();

        obchod.pridejAuto(new Karoserie("modra", KaroserieTyp.HATCHBACK), new Motor(1400, 59, 100, 100, 100), "fusion", "ford", new Pneu[]{new Pneu(0, 0, PneuType.LETNI), new Pneu(10, 10, PneuType.ZIMNI)}, 10000);
        
        obchod.zobrazNabidku();
    }

}
