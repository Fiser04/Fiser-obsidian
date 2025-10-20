package com.mycompany;

public class Manager extends Zamestnanec {

    int bonus;

    public Manager(String jmeno, String prijemni, int plat, int bonus) {
        this.plat = plat;
        this.bonus = bonus;
        this.jmeno = jmeno;
        this.prijmeni = prijemni;
    }

    @Override
    public int vypocetPlatu() {
        return plat + bonus;
    }
}
