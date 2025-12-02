/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package knihovna;

/**
 *
 * @author fiser
 */
public class Book extends Prints{
   private String ibpm;

    public Book(String name, String autor, String ibpm) {
        super(name, autor);
        this.ibpm = ibpm.toLowerCase();
    }

    public String getIbpm() {
        return ibpm;
    }

    public void setIbpm(String ibpm) {
        this.ibpm = ibpm;
    }

    @Override
    public String toString() {
        return this.name + " " + this.autor + " " + this.ibpm + " "+this.isBorrowed;
    }
   
}
