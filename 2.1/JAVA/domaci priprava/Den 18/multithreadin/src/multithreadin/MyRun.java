/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadin;

/**
 *
 * @author odkolin
 */
public class MyRun implements Runnable{
    private final String text;

    public MyRun(String text) {
        this.text = text;
    }
    
    
    @Override
    public void run(){
        for(int i = 0; i<=5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread byl prerusen");
            }
            System.out.println(text);
            
        }
    }
}
