package com.mycompany;

import java.util.Scanner;

/*
Zadání 6: Rezervační systém pro kino
Úkol: Vytvořte program pro rezervaci v kinosále. Sál má 5x5 sedadel.
Program musí umět:
    Zobrazit mapu sálu (volná/obsazená sedadla).
    Rezervovat konkrétní sedadlo (zadané řadou a číslem).
    Zrušit rezervaci sedadla.
    Spočítat a zobrazit počet volných míst.
    Uložit a načíst stav rezervací do/z textového souboru rezervace.txt.
Pokrytá látka: Dvourozměrné pole, řídicí struktury, textové soubory, základní algoritmy.
 */
public class App {

    public static void main(String[] args) {
        Sal sal = new Sal();
        try (Scanner sc = new Scanner(System.in)) {
            String input = "";
            do {
                System.out.println(
                    "1: Zobraz mapu salu\n2: Rezervuj sedadlo\n3: Zrus rezervaci\n4: Zobraz pocet volnych mist"
                );
                input = sc.nextLine();
                switch (input) {
                    case "1":
                        {
                            sal.zobrazMapu();
                        }
                        break;
                    case "2":
                        {
                            System.out.println("rada, cislo");

                            int rada = Integer.parseInt(sc.nextLine());
                            int sloupec = Integer.parseInt(sc.nextLine());
                            sal.zarezervovat(rada, sloupec);
                        }
                        break;
                    case "3":
                        {
                            System.out.println("rada, cislo");
                            int rada = Integer.parseInt(sc.nextLine());
                            int sloupec = Integer.parseInt(sc.nextLine());
                            sal.zrusitRezervaci(rada, sloupec);
                        }
                        break;
                    case "4":
                        {
                            sal.pocetVolnych();
                        }
                        break;
                    case "":
                        {
                            System.out.println("Musite neco zadat");
                        }
                        break;
                }
            } while (!input.equals("q"));
        } catch (Exception e) {} finally {
            sal.ulozitDoSouboru();
        }
    }
}
