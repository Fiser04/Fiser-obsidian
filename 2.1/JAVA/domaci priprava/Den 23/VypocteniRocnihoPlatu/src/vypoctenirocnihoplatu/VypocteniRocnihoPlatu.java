//Den 23
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vypoctenirocnihoplatu;

/**
 *
 * @author fiser
 */
public class VypocteniRocnihoPlatu {
    public static void main(String[] args) {
        Zamestnanec zamestnanec = new Zamestnanec("prodavac", 24000, "Franta", "Lala", 2000);
        System.out.println(zamestnanec.vypocetRocniho());
    }
    
}
