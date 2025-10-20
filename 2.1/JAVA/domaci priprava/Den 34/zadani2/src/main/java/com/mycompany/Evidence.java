package com.mycompany;

import java.util.ArrayList;

public class Evidence {

    ArrayList<Zamestnanec> listZamestnancu = new ArrayList<Zamestnanec>();

    public void pridejZamestnance(
        String jmeno,
        String prijmeni,
        int mod,
        int plat,
        int dobobonus
    ) {
        if (mod == 1) {
            this.listZamestnancu.add(
                new Manager(jmeno, prijmeni, plat, dobobonus)
            );
        } else if (mod == 2) {
            this.listZamestnancu.add(
                new RadovyZamestnanec(jmeno, prijmeni, plat, dobobonus)
            );
        } else {
            System.out.println("Neznamy mod");
        }
    }

    public void vypocitatMesicniPlat() {
        for (Zamestnanec z : listZamestnancu) {
            System.out.println(
                z.getJmeno() + " " + z.getPrijmeni() + " " + z.vypocetPlatu()
            );
        }
    }

    public void vypocetNaklady() {
        int naklady = 0;
        for (Zamestnanec z : listZamestnancu) {
            naklady += z.vypocetPlatu();
        }
        System.out.println(naklady);
    }
}
