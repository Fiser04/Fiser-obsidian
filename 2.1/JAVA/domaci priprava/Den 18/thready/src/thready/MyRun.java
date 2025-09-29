/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thready;

/**
 *
 * @author odkolin
 */
public class MyRun implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i<=5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.getLogger(MyRun.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            if(i == 5){
                System.out.println("Pozde");
                System.exit(0);
            }
        }
    }
}
