/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infostudent;

/**
 *
 * @author fiser
 */
public class Student {

    String jmeno;
    String obor;
    int rocnik;

    public Student(String jmeno, String obor, int rocnik) {
        this.jmeno = jmeno;
        this.obor = obor;
        this.rocnik = rocnik;
    }

    @Override
    public String toString() {
        return "Student " + this.jmeno + " studuje " + obor + " a je prave v " + rocnik + ". rocniku.";
    }
}
