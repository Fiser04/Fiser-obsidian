/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kolekcezk;

/**
 *
 * @author fiser
 */
public class Dort implements Comparable<Dort>{
    private String _nazev;
    private double _cena;

    public Dort(String _nazev, double _cena) {
        this._nazev = _nazev;
        this._cena = _cena;
    }

    public String getNazev() {
        return _nazev;
    }

    public void setNazev(String _nazev) {
        this._nazev = _nazev;
    }

    public double getCena() {
        return _cena;
    }

    public void setCena(double _cena) {
        this._cena = _cena;
    }

    @Override
    public String toString() {
        return "Dort{" + "_nazev=" + _nazev + ", _cena=" + _cena + '}';
    }

    @Override
    public int compareTo(Dort o) {
        return (o.getNazev().compareTo(_nazev));
    }
    
    
}
