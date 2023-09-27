package net.mgstudios.FDRLauncher.sound;

import net.mgstudios.FDRLauncher.extra.Resource;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Beep {
    Clip clip;
    public Beep() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(Resource.getResource("assets/FDRLauncher/sound/beep.wav")));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        }
        catch (LineUnavailableException | UnsupportedAudioFileException | IOException e){
            System.out.println("Can't Load Beep!");
        }
    }
    public void Play(){
        clip.start();
    }
    public void Stop(){
        clip.stop();
    }
}