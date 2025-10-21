package com.mycompany;

public class VysledkyTestu {

    int[] vysledekTestu;
    Zak zak;

    public VysledkyTestu(int[] vysledky, Zak zak) {
        this.vysledekTestu = vysledky;
        this.zak = zak;
    }

    public int nejlepsiVysledek() {
        int nejlepsi = this.vysledekTestu[0];
        for (int i = 0; i < this.vysledekTestu.length; i++) {
            if (nejlepsi < this.vysledekTestu[i]) {
                nejlepsi = this.vysledekTestu[i];
            }
        }
        return nejlepsi;
    }

    public double prumer() {
        int soucet = 0;
        for (int i = 0; i < vysledekTestu.length; i++) {
            soucet += vysledekTestu[i];
        }
        return soucet / vysledekTestu.length;
    }

    public boolean prospel() {
        if (nejlepsiVysledek() >= 50) {
            return true;
        } else {
            return false;
        }
    }

    public boolean jePolePlne() {
        if (this.vysledekTestu.length == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return (
            "Zak " +
            this.zak.getJmeno() +
            " " +
            this.zak.getPrijmeni() +
            " prospel s nejlepsim testem " +
            nejlepsiVysledek()
        );
    }

    public int[] getVysledekTestu() {
        return vysledekTestu;
    }

    public void setVysledekTestu(int[] vysledekTestu) {
        this.vysledekTestu = vysledekTestu;
    }

    public Zak getZak() {
        return zak;
    }

    public void setZak(Zak zak) {
        this.zak = zak;
    }
}
