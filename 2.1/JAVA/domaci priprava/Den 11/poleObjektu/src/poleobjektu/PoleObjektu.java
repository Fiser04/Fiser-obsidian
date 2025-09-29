/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poleobjektu;

/**
 *
 * @author fiser
 */
public class PoleObjektu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        auto auto1 = new auto("Civic", "stribrny");
        auto auto2 = new auto("Fabie", "cerveny");
        auto auto3 = new auto("Fusion", "modry");
        auto[] auta = {auto1, auto2, auto3};
        //stejny jako
        auto[] auticka = {
            new auto("Civic", "stribrny"),
            new auto("Fabie", "cerveny"), 
            new auto("Fusion", "modry")
        };
        
        
        
        for(auto autoa : auta){
            autoa.ridit();
        }
    }
    
}
