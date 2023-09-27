package net.mgstudios.FDRLauncher.sound;

public class SoundManager {
    public static void Beep(){
        new Beep().Play();
    }
    public static void SelectBeep(){
        new SelectBeep().Play();
    }
    public static void Background(){
        new Background().Play();
    }
}