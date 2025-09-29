/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kompozice;

/**
 *
 * @author fiser
 */
public class Motor {
    private String typ;

    public Motor(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    void start(){
        System.out.println(typ + " byl zazehnut");
    }
    
}
