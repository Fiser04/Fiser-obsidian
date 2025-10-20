package com.mycompany;

import java.io.Serializable;
import java.util.ArrayList;

public class Objednavka implements Serializable {

    int id;
    Zakaznik zakaznik;
    ArrayList<RadkaUctenky> objednavka = new ArrayList<RadkaUctenky>();
    private static final long serialVersionUID = 1L;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Zakaznik getZakaznik() {
        return zakaznik;
    }

    public void setZakaznik(Zakaznik zakaznik) {
        this.zakaznik = zakaznik;
    }

    public ArrayList<RadkaUctenky> getObjednavka() {
        return objednavka;
    }

    public void setObjednavka(ArrayList<RadkaUctenky> objednavka) {
        this.objednavka = objednavka;
    }

    public Objednavka(int id, Zakaznik zakaznik) {
        this.zakaznik = zakaznik;
        this.id = id;
    }

    public void pridejPolozku(Zbozi zbozi, int pocetKusu) {
        this.objednavka.add(new RadkaUctenky(zbozi, pocetKusu));
    }

    public double spocitatCenuCelku() {
        double celkovaCastka = 0;
        for (RadkaUctenky radkaUctenky : objednavka) {
            celkovaCastka +=
                radkaUctenky.getPocetKusu() * radkaUctenky.getZbozi().getCena();
        }
        return celkovaCastka;
    }

    @Override
    public String toString() {
        return (
            "ID: " +
            id +
            ", Zakaznik: " +
            zakaznik +
            ", Objednal: " +
            objednavka
        );
    }
}
