/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregace;

/**
 *
 * @author fiser
 */
public class Knihovna {
    private String jmeno;
    private Kniha[] knihy;
    private int rok;

    public Knihovna(String jmeno, Kniha[] knihy, int rok) {
        this.jmeno = jmeno;
        this.knihy = knihy;
        this.rok = rok;
    }
    
    public void ukazInfo(){
        System.out.println("Knihovna " + jmeno + " byla zalozena roku " + rok);
        System.out.println("Knihy volne k zapujceni: ");
        for (Kniha k : knihy){
            System.out.println(k.ukazInfo());
        }
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public Kniha[] getKnihy() {
        return knihy;
    }

    public void setKnihy(Kniha[] knihy) {
        this.knihy = knihy;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }
    
    
            
}
