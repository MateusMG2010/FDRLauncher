package net.mgstudios.FDRLauncher.sound;

import net.mgstudios.FDRLauncher.extra.Resource;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.IOException;

public class SelectBeep {
    Clip clip;
    public SelectBeep() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(Resource.getResource("assets/FDRLauncher/sound/select-beep.wav")));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        }catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.out.println("Can't Play SelectBeep!");
        }
    }
    public void Play(){
        clip.start();
    }
}