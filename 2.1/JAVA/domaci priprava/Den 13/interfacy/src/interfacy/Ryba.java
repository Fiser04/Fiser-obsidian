/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacy;

/**
 *
 * @author fiser
 */
public class Ryba implements Predator, Korist{
    @Override
    public void utect(){
        System.out.println("Ryba se snazi uplavat");
    }
    
    @Override
    public void lovit(){
        System.out.println("Ryba lovi");
    }
    
}
