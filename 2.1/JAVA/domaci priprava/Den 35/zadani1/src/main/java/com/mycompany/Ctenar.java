package com.mycompany;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Ctenar {

    final String inputNazevSouboru;
    final String outpuNazevSouboru = "analyza.txt";
    final String inputString;
    public int pocetRadku;

    public String nejcastejsiString() {
        String[] roztrhany = ((this.inputString).replace(",", " ")).replace(
            ".",
            " "
        ).split("\\s+");
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        for (String slovo : roztrhany) {
            if (mapa.containsKey(slovo)) {
                int soucastnyPocet = mapa.get(slovo);
                mapa.put(slovo, soucastnyPocet + 1);
            } else {
                mapa.put(slovo, 1);
            }
        }
        int maxPocet = 0;
        String nejcastejsi = "";
        for (String slovo : mapa.keySet()) {
            int pocet = mapa.get(slovo);
            if (pocet > maxPocet) {
                maxPocet = pocet;
                nejcastejsi = slovo;
            }
        }
        return nejcastejsi;
    }

    public String getInputNazevSouboru() {
        return inputNazevSouboru;
    }

    public String getOutpuNazevSouboru() {
        return outpuNazevSouboru;
    }

    public String getInputString() {
        return inputString;
    }

    public int getPocetRadku() {
        return pocetRadku;
    }

    public Ctenar(String nazevSouboru) {
        this.inputNazevSouboru = nazevSouboru;
        this.inputString = nacistSoubor();
    }

    public int pocetSlov() {
        String[] roztrhanyText = ((this.inputString).replace(",", " ")).replace(
            ".",
            " "
        ).split("\\s+");
        int pocet = 0;
        for (int i = 0; i < roztrhanyText.length; i++) {
            pocet++;
            System.out.println(roztrhanyText[i]);
        }
        return pocet;
    }

    public int pocetZnakuSMezerama() {
        return this.inputString.length();
    }

    public int pocetZnakuBezMezer() {
        String roztrhanyText = this.inputString.replace(" ", "");
        return roztrhanyText.length();
    }

    public String nacistSoubor() {
        try (
            BufferedReader br = new BufferedReader(
                new FileReader(this.inputNazevSouboru)
            )
        ) {
            String line = "";
            int pocetRadku = 0;
            String konec = "";
            while ((line = br.readLine()) != null) {
                konec += line + "\n";
                pocetRadku++;
            }
            this.pocetRadku = pocetRadku;
            return konec;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    }
}
