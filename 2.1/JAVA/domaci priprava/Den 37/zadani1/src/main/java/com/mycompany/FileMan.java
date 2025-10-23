package com.mycompany;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.classfile.instruction.ArrayLoadInstruction;
import java.util.ArrayList;

public class FileMan {

    private String nazevSouboru;

    public FileMan(String nazev) {
        this.nazevSouboru = nazev;
    }

    public void ulozit(ArrayList<Kniha> list) {
        try (
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(this.nazevSouboru)
            )
        ) {
            oos.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Kniha> nacist() {
        try (
            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(this.nazevSouboru)
            )
        ) {
            ArrayList<Kniha> kniha = (ArrayList<Kniha>) ois.readObject();
            return kniha;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
