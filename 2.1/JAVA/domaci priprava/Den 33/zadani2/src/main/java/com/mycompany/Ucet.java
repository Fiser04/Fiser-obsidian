package com.mycompany;

import java.io.Serializable;

public class Ucet implements Serializable {

    String jmeno;
    String prijmeni;
    int cisloUctu;
    double zustatek = 0;
    public static final long serialVersionUID = 1L;

    public Ucet(String jmeno, String prijmeni, int cisloUctu) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.cisloUctu = cisloUctu;
    }

    public void pridat(double kolik) {
        if (kolik > 0) {
            this.zustatek += kolik;
        } else {
            System.out.println("Pridat lze jen nezaporna hodnota");
        }
    }

    public void odebrat(double kolik) {
        if ((this.zustatek - kolik) > 0) {
            this.zustatek -= kolik;
        } else {
            System.out.println("Nelze jit do zaporu");
        }
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getCisloUctu() {
        return cisloUctu;
    }

    public double getZustatek() {
        return zustatek;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setCisloUctu(int cisloUctu) {
        this.cisloUctu = cisloUctu;
    }

    public void setZustatek(double zustatek) {
        this.zustatek = zustatek;
    }

    @Override
    public String toString() {
        return (
            "Jmeno: " +
            this.jmeno +
            "\nPrijmeni: " +
            this.prijmeni +
            "\nCislo uctu: " +
            this.cisloUctu +
            "\nZustatek: " +
            this.zustatek
        );
    }
}
