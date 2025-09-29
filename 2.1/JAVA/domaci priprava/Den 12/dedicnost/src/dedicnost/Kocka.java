/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dedicnost;

/**
 *
 * @author fiser
 */
public class Kocka extends Zvire{
    int pocetZivotu = 9;
    
    void zemre(){
        pocetZivotu--;
        System.out.println(pocetZivotu);
    }
}
