/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kompozice;

/**
 *
 * @author fiser
 */
public class Auto {
    private String model;
    private int rocnik;
    private Motor motor;

    public Auto(String model, int rocnik, String typMotoru) {
        this.model = model;
        this.rocnik = rocnik;
        this.motor = new Motor(typMotoru);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRocnik() {
        return rocnik;
    }

    public void setRocnik(int rocnik) {
        this.rocnik = rocnik;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    void start(){
        motor.start();
    }
}
