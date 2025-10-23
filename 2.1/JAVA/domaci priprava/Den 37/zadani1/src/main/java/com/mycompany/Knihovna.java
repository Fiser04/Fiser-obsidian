package com.mycompany;

// půjčovat knihy čtenářům, vracet knihy a vyhledávat v katalogu.

import java.util.ArrayList;

public class Knihovna {

    private ArrayList<Kniha> listKnih;
    private FileMan fileMan;

    public Knihovna(String nazevSouboru) {
        fileMan = new FileMan(nazevSouboru);
        this.listKnih = fileMan.nacist();
        isListNull();
    }

    public void novaKniha(String nazev, String autor, int rok) {
        this.listKnih.add(new Kniha(nazev, autor, rok));
    }

    public void pujcitKnihu(String nazevKnihy) {
        //kontrola zda nahodou uz si ji nekdo nepujcil, kdyz ne tak pujci
        Kniha kniha = najdiKnihu(nazevKnihy);
        if (kniha != null) {
            if (kniha.isZapujceno()) {
                System.out.println("Kniha je jiz zapujcena");
            } else {
                kniha.setZapujceno(true);
                System.out.println("Kniha vam byla zapujcena");
            }
        } else {
            System.out.println("Kniha nebyla nalezena");
        }
    }

    public void vratitKnihu(String nazevKnihy) {
        Kniha kniha = najdiKnihu(nazevKnihy);
        if (kniha != null) {
            if (kniha.isZapujceno()) {
                kniha.setZapujceno(false);
                System.out.println("Kniha byla vracena");
            } else {
                System.out.println("Kniha nebyla zapujcena");
            }
        } else {
            System.out.println("Kniha nebyla nalezena");
        }
    }

    private Kniha najdiKnihu(String nazev) {
        for (Kniha kniha : listKnih) {
            if (kniha.getNazev().equals(nazev)) {
                return kniha;
            }
        }
        return null;
    }

    public void najdiKnihuPodleNazvu(String nazev) {
        Kniha kniha = najdiKnihu(nazev);
        if (kniha != null) {
            System.out.println(kniha);
        } else {
            System.out.println("Nenalezeno");
        }
    }

    private void isListNull() {
        if (this.listKnih == null) {
            System.out.println(
                "Nacteni se nepovedlo, list knih je prazdny(pri prvnim pusteni ignoruj)"
            );
            this.listKnih = new ArrayList<Kniha>();
        } else {
            System.out.println("Nacteni dokonceno");
        }
    }

    public void ulozit() {
        this.fileMan.ulozit(this.listKnih);
        System.out.println("Ulozeni se povedlo");
    }
}
