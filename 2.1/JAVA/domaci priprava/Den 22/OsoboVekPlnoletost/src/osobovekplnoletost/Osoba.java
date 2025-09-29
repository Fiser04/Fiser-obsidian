/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osobovekplnoletost;

/**
 *
 * @author fiser
 */
public class Osoba {
    String jmeno;
    int vek;

    public Osoba(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }
    
    public void jePlnoleta(){
        if(this.vek >17){
            System.out.println("je plnoleta");
        }else{
            System.out.println("neni plnoleta");
            }
    }
}
