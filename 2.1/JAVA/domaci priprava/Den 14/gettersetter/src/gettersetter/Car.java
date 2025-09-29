/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gettersetter;

/**
 *
 * @author fiser
 */
public class Car {

    private String model;
    private String barva;
    private int cena;

    public Car(String model, String barva, int cena) {
        this.model = model;
        this.barva = barva;
        this.cena = cena;
    }

    public String getModel() {
        return model;
    }

    public String getBarva() {
        return barva;
    }

    public int getCena() {
        return cena;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    public void setCena(int cena) {
        if (cena > 0) {
            this.cena = cena;
        } else {
            System.out.println("moc malo");
        }
    }
}
