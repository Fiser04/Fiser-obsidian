/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vypoctenirocnihoplatu;

/**
 *
 * @author fiser
 */
public class Zamestnanec extends Osoba{
    String pozice;
    int mesicniPlat;

    public Zamestnanec(String pozice, int mesicniPlat, String jmeno, String prijmeni, int rokNarozeni) {
        super(jmeno, prijmeni, rokNarozeni);
        this.pozice = pozice;
        this.mesicniPlat = mesicniPlat;
    }
    
    public int vypocetRocniho(){
        return this.mesicniPlat * 12;
    
    }
    
    
    
}
