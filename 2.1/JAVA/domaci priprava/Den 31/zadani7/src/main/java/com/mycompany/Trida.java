package com.mycompany;

import java.util.ArrayList;

public class Trida {

    public String jmeno = "";
    public ArrayList<Student> list = new ArrayList<Student>();

    public Trida(String jmeno) {
        this.jmeno = jmeno;
    }

    public void pridejStudenta(Student student) {
        this.list.add(student);
    }

    public void vypisStudentu() {
        for (Student student : this.list) {
            System.out.println(student);
        }
    }

    public void vymazStudenta(int ida) {
        int nalezeneId = -1;
        for (Student s : this.list) {
            if (s.id == ida) {
                nalezeneId = this.list.indexOf(s);
            }
        }
        this.list.remove(nalezeneId);
    }
}
