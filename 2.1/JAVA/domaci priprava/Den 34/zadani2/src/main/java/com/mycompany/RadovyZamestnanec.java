package com.mycompany;

public class RadovyZamestnanec extends Zamestnanec {

    int doba;

    public RadovyZamestnanec(
        String jmeno,
        String prijemni,
        int platZaDobu,
        int doba
    ) {
        this.plat = platZaDobu;
        this.doba = doba;
        this.jmeno = jmeno;
        this.prijmeni = prijemni;
    }

    @Override
    public int vypocetPlatu() {
        return plat * doba;
    }
}
