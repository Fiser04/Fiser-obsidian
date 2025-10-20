package com.mycompany;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileMan {

    String jmenoSouboru;
    ArrayList<Ukol> ukols = new ArrayList<Ukol>();

    public FileMan(String jmenoSouboru) {
        this.jmenoSouboru = jmenoSouboru;
    }

    public void importArray(ArrayList<Ukol> importedArray) {
        this.ukols = importedArray;
    }

    public void saveToFile() {
        try (
            BufferedWriter bw = new BufferedWriter(new FileWriter(jmenoSouboru))
        ) {
            for (Ukol ukol : this.ukols) {
                String toUlozit =
                    ukol.getPopis() +
                    ";" +
                    ukol.getPriorita().name() +
                    ";" +
                    ukol.isSplneno() +
                    "\n";
                bw.write(toUlozit);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Ukol> loadFromFile() {
        try (
            BufferedReader br = new BufferedReader(new FileReader(jmenoSouboru))
        ) {
            String line = "";
            ArrayList<Ukol> ukoly = new ArrayList<Ukol>();
            while ((line = br.readLine()) != null) {
                String[] roztrhany = line.split(";");
                ukoly.add(
                    new Ukol(
                        roztrhany[0],
                        Priorita.valueOf(roztrhany[1]),
                        Boolean.parseBoolean(roztrhany[2])
                    )
                );
            }
            return ukoly;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
