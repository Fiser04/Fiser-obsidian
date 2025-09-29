/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreadin;

/**
 *
 * @author odkolin
 */
public class Multithreadin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread thread1 = new Thread(new MyRun("ping"));
        Thread thread2 = new Thread(new MyRun("pong"));
        
        thread1.start();
        thread2.start();
        
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.out.println("Main byl prerusen");
        }
        
    }
    
}
