//Den 17
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timeanddate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author odkolin
 */
public class TimeAndDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cas
        LocalDate ld = LocalDate.now(); //ciste den
        LocalTime lt = LocalTime.now(); //ciste cas
        LocalDateTime ldt = LocalDateTime.now(); //kombinace
        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);
        
        Instant instant = Instant.now(); //utc cas
        System.out.println(instant); 
        
        //vlastni format
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        String newDate = localDateTime.format(dateTimeFormatter);
        System.out.println(newDate);
        
        //vlastni cas
        LocalDate localD = LocalDate.of(2024, Month.DECEMBER, 24);
        System.out.println(localD);
        LocalDateTime localDT = LocalDateTime.of(2025, Month.DECEMBER, 24, 18, 24, 5);
        System.out.println(localDT);
        
        //porovnavani datumu a casu
        LocalDate aDate = LocalDate.of(1902, Month.MARCH, 4);
        LocalDate bDate = LocalDate.of(1902, Month.MARCH, 5);
        if(aDate.isAfter(bDate)){
            System.out.println("je drive");
        }else if(aDate.isBefore(bDate)){
            System.out.println("je pozdeji");
        }else if(aDate.isEqual(bDate)){
            System.out.println("jsou to stejne dny"); 
        }else{
            System.out.println("f");
    }
        
    }
    
}
