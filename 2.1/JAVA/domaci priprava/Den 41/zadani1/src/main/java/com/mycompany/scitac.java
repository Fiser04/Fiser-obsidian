package com.mycompany;

public class scitac {

    private int[] pole;

    public scitac(int[] pole) {
        this.pole = pole;
    }

    public int[] scitacka() {
        int soucetSud = 0;
        int soucetLich = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] % 2 == 0) {
                soucetSud += pole[i];
            } else {
                soucetLich += pole[i];
            }
        }
        return new int[] { soucetLich, soucetSud };
    }
}
