/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auto;

import java.util.Objects;

/**
 *
 * @author fiser
 */
public abstract class MotoroveVozidlo extends Vozidlo{
    private Motor motor;

    public MotoroveVozidlo(Motor motor, String nazev, String znacka, Pneu[] pneu) {
        super(nazev, znacka, pneu);
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.motor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MotoroveVozidlo other = (MotoroveVozidlo) obj;
        return Objects.equals(this.motor, other.motor);
    }

    @Override
    public String toString() {
        return "MotoroveVozidlo{" + "motor=" + motor + '}' + " " +super.toString();
    }
    
    
}
