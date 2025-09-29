/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poleobjektu;

/**
 *
 * @author fiser
 */
public class auto {

    String model;
    String barva;

    public auto(String model, String barva) {
        this.model = model;
        this.barva = barva;
    }

    public void ridit() {
        System.out.println("Prave ridis " + barva + " " + model);
    }
}
