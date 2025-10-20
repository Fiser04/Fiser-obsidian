package com.mycompany;

import java.io.Serializable;

public class RadkaUctenky implements Serializable {

    Zbozi zbozi;
    int pocetKusu;
    private static final long serialVersionUID = 1L;

    public RadkaUctenky(Zbozi zbozi, int pocet) {
        this.zbozi = zbozi;
        this.pocetKusu = pocet;
    }

    public Zbozi getZbozi() {
        return zbozi;
    }

    public void setZbozi(Zbozi zbozi) {
        this.zbozi = zbozi;
    }

    public int getPocetKusu() {
        return pocetKusu;
    }

    public void setPocetKusu(int pocetKusu) {
        this.pocetKusu = pocetKusu;
    }

    @Override
    public String toString() {
        return this.zbozi + " " + this.pocetKusu + "x";
    }
}
