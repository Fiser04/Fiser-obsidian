package com.mycompany;

import java.util.ArrayList;

public interface iFirma {
    ArrayList<Zamestnanec> getZamestnanci();

    default ArrayList<Zamestnanec> nalestZamestnance(
        String jmeno,
        String prijmeni,
        String datum,
        Double plat,
        Pozice pozice,
        String typ
    ) throws nullZamestnanec {
        ArrayList<Zamestnanec> nalezeni = new ArrayList<>();
        for (Zamestnanec z : this.getZamestnanci()) {
            if (
                ((z.getJmeno().equals(jmeno) &&
                        z.getPrijmeni().equals(prijmeni)) ||
                    z.getPozice().equals(pozice) ||
                    z.getMesicniPlat() == plat) &&
                typ.equals("=")
            ) {
                nalezeni.add(z);
            } else if (
                ((z.getJmeno().equals(jmeno) &&
                        z.getPrijmeni().equals(prijmeni)) ||
                    z.getPozice().equals(pozice) ||
                    z.getMesicniPlat() < plat) &&
                typ.equals(">")
            ) {
                nalezeni.add(z);
            } else if (
                ((z.getJmeno().equals(jmeno) &&
                        z.getPrijmeni().equals(prijmeni)) ||
                    z.getPozice().equals(pozice) ||
                    z.getMesicniPlat() > plat) &&
                typ.equals("<")
            ) {
                nalezeni.add(z);
            } else {}
        }

        if (nalezeni.isEmpty()) {
            throw new nullZamestnanec("Nenalezen");
        } else {
            return nalezeni;
        }
    }
}
