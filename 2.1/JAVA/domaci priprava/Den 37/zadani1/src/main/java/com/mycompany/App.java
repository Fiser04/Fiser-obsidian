package com.mycompany;

import java.util.Scanner;

/*
Zadání 1: Správa knihovny
Vytvořte systém pro správu knihovny.
Systém musí umět evidovat knihy (název, autor, rok vydání, dostupnost),
půjčovat knihy čtenářům, vracet knihy a vyhledávat v katalogu.
Data se ukládají do souboru a načítají se při spuštění.
Uživatel komunikuje s programem přes textové menu.
 */

public class App {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Jaky je nazev pracovniho souboru?");
            String input = sc.nextLine();
            Knihovna knihovna = new Knihovna(input);
            boolean running = true;
            do {
                System.out.println(
                    "\n1: Pridej knihu\n2: Najdi knihu v katalogu\n3: Vrat knihu\n4: Pujc knihu\nq: Konec"
                );
                String keyInput = sc.nextLine();
                switch (keyInput) {
                    case "1": {
                        System.out.println(
                            "Postupne zadej: nazev, autor, rok vydani"
                        );
                        String nazev = sc.nextLine();
                        String autor = sc.nextLine();
                        int rok = Integer.parseInt(sc.nextLine());

                        knihovna.novaKniha(nazev, autor, rok);
                        break;
                    }
                    case "2": {
                        System.out.println("Zadej nazev knihy");
                        String nazev = sc.nextLine();
                        knihovna.najdiKnihuPodleNazvu(nazev);
                        break;
                    }
                    case "3": {
                        System.out.println("Zadej nazev knihy");
                        String nazev = sc.nextLine();
                        knihovna.vratitKnihu(nazev);
                        break;
                    }
                    case "4": {
                        System.out.println("Zadej nazev knihy");
                        String nazev = sc.nextLine();
                        knihovna.pujcitKnihu(nazev);
                        break;
                    }
                    case "q": {
                        knihovna.ulozit();
                        running = false;
                        break;
                    }
                    default: {
                        System.out.println("Neplatny input");
                        break;
                    }
                }
            } while (running);
        } finally {
            System.out.println("Nashledanou");
        }
    }
}
