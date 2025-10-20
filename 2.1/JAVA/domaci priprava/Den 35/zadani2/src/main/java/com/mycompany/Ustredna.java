package com.mycompany;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ustredna {

    ArrayList<Objednavka> objednavky = new ArrayList<>();
    String nazevSouboru = "objednavky.dat";

    public Ustredna() {
        nacistSoubor();
    }

    public void pridatObjednavku(Objednavka objednavka) {
        this.objednavky.add(objednavka);
    }

    public void vypisObjednavkyJednoho(String jmeno, String prijmeni) {
        for (Objednavka objednavka : objednavky) {
            if (
                objednavka.getZakaznik().getJmeno().equals(jmeno) &&
                objednavka.getZakaznik().getPrijmeni().equals(prijmeni)
            ) {
                System.out.println(objednavka);
            }
        }
    }

    public void ulozitDoSouboru() {
        try (
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(this.nazevSouboru)
            )
        ) {
            oos.writeObject(this.objednavky);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void nacistSoubor() {
        try (
            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(this.nazevSouboru)
            )
        ) {
            this.objednavky = (ArrayList<Objednavka>) ois.readObject();
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

    public ArrayList<Objednavka> getObjednavky() {
        return objednavky;
    }

    public void setObjednavky(ArrayList<Objednavka> objednavky) {
        this.objednavky = objednavky;
    }

    public String getNazevSouboru() {
        return nazevSouboru;
    }

    public void setNazevSouboru(String nazevSouboru) {
        this.nazevSouboru = nazevSouboru;
    }
}
