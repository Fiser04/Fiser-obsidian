/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fiser
 */
package objekty;
public class auto {
    String vyrobce = "Ford";
    String model = "Fusion";
    int rocnik = 2005;
    double cena = 69999.99;
    boolean muzeDoProvozu = true;
    boolean maTechnickou = true;
    
    void dalTechnickou(){
        maTechnickou = true;
        muzeDoProvozu = true;
        System.out.println("auto ma technickou");
    }
    
    void nedalTechnickou(){
    maTechnickou = false;
    muzeDoProvozu = false;
        System.out.println("auto nema technickou");
    
    }
}
