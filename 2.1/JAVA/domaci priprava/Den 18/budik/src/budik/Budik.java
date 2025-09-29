/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package budik;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author odkolin
 */
public class Budik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String fileCesta = "suzume.wav";

        while (alarmTime == null) {
            try {
                System.out.println("Vyber cas (hh:mm:ss)");
                String inputString = sc.nextLine();
                alarmTime = LocalTime.parse(inputString, dtf);
                System.out.println("budik nastaven na " + alarmTime);
            } catch (DateTimeParseException dtpe) {
                System.out.println("neplatny input, HH:mm:ss");
            }
        }
        
        AlarmHodin alarmHodin = new AlarmHodin(alarmTime, fileCesta);
        Thread thread = new Thread(alarmHodin);
        thread.start();

        sc.close();
    }

}
