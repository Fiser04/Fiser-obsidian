/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01;

/**
 *
 * @author fialav06
 */
public interface Ikolekce<T> {
    
    void pridej(T t);
    
    void odeber(T t);
    
    int pocetPrvku();
    
    void serad();
    
    String vypis();
    
   T max();
    
   String getID(T t);
}
