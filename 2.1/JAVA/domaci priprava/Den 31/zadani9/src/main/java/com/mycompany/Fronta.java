package com.mycompany;

import java.util.LinkedList;
import java.util.Queue;

public class Fronta {

    public Queue<Zakaznik> frontaZakazniku = new LinkedList<Zakaznik>();

    public void pridatDoFronty(Zakaznik zakaznik) {
        frontaZakazniku.add(zakaznik);
    }

    public void odeberZfronty() {
        frontaZakazniku.poll();
    }

    public void zobrazFrontu() {
        for (Zakaznik z : frontaZakazniku) {
            System.out.println(z.jmeno);
        }
    }
}
