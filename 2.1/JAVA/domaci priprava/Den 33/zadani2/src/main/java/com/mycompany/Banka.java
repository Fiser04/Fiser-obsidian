package com.mycompany;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Banka {

    ArrayList<Ucet> listUctu = new ArrayList<Ucet>();
    String nazevSouboru = "ucty.dat";

    public Banka() {
        try {
            nacitac();
        } finally {
            System.out.println("Nacitani dokonceno");
        }
    }

    public void pridejNaUcet(Ucet ucet, double castka) {
        ucet.pridat(castka);
    }

    public void vyberZUctu(Ucet ucet, double castka) {
        ucet.odebrat(castka);
    }

    public void pridatUcet(Ucet ucet) {
        this.listUctu.add(ucet);
    }

    public Ucet vyhledatUcet(int cisloUctu) {
        for (Ucet ucet : listUctu) {
            if (ucet.getCisloUctu() == cisloUctu) {
                return ucet;
            }
        }
        return null;
    }

    public void vypisVsechUctu() {
        for (Ucet ucet : listUctu) {
            System.out.println(ucet);
        }
    }

    public void nacitac() {
        try (
            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(this.nazevSouboru)
            )
        ) {
            this.listUctu = (ArrayList<Ucet>) ois.readObject();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void ukladani() {
        try (
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(this.nazevSouboru)
            )
        ) {
            oos.writeObject(this.listUctu);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
