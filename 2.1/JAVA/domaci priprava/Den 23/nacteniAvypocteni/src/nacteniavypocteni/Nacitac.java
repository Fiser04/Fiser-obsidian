package nacteniavypocteni;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author fiser
 */
public class Nacitac {

    String nazevSouboru;
    int vysledek = 0;

    public Nacitac(String nazevSouboru) {
        this.nazevSouboru = nazevSouboru;
    }

    public void nacteniSouboru() {
        try (BufferedReader bf = new BufferedReader(new FileReader(this.nazevSouboru))) {
            String line;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
                vysledek+=Integer.parseInt(line);
            }
            System.out.println(vysledek);
            
            
            
        } catch (FileNotFoundException ex) {
            System.getLogger(Nacitac.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (IOException ex) {
            System.getLogger(Nacitac.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }
}
