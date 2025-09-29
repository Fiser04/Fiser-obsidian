//Den 15
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hudba;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author fiser
 */
public class Hudba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        rozhrani
        user input (ovladani)
        cteni souboru
         */
        String cesta = "song.wav";
        boolean spusteno = true;
        Player player = new Player(cesta);
        try (Scanner sc = new Scanner(System.in)) {
            player.readFile();
            loop:
            while (spusteno) {
                player.menuShow();
                switch ((sc.nextLine()).toLowerCase()) {
                    case "p" ->
                        player.play();
                    case "s" ->
                        player.stop();
                    case "r" ->
                        player.resetH();
                    case "q" ->
                        spusteno = false;
                    default -> {
                        continue;
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("spatny input");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("spatny soubor");
        } catch (FileNotFoundException e) {
            System.out.println("soubor nenalezen");
        } catch (LineUnavailableException ex) {
            System.out.println("nezdaril se pristup k audiu");
        } catch (IOException e) {
            System.out.println("IOchuju");
        }

    }

}
