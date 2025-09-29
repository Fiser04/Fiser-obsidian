//Den 22
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prvocisla;

/**
 *
 * @author fiser
 */
public class Prvocisla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cislo = 17;
        System.out.println(jePrvocislo(cislo));
    }

    public static boolean jePrvocislo(int cislo) {
        if (cislo == 1) {
            return false;
        }
        if (cislo == 2) {
            return true;
        }
        if ((cislo % 2) == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(cislo); i++) {
            if ((cislo % i) == 0) {
                return false;
            }

        }
        return true;
    }
}
