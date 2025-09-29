/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrakce;

/**
 *
 * @author fiser
 */
public class Ctyruhelnik extends Tvar {

    double sirka;
    double vyska;

    public Ctyruhelnik(double sirka, double vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    @Override
    double area() {
        return sirka * vyska;
    }

}
