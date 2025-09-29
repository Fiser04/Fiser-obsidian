/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrakce;

/**
 *
 * @author fiser
 */
public class Trojuhelnik extends Tvar {

    double vyska;
    double zakladna;

    Trojuhelnik(double vyska, double zakladna) {
        this.vyska = vyska;
        this.zakladna = zakladna;
    }

    @Override
    double area() {
        return 0.5 * zakladna * vyska;
    }
}
