//Den 13
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polyformysmus;

/**
 *
 * @author fiser
 */
public class Polyformysmus {

    public static void main(String[] args) {
        /*
        Polymorphism =
            POLY = hodne
            MORPH = tvar/moznost
            object se muze identifikovat jako jiny object
        */
        Auto auto = new Auto();
        Kolo kolo = new Kolo();
        Lod lod = new Lod();
        
        //ted chci udelat pole techto trid, ale protoze nejsou stejny typ tak se musi jinak postupovat
        //tudiz pouziju jejich rodice
        Vozidlo[] vozidlo = {auto, kolo, lod};
        
        for(Vozidlo v : vozidlo){
            v.go();
        }
        
    }
    
}
