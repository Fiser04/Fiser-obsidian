//Den 14
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kompozice;

/**
 *
 * @author fiser
 */
public class Kompozice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //kompozice je castecne mysleno jako agregace, ALE, u agregace muze kazdy dil existovat samostatne, ale kompozice
        //je to dil neceho
        //agragace = knihovna ma knihy, musi byt kniha v knihovne? ne
        //kompozice = dil auta je nadrz, musi mit auto nadrz? ano, jinak nepojede (kdyz nebudu pocitat elektrochuje)
        
        Auto auto = new Auto("ovce", 2002, "1.9 tdi");
        
        System.out.println(auto.getModel());
        System.out.println(auto.getRocnik());
        System.out.println(auto.getMotor().getTyp());
        
        auto.start();
    }
    
}
