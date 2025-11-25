package com.mycompany;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        int[] pole = { 10, 3, 4, 7, 2, 6, 7, 9 };
        scitac jes = new scitac(pole);
        int lichy = jes.scitacka()[0];
        int sudy = jes.scitacka()[1];
        System.out.println(lichy);
        System.out.println(sudy);
    }
}
