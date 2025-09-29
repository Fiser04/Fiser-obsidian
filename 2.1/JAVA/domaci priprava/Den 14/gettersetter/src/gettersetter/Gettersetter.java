//Den 14
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gettersetter;

/**
 *
 * @author fiser
 */
public class Gettersetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // misto toho abych pristupoval primo hodnotu tridy tak ji mohu dat private a resit to pres getter a setter, hlavne kvuli bezpecnosti
        //getter precte
        //setter zapise
        
        Car car = new Car("fabie", "cervena", 20000);
        car.setBarva("modra");
        car.setCena(-90);
        System.out.println(car.getModel() + " " + car.getBarva() + " " + car.getCena());
    }
    
}
