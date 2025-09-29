/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrakce;

/**
 *
 * @author fiser
 */
public abstract class Tvar { //tudiz nevytvorim tridu Tvar
    
    
    abstract double area(); //abstraktni metoda (musim overidnout u vsech potomku nebo je dat jako abstraktni taky)
    
    
    void display(){ //concrete metoda
        System.out.println("This is a shape");
    }
}
