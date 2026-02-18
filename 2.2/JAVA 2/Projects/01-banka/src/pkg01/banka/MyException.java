/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01.banka;

/**
 *
 * @author fiser
 */
public class MyException extends Exception{
    private String zprava;
    public MyException(){
        this.zprava = "Zaporny vstup";
    }

    public String getZprava() {
        return zprava;
    }
    
}
