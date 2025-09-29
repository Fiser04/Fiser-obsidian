/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankovnictvijednoduche;

/**
 *
 * @author fiser
 */
public class BankovniUcet {
    String majitel;
    int zustatek;

    public BankovniUcet(String majitel, int zustatek) {
        this.majitel = majitel;
        this.zustatek = zustatek;
    }
    
    public void showZustatek(){
        System.out.println(this.zustatek);
        }
    
    public void addPenize(int penize){
        if (penize > 0){
            this.zustatek +=penize;
        }else{
            System.out.println("vklad musi byt vetsi jak 0");
        }
        showZustatek();
    }
    
    public void takeOut(int penize){
        if (this.zustatek > penize){
            this.zustatek -=penize;
        }else{
            System.out.println("mas moc malo, do minusu nejdem");
        }
        showZustatek();
    }
}
