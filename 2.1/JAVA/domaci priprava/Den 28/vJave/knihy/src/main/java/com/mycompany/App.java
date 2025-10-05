package com.mycompany;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Regal regal1 = new Regal("regal 1");
        Regal regal2 = new Regal("regal 2");

        for (int i = 0; i < 5; i++) {
            regal1.PridatKnihuDoRegalu("kniha" + String.valueOf(i));
            regal2.PridatKnihuDoRegalu("knizka" + String.valueOf(5 - i));
        }
        ArrayList<Regal> regals = new ArrayList<Regal>();
        regals.add(regal1);
        regals.add(regal2);

        for (Regal r : regals) {
            r.VypsatKnihy();
        }
    }
}
