//Den 15
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ctenisouboru;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 *
 * @author fiser
 */
public class CteniSouboru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            BufferedReader + FileReader = cteni radka po radce
            FileInputStream = audio, video, obrazky
            RandomAccessFile = pro cteni/zapisovani urciteho kusu v velkym souboru
        */
        
        String cesta = "text.txt";
        
        try(BufferedReader br = new BufferedReader(new FileReader(cesta))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("cesta nebyla nalezena");
        }catch(IOException e){
            System.out.println("Error blin");
        }
        
    }
    
}
