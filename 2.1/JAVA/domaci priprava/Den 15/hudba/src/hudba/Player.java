/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hudba;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author fiser
 */
public class Player {
    String cesta;
    File file;
    String menu = """
                  P = Play
                  S = Stop
                  R = Reset
                  Q = Quit
                  """;
    AudioInputStream audio;
    Clip clip;

    public Player(String cesta) {
        this.cesta = cesta;
        file = new File(cesta);
    }
    
    void menuShow(){
        System.out.println(menu);
    }
    
    void readFile() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        audio = AudioSystem.getAudioInputStream(file);
        clip = AudioSystem.getClip();
        clip.open(audio);
    }
    void resetH() throws IOException{
        clip.setFramePosition(0);
    }
    void play(){
        clip.start();
    }
    void stop(){
        clip.stop();
    }
}
