/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jes;

/**
 *
 * @author fiser
 */
public class ArrayUtils {

    public static <T extends Comparable<T>> int[] delej(T[] pole) {

        if (pole == null || pole.length == 0) {
            return new int[]{0, 0};
        }
        int pocetPrvku = pole.length;
        int pocetprvkuMensi = 0;

        for (T cislo : pole) {
            int a = cislo.compareTo(pole[pole.length - 1]);
            if (a < 0) {
                pocetprvkuMensi++;
            }
        }

        return new int[]{pocetPrvku, pocetprvkuMensi};

    }

}
