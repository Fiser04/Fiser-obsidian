package com.mycompany;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Evidence {

    ArrayList<Student> listStudentu = new ArrayList<Student>();
    double maxPrumer = 2.5;
    String nazevSouboru = "evidence.dat";

    public void pridejStudenta(Student student) {
        this.listStudentu.add(student);
    }

    public void pridejZnamku(int rodneCislo, int znamka) {
        for (Student s : listStudentu) {
            if (s.rodneCislo == rodneCislo) {
                s.pridatDoSeznamu(znamka);
            }
        }
    }

    public double prumerZaka(int rodneCislo) {
        for (Student s : listStudentu) {
            if (s.rodneCislo == rodneCislo) {
                double pocet = 0;
                int soucet = 0;
                for (int cislo : s.seznamZnamek) {
                    pocet++;
                    soucet += cislo;
                }
                return soucet / pocet;
            }
        }
        return -1.0;
    }

    public void najitStudenty() {
        double prumer = 0;
        for (Student s : listStudentu) {
            if ((prumer = prumerZaka(s.rodneCislo)) > this.maxPrumer) {
                System.out.println(s + ": " + prumer);
            }
        }
    }

    public void ulozitDoSouboru() {
        try (
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(this.nazevSouboru)
            )
        ) {
            oos.writeObject(listStudentu);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void nacistZSouboru() {
        try (
            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(this.nazevSouboru)
            )
        ) {
            this.listStudentu = (ArrayList<Student>) ois.readObject();
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
}
