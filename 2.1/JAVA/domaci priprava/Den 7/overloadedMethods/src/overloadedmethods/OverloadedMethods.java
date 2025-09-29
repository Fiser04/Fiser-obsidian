//Den 7
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloadedmethods;

/**
 *
 * @author fiser
 */
public class OverloadedMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //vyuziti stejneho jmena methody pro vice method, ktere se lisi parametrama
        System.out.println(add(3, 2));
        System.out.println(add(3, 5, 6));
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

}
