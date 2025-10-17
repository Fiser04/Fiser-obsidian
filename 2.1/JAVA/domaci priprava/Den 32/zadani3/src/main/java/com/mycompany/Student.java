package com.mycompany;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

    int rodneCislo = -1;
    String jmeno = "";
    String prijmeni = "";
    private static final long serialVersionUID = 1L;
    ArrayList<Integer> seznamZnamek = new ArrayList<Integer>();

    public Student(int rodneCislo, String jmeno, String prijmeni) {
        this.rodneCislo = rodneCislo;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public void pridatDoSeznamu(int znamka) {
        this.seznamZnamek.add(znamka);
    }

    @Override
    public String toString() {
        return this.jmeno + " " + this.prijmeni;
    }
}
