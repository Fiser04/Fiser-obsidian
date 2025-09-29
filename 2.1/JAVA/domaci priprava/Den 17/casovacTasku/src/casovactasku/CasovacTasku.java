//Den 17
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casovactasku;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author odkolin
 */
public class CasovacTasku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Timer = urcujeme kdy podle casu se ma nejaka vec pustit
        // TimerTask = to je ta pustena vec
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int pocet = 3;
            @Override
            public void run() {
                System.out.println("hello");
                pocet--;
                if(pocet <= 0 ){
                    System.out.println("hotovo");
                    timer.cancel();
                }
            }
        };
        //timer.schedule(timerTask, 1000); //po sekunde udelej task
        timer.schedule(timerTask, 300, 1000); //toto se pusti po 300 milisekundach a kazdou sekundu to udela task

        
    }
    
}
