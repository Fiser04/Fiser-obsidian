package com.mycompany;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sal {

    private String nazevSoubor = "rezervace.txt";
    private char[][] mapa;
    private final int pocetRad;
    private final int pocetSloupcu;

    public Sal() {
        this.pocetRad = nacistVelikostMapy(0);
        this.pocetSloupcu = nacistVelikostMapy(1);
        this.mapa = new char[this.pocetRad][this.pocetSloupcu];
        nacistSoubor();
    }

    public void zobrazMapu() {
        String output = "";
        for (int i = 0; i < this.pocetRad; i++) {
            for (int j = 0; j < this.pocetSloupcu; j++) {
                output += " " + mapa[i][j];
            }
            output += "\n";
        }
        System.out.println(output);
    }

    public void zarezervovat(int pocetRad, int pocetSloupcu) {
        try {
            if (this.mapa[pocetRad - 1][pocetSloupcu - 1] == 'v') {
                this.mapa[pocetRad - 1][pocetSloupcu - 1] = 'r';
            } else {
                System.out.println("Toto sedadlo je jiz obsazene");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sedadlo neexistuje");
        }
    }

    public void zrusitRezervaci(int pocetRad, int pocetSloupcu) {
        try {
            if (this.mapa[pocetRad - 1][pocetSloupcu - 1] == 'r') {
                this.mapa[pocetRad - 1][pocetSloupcu - 1] = 'v';
            } else {
                System.out.println("Toto sedadlo je jiz volne");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sedadlo neexistuje");
        }
    }

    public void pocetVolnych() {
        int pocetVolnychSedadel = 0;
        for (int i = 0; i < this.pocetRad; i++) {
            for (int j = 0; j < this.pocetSloupcu; j++) {
                if (this.mapa[i][j] == 'v') {
                    pocetVolnychSedadel++;
                }
            }
        }
        System.out.println(pocetVolnychSedadel);
    }

    private int nacistVelikostMapy(int i) {
        try (
            BufferedReader br = new BufferedReader(
                new FileReader(this.nazevSoubor)
            )
        ) {
            String line = "";
            int pocetRad = 0;
            int pocetSloupcu = 0;
            while ((line = br.readLine()) != null) {
                String[] roztrhanyLine = line.split(";");
                if (pocetSloupcu < roztrhanyLine.length) {
                    pocetSloupcu = roztrhanyLine.length;
                }
                pocetRad++;
            }
            if (i == 0) {
                return pocetRad;
            } else {
                return pocetSloupcu;
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }

    private void nacistSoubor() {
        try (
            BufferedReader br = new BufferedReader(
                new FileReader(this.nazevSoubor)
            )
        ) {
            String line = "";
            int rada = 0;
            while ((line = br.readLine()) != null) {
                String[] znaky = line.split(";");
                for (int sloupec = 0; sloupec < znaky.length; sloupec++) {
                    mapa[rada][sloupec] = znaky[sloupec].charAt(0);
                }
                rada++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Soubor neexistuje");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void ulozitDoSouboru() {
        try (
            BufferedWriter bw = new BufferedWriter(
                new FileWriter(this.nazevSoubor, false)
            )
        ) {
            String input = "";
            for (int i = 0; i < this.pocetRad; i++) {
                for (int j = 0; j < this.pocetSloupcu; j++) {
                    if (j == pocetSloupcu - 1) {
                        input += mapa[i][j];
                    } else {
                        input += mapa[i][j] + ";";
                    }
                }
                input += "\n";
            }
            bw.write(input);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
