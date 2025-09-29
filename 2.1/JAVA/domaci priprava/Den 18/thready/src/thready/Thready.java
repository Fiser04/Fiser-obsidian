/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thready;

import java.util.Scanner;

/**
 *
 * @author odkolin
 */
public class Thready {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        jednodusi postup - rozsirit Thread tridu
        lepsi ale slozitejsi - implementovat spustitelny interface
        */
        
        Scanner sc = new Scanner(System.in);
        MyRun mr = new MyRun();
        Thread thread = new Thread(mr);
        System.out.println("mas 5 sekund na odpoved");
        System.out.print("vloz sve jmeno ");
        thread.setDaemon(true);
        thread.start();
        String odpoved = sc.nextLine();
        System.out.println("Ahoj "+ odpoved);
        sc.close();
    }
    
}
