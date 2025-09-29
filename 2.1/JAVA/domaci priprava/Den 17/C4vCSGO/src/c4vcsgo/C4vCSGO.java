//Den 17
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4vcsgo;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author odkolin
 */
public class C4vCSGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ve hre Counter-Strike terrorista polozi bombu na site a po 40 sekundach bouchne, aby se nemuselo tolik cekat tak dam 5 sekund
        Timer casovacTimer = new Timer();
        Scanner sc = new Scanner(System.in);
        //System.out.println("Zadejte delku doutnaku"); pokud bych resil ze si uzivatel zada svoji delku rozbusky
        //int delkaRozbuskyUzivatele = sc.nextInt();
        TimerTask timerTask = new TimerTask() {
            //int delkaRozbusky = delkaRozbuskyUzivatele;
            int delkaRozbusky = 5;
            @Override
            public void run() {
                System.out.println(delkaRozbusky);
                delkaRozbusky--;
                if (delkaRozbusky <= 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.getLogger(C4vCSGO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                    }
                    System.out.println("BUM");
                    System.out.println("Terrorist wins");
                    casovacTimer.cancel();
                }
            }
        };
        casovacTimer.scheduleAtFixedRate(timerTask, 0, 1000);
        sc.close();
    }
    

}
