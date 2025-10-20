package com.mycompany;

import java.util.Scanner;

/*
Zadání 4: Správa úkolníku (To-Do List)
Úkol: Vytvořte program pro správu osobních úkolů. Úkol má popis, prioritu (VYSOKÁ, STŘEDNÍ, NÍZKÁ) a stav (splněno/nesplněno).
Program musí umět:
    Přidat nový úkol.
    Označit úkol jako splněný.
    Zobrazit všechny nesplněné úkoly, seřazené podle priority.
    Uložit seznam úkolů do textového souboru ukoly.txt.
    Načíst úkoly ze souboru při spuštění programu.
Pokrytá látka: Třídy a objekty II, výčtový typ (enum) pro priority, textové soubory, řazení (Comparator), ArrayList.
 */
public class App {

    public static void main(String[] args) {
        Ukolnicek ukolnicek = new Ukolnicek();
        String nazevSoubor = "ukoly.txt";
        FileMan fileMan = new FileMan(nazevSoubor);
        ukolnicek.setListUkolu(fileMan.loadFromFile());
        try (Scanner sc = new Scanner(System.in)) {
            String input = "";
            do {
                System.out.println(
                    "1: zadej ukol\n2: oznac jako splneno\n3: vypis nesplnene\nq: konec"
                );

                switch ((input = sc.nextLine())) {
                    case "1":
                        {
                            System.out.println(
                                "Zadej popis, pote zadej prioritu (vysoka, stredni, nizka"
                            );
                            String popis = sc.nextLine();
                            //sc.nextLine();
                            String priorita = sc.nextLine();
                            ukolnicek.addUkol(
                                new Ukol(
                                    popis,
                                    Priorita.valueOf(priorita.toUpperCase())
                                )
                            );
                        }
                        break;
                    case "2":
                        {
                            String popis = sc.nextLine();
                            ukolnicek.setSplneno(popis);
                        }
                        break;
                    case "3":
                        {
                            ukolnicek.showNesplnene();
                        }
                        break;
                    default:
                        {}
                        break;
                }
            } while (!input.equals("q"));
        } finally {
            fileMan.importArray(ukolnicek.getListUkolu());
            fileMan.saveToFile();
        }
    }
}
