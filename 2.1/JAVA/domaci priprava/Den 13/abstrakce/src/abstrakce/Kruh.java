/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrakce;

/**
 *
 * @author fiser
 */
public class Kruh extends Tvar {

    double prumer;

    public Kruh(double prumer) {
        this.prumer = prumer;
    }

    @Override
    double area() {
        return Math.PI * prumer * prumer;
    }
}
