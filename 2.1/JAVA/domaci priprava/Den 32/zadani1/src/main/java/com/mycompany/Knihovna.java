package com.mycompany;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Knihovna {

    String nazevSouboru = "text.txt";
    ArrayList<Kniha> knihas = new ArrayList<Kniha>();

    public Knihovna() {
        nacistZSouboru();
    }

    public void pridejKnihy(Kniha kniha) {
        this.knihas.add(kniha);
    }

    public String vyhledejKnihu(String nazev, String autor) {
        for (Kniha k : this.knihas) {
            if ((k.jmeno.equals(nazev)) || (k.autor.equals(autor))) {
                return k.toString();
            }
        }
        return "Nenalezeno";
    }

    private void nacistZSouboru() {
        try (
            BufferedReader br = new BufferedReader(
                new FileReader(this.nazevSouboru)
            )
        ) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] lineinput = line.split(";");
                pridejKnihy(
                    new Kniha(
                        lineinput[0],
                        lineinput[1],
                        lineinput[2],
                        (Integer.parseInt(lineinput[3]))
                    )
                );
            }
        } catch (FileNotFoundException e) {
            System.out.println("Soubor nenalezen");
        } catch (IOException e1) {
            System.out.println("IO error");
        }
    }

    public void ulozit() {
        try (
            BufferedWriter bw = new BufferedWriter(
                new FileWriter(this.nazevSouboru, false)
            )
        ) {
            for (Kniha k : this.knihas) {
                String kString =
                    k.jmeno + ";" + k.autor + ";" + k.kod + ";" + k.rokVydani;
                bw.write(kString);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }
}
