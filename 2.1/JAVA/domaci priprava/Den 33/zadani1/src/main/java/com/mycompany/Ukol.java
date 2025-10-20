package com.mycompany;

public class Ukol {

    boolean splneno;
    String popis;
    Priorita priorita;

    public Ukol(String popis, Priorita priorita) {
        this.popis = popis;
        this.priorita = priorita;
        this.splneno = false;
    }

    public Ukol(String popis, Priorita priorita, boolean splneno) {
        this.popis = popis;
        this.priorita = priorita;
        this.splneno = splneno;
    }

    public boolean isSplneno() {
        return splneno;
    }

    public String getPopis() {
        return popis;
    }

    public Priorita getPriorita() {
        return priorita;
    }

    public void setSplneno(boolean splneno) {
        this.splneno = splneno;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public void setPriorita(Priorita priorita) {
        this.priorita = priorita;
    }

    @Override
    public String toString() {
        return "Popis: " + this.popis + "\nPriorita: " + this.priorita;
    }
}
