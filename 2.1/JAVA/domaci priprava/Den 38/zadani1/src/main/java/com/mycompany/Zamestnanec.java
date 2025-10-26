package com.mycompany;

public class Zamestnanec {

    final String jmeno, prijmeni;
    Pozice pozice;
    Double mesicniPlat;
    final String datumNastupu; //pro jednoduchost davam string, pri finalni uprave dat DATE a formatovat

    public Zamestnanec(
        String jmeno,
        String prijmeni,
        String datumNastupu,
        double mesicniPlat,
        Pozice pozice
    ) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.mesicniPlat = mesicniPlat;
        this.pozice = pozice;
        this.datumNastupu = datumNastupu;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public Pozice getPozice() {
        return pozice;
    }

    public void setPozice(Pozice pozice) {
        this.pozice = pozice;
    }

    public double getMesicniPlat() {
        return mesicniPlat;
    }

    public void setMesicniPlat(double mesicniPlat) {
        this.mesicniPlat = mesicniPlat;
    }

    public String getDatumNastupu() {
        return datumNastupu;
    }

    @Override
    public String toString() {
        return (
            "Jmeno: " +
            this.jmeno +
            " " +
            this.prijmeni +
            ", Pozice: " +
            this.pozice +
            ", Plat: " +
            this.mesicniPlat +
            ", Nastoupil/la: " +
            this.datumNastupu
        );
    }
}
