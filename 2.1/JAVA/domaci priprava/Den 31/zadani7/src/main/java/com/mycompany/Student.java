package com.mycompany;

public class Student {

    public String jmeno = "";
    public String prijmeni = "";
    public int id;

    public Student(String jmeno, String prijmeni, int id) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.id = id;
    }

    @Override
    public String toString() {
        return (
            "Zak se jmenuje " +
            this.jmeno +
            " " +
            this.prijmeni +
            " a jeho id je " +
            this.id
        );
    }
}
