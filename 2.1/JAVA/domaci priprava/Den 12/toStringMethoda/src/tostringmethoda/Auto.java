/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tostringmethoda;

/**
 *
 * @author fiser
 */
public class Auto {

    String vyrobce;
    String model;
    int rok;
    String barva;

    public Auto(String vyrobce, String model, int rok, String barva) {
        this.vyrobce = vyrobce;
        this.model = model;
        this.rok = rok;
        this.barva = barva;
    }

    @Override
    public String toString() {
        return this.vyrobce + " " + this.model + " " + this.rok + " " + this.barva;
    }
}
