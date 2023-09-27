package net.mgstudios.FDRLauncher.sound;

import net.mgstudios.FDRLauncher.extra.Resource;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Background {
    Clip clip;
    public Background() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(Resource.getResource("assets/FDRLauncher/sound/background.wav")));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        }
        catch (LineUnavailableException | UnsupportedAudioFileException | IOException | NullPointerException e){
            System.out.println("Ignored!");
        }
    }
    public void Play(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
}