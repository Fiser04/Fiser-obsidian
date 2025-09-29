/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregace;

/**
 *
 * @author fiser
 */
public class Kniha {

    private String nazev;
    private int pocetStran;

    public Kniha(String nazev, int pocetStran) {
        this.nazev = nazev;
        this.pocetStran = pocetStran;
    }
    
    public String ukazInfo(){
        return nazev + " ma " + pocetStran + " stran";
    }
    
    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

}
