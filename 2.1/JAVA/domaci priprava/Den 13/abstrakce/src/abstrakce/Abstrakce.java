//Den 13
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstrakce;

/**
 *
 * @author fiser
 */
public class Abstrakce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        abstrakce = jednoduse receno, nerikam uzivateli jak funguje motor, ale jen kde je plyn, aby jel dopredu
                    proste a jednoduse nevytvorim tridu kterou pouzivam jako blueprint
        */
        
        Kruh kruh = new Kruh(3);
        Trojuhelnik trojuhelnik = new Trojuhelnik(5, 3);
        Ctyruhelnik ctyruhelnik = new Ctyruhelnik(10, 3);
        
        System.out.println(kruh.area());
        System.out.println(trojuhelnik.area());
        System.out.println(ctyruhelnik.area());
    }
    
}
