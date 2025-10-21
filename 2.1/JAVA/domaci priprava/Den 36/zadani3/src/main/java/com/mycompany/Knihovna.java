package com.mycompany;

import java.util.ArrayList;

public class Knihovna {

    ArrayList<Kniha> knihy = new ArrayList<>();

    public void vytvorKnihu(Kniha kniha) {
        this.knihy.add(kniha);
    }

    public void vypujcitKnihu(Kniha kniha) {
        kniha.vypujcit();
    }

    public void vratit(Kniha kniha) {
        kniha.vratit();
    }

    public String vyhledejKnihuPodleAutora(String autor) {
        String nalezene = "";
        for (Kniha kniha : knihy) {
            if (kniha.getAutor().equals(autor)) {
                nalezene += kniha.toString() + "\n";
            }
        }
        if (naleznuto(nalezene)) {
            return nalezene;
        } else {
            return "Nenalezeno";
        }
    }

    public String vypsatVsechnyVypujceneKnihy() {
        String nalezeno = "";
        for (Kniha kniha : knihy) {
            if (kniha.isJeVypujcena()) {
                nalezeno += kniha.toString() + "\n";
            }
        }
        if (naleznuto(nalezeno)) {
            return nalezeno;
        } else {
            return "Nenalezeno";
        }
    }

    public String vypsatKnihyVydanePo(int rok) {
        String nalezeno = "";
        for (Kniha kniha : knihy) {
            if (kniha.getRokVydani() >= rok) {
                nalezeno += kniha.toString() + "\n";
            }
        }
        if (naleznuto(nalezeno)) {
            return nalezeno;
        } else {
            return "Nenalezeno";
        }
    }

    private boolean naleznuto(String nalezeno) {
        if (!nalezeno.equals("")) {
            return true;
        } else {
            return false;
        }
    }
}
