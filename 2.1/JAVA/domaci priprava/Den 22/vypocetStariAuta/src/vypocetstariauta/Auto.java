/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vypocetstariauta;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author fiser
 */
public class Auto {
    String znacka;
    int najeto;
    int rocnik;

    public Auto(String znacka, int najeto, int rocnik) {
        this.znacka = znacka;
        this.najeto = najeto;
        this.rocnik = rocnik;
    }
    
    public void AddKilomete(int pocetPridani){
        this.najeto +=pocetPridani;
    }
    
    public int vekVozidla(){
        LocalDate ld = LocalDate.now();
        return ld.getYear() - this.rocnik;
    }
}
