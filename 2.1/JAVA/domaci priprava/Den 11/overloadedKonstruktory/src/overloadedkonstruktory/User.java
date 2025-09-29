/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloadedkonstruktory;

/**
 *
 * @author fiser
 */
public class User {

    String prezdivka;
    String email;
    int vek;

    public User(String prezdivka) {
        this.prezdivka = prezdivka;
        this.email = "neznamy";
        this.vek = -1;
    }

    public User(String prezdivka, String email) {
        this.prezdivka = prezdivka;
        this.email = email;
        this.vek = -1;
    }

    public User(String prezdivka, String email, int vek) {
        this.prezdivka = prezdivka;
        this.email = email;
        this.vek = vek;
    }

        public User(){
        this.prezdivka = "neznamy";
        this.email = "neznamy";
        this.vek = -1;
        }
    public void print() {
        System.out.println(prezdivka);
        System.out.println(email);
        System.out.println(vek);
    }

}
