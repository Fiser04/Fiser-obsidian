package com.mycompany;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Sklad {

    ArrayList<Zbozi> zbozis = new ArrayList<Zbozi>();
    int min = 5;
    String jmenoSouboru = "sklad.dat";

    public void pridejZbozi(Zbozi zbozi) {
        this.zbozis.add(zbozi);
    }

    public void pridejZboziMnozstvi(String kodZbozi, int kolik) {
        for (Zbozi z : this.zbozis) {
            if (z.kod.equals(kodZbozi)) {
                z.pridejMnozstvi(kolik);
            }
        }
    }

    public void odeberZboziMnozstvi(String kodZbozi, int kolik) {
        Zbozi zboziKOdebrani = null;
        for (Zbozi z : this.zbozis) {
            if (z.kod.equals(kodZbozi)) {
                z.odeberMnozstvi(kolik);
                if (z.mnozstvi == 0) {
                    zboziKOdebrani = z;
                }
            }
        }
        this.zbozis.remove(zboziKOdebrani);
    }

    public void vyhledejZbozi(String kodZbozi) {
        for (Zbozi zbozi : zbozis) {
            if (zbozi.kod.equals(kodZbozi)) {
                System.out.println(zbozi);
            }
        }
    }

    public void vypisZboziPodLimitem() {
        for (Zbozi zbozi : zbozis) {
            if (zbozi.mnozstvi < this.min) {
                System.out.println(zbozi.nazev + " " + zbozi.mnozstvi);
            }
        }
    }

    public void ulozitSoubor() {
        try (
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(this.jmenoSouboru)
            )
        ) {
            oos.writeObject(zbozis);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("io kaput");
        }
    }

    @SuppressWarnings("unchecked")
    public void nacistSoubor() {
        try (
            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(this.jmenoSouboru)
            )
        ) {
            this.zbozis = (ArrayList<Zbozi>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("trida nenalezena");
        }
    }
}
