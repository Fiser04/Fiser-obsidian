//Den 3
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;
/**
 *
 * @author fiser
 */
public class Matematika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(Math.PI); //pi (3.14...)
        //System.out.println(Math.E); //euerovo cislo, ci jak se to pise, proste dalsi konstanta
        
        double vysledek;
        vysledek = Math.pow(2, 3); //dva na treti
        System.out.println(vysledek);
        
        vysledek = Math.abs(-10); //absolutni hodnota
        System.out.println(vysledek);
        
        vysledek = Math.sqrt(9); //odmocnina z 9
        //vysledek = Math.pow(9, 0.5); //taky odmocnina ale jinak
        System.out.println(vysledek);
        
        vysledek = Math.round(8.832); //zaokrouhleni na int podle jak to dava smysl matematicky
        System.out.println(vysledek);
        
        vysledek = Math.ceil(4.012); //toto udela int z doublu ALE da ji nejvic co muze, takze zaokrouhleni ale jdes jen nahoru
        //4.000000001 -> 5; 4.9999999999 -> 5
        System.out.println(vysledek);
        
        vysledek = Math.floor(4.99999); //pravy opak ceilu, proste to hodi na nejmensi moznou
        System.out.println(vysledek);
        
        vysledek = Math.max(10, 20); //maximalni hodnota jednoho z dvou cisel
        System.out.println(vysledek);
        
        vysledek = Math.min(90, 73); //minimalni hodnota jednoho z dvou cisel
        System.out.println(vysledek);
        
        
    }
    
}
