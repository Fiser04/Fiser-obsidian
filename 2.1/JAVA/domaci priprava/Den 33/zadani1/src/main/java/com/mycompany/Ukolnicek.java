package com.mycompany;

import java.util.ArrayList;
import java.util.Comparator;

public class Ukolnicek {

    ArrayList<Ukol> listUkolu = new ArrayList<Ukol>();

    public void setListUkolu(ArrayList<Ukol> listUkolu) {
        this.listUkolu = listUkolu;
    }

    public ArrayList<Ukol> getListUkolu() {
        return listUkolu;
    }

    public void addUkol(Ukol ukol) {
        this.listUkolu.add(ukol);
    }

    public void setSplneno(String popis) {
        for (Ukol ukol : this.listUkolu) {
            if (ukol.popis.equals(popis)) {
                ukol.setSplneno(true);
            }
        }
    }

    public void showNesplnene() {
        ArrayList<Ukol> nespleneList = new ArrayList<Ukol>();
        for (Ukol ukol : this.listUkolu) {
            if (!ukol.isSplneno()) {
                nespleneList.add(ukol);
            }
        }
        nespleneList.sort(Comparator.comparing(Ukol::getPriorita));
        for (Ukol ukol : nespleneList) {
            System.out.println(ukol);
        }
    }
}
