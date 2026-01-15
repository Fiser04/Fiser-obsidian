/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author fiser
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Task t1 = new Task("jes");
        Task t2 = new Task("no");
        
        Task.addToList(t2);
        Task.addToList(t1);
        Task.sort();
        Task.show();
    }
    
}
