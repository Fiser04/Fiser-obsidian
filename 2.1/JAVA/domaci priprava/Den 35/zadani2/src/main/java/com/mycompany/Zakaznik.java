package com.mycompany;

import java.io.Serializable;

public class Zakaznik implements Serializable {

    String jmeno;
    String prijmeni;
    String adresa; //jo je to docela prasarna nechavat adresu jako jednu promenou protoze to neni atomicke
    private static final long serialVersionUID = 1L;

    public Zakaznik(String jmeno, String prijmeni, String adresa) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.adresa = adresa;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni;
    }
}
