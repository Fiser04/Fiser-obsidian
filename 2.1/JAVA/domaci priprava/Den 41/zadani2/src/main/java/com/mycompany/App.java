package com.mycompany;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        int[][] poleH = { { 30, 20, 40, 50 }, { 50, 30, 20, 100 }, { 20, 30 } };
        int min = 1;
        if (poleH[0].length > poleH[1].length) {
            min = poleH[1].length;
        } else {
            min = poleH[0].length;
        }
        int[] vyslednePole = new int[min];
        int index = 0;
        int[] pole1 = poleH[0];

        for (int i = 0; i < poleH[0].length; i++) {
            int hodnota = poleH[0][i];
        }

        for (int i = 0; i < index; i++) {
            System.out.println(vyslednePole[i]);
        }
    }
}
