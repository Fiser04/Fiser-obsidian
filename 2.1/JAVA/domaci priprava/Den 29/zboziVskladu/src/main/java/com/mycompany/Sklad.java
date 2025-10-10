package com.mycompany;

import java.util.ArrayList;

public class Sklad {

    String name;
    public ArrayList<Zbozi> listZbozi = new ArrayList<Zbozi>();

    public Sklad(String name) {
        this.name = name;
    }

    public void addToSklad(Zbozi noveZbozi) {
        for (Zbozi zbozi : this.listZbozi) {
            if (zbozi.id == noveZbozi.id) {
                System.out.println("toto Id jiz existuje");
                return;
            }
        }
        listZbozi.add(noveZbozi);
    }

    public void removeFromSklad(Zbozi stareZbozi) {
        for (Zbozi zbozi : this.listZbozi) {
            if (zbozi.id == stareZbozi.id) {
                listZbozi.remove(zbozi);
                return;
            }
        }
    }

    public Zbozi searchZbozi(Integer id, String name) {
        for (Zbozi zbozi : this.listZbozi) {
            if ((id == zbozi.id) || (name.equals(zbozi.name))) {
                return zbozi;
            }
        }
        return new Zbozi(-1, "nenalezeno", "", "", "");
    }

    public void vypisZboziPodleDruhu() {
        ArrayList<String> listdruhu = new ArrayList<>();
        ArrayList<Integer> pocetzbozivdruhu = new ArrayList<>();
        for (Zbozi zbozi : this.listZbozi) {
            String currentType = zbozi.type;
            int index = listdruhu.indexOf(currentType);
            if (index != -1) {
                int currentCount = pocetzbozivdruhu.get(index);
                pocetzbozivdruhu.set(index, currentCount + 1);
            } else {
                listdruhu.add(currentType);
                pocetzbozivdruhu.add(1);
            }
        }
        for (int i = 0; i < listdruhu.size(); i++) {
            System.out.println(
                listdruhu.get(i) + ": " + pocetzbozivdruhu.get(i)
            );
        }
    }
}
