package budik;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class AlarmHodin implements Runnable{
    
    private final LocalTime alarmCas;
    private final String fileCesta;

    public AlarmHodin(LocalTime alarmCas, String fileCesta) {
        this.alarmCas = alarmCas; 
        this.fileCesta = fileCesta;
    }
    
    
    
    @Override
    public void run(){
        while(LocalTime.now().isBefore(alarmCas)){
            try {
                Thread.sleep(1000);
                
                LocalTime now = LocalTime.now();                
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            } catch (InterruptedException ex) {
                System.out.println("Thread byl prerusen");
            }
        }
        play(this.fileCesta);
    }
    
    private void play(String fileCesta){
        AudioInputStream ais = null;
        try {
            File audioFile = new File(fileCesta);
            ais = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            Thread.sleep(236000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.getLogger(AlarmHodin.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (InterruptedException ex) {
            System.getLogger(AlarmHodin.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } finally {
            try {
                ais.close();
            } catch (IOException ex) {
                System.getLogger(AlarmHodin.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }
}
