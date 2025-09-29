//Den 15
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapisdosouboru;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author fiser
 */
public class ZapisDoSouboru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            FileWriter = male a stredni textove soubory
            BufferedWriter = velke textove soubory
            PrintWriter = strukturovana data jako logy treba
            FileOutputStream = obrazky, audio, video a dalsi binarky
         */
        String filePath = "text.txt";
        String text = "Banan na strese";
        String dlouhyText = """
                            Oi
                            bro
                            banan
                            jes
                            no                            
                            """;

        try (FileWriter writer = new FileWriter(filePath)) { //bere to jako homeProjektu/text.txt
            writer.write(dlouhyText);
            System.out.println("zapsano");
        } catch (FileNotFoundException e) { //kdyz to nenajde cestu
            System.out.println("cesta k souboru nebyla nalezena");
        } catch (IOException e) { //ostatni
            System.out.println("Error while writing");
        }

    }

}
