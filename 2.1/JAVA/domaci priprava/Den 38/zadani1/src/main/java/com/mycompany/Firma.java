package com.mycompany;

import java.util.ArrayList;

public class Firma implements iFirma {

    ArrayList<Zamestnanec> zamestnanci;

    public Firma() {
        this.zamestnanci = new ArrayList<>();
    }

    public void pridatZamestnance(
        String jmeno,
        String prijmeni,
        String datum,
        double plat,
        Pozice pozice
    ) {
        this.zamestnanci.add(
            new Zamestnanec(jmeno, prijmeni, datum, plat, pozice)
        );
    }

    public void odebratZamestnance(
        String jmeno,
        String prijmeni,
        String datum,
        double plat,
        Pozice pozice,
        String typ
    ) {
        try {
            ArrayList<Zamestnanec> list = nalestZamestnance(
                jmeno,
                prijmeni,
                datum,
                plat,
                pozice,
                typ
            );
            for (Zamestnanec z : list) {
                this.zamestnanci.remove(z);
            }
        } catch (nullZamestnanec e) {
            System.out.println(e.getMessage());
        }
    }

    public void nalestZamestnanceProVypis(
        String jmeno,
        String prijmeni,
        String datum,
        Double plat,
        Pozice pozice,
        String typ
    ) {
        try {
            ArrayList<Zamestnanec> list = nalestZamestnance(
                jmeno,
                prijmeni,
                datum,
                plat,
                pozice,
                typ
            );
            for (Zamestnanec z : list) {
                System.out.println(z);
            }
        } catch (nullZamestnanec e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Zamestnanec> getZamestnanci() {
        return zamestnanci;
    }

    public void setZamestnanci(ArrayList<Zamestnanec> zamestnanci) {
        this.zamestnanci = zamestnanci;
    }

    public void zmenaPlatu(
        String jmeno,
        String prijmeni,
        String datum,
        double plat,
        Pozice pozice,
        double novyPlat
    ) {
        try {
            ArrayList<Zamestnanec> zamestnanec = nalestZamestnance(
                jmeno,
                prijmeni,
                datum,
                plat,
                pozice,
                "="
            );
            for (Zamestnanec z : zamestnanec) {
                this.zamestnanci.remove(z);
                pridatZamestnance(jmeno, prijmeni, datum, novyPlat, pozice);
            }
        } catch (nullZamestnanec e) {
            // TODO Auto-generated catch block
            System.out.print(e.getMessage());
        }
    }
}
