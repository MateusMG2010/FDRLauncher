package net.mgstudios.FDRLauncher.gui.component;

import net.mgstudios.FDRLauncher.extra.Resource;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LitePanel extends JLabel {
    public LitePanel(boolean isMapSelection){
        this.setLayout(null);
        if(!isMapSelection){
            LiteLabel TITLE = new LiteLabel("<html><body>Five<br>Nights<br>At<br>Freddy's<br>Doom<br>Renovation<br>Mod</body></html>");
            LiteLabel GAME_VERSION = new LiteLabel("Version: 5.1.0");
            TITLE.setBounds(35,-65,205,450);
            TITLE.setFont(new Font("Consolas",Font.PLAIN, 35));
            GAME_VERSION.setBounds(35,685,250,35);
            GAME_VERSION.setFont(new Font("Consolas", Font.PLAIN, 30));
            this.add(TITLE);
            this.add(GAME_VERSION);
        }
        else {
            makeSelectionPane();
        }
        new imageThread().start();
    }
    void makeSelectionPane(){
        LiteLabel TITLE = new LiteLabel("Choose An Episode:");
        TITLE.setBounds(35,35,350,40);
        TITLE.setFont(new Font("Consolas",Font.PLAIN, 35));
        this.add(TITLE);
    }
    void setImage(URL url){
        LitePanel.this.setIcon(new ImageIcon(url));
    }
    class imageThread extends Thread implements Runnable {
        @Override
        public void run(){
            while(true) {
                try {
                    sleep(50);
                    setImage(Resource.getURL("assets/FDRLauncher/background/background_1.png"));
                    sleep(50);
                    setImage(Resource.getURL("assets/FDRLauncher/background/background_2.png"));
                    sleep(50);
                    setImage(Resource.getURL("assets/FDRLauncher/background/background_3.png"));
                    sleep(50);
                    setImage(Resource.getURL("assets/FDRLauncher/background/background_4.png"));
                    sleep(50);
                    setImage(Resource.getURL("assets/FDRLauncher/background/background_5.png"));
                    sleep(50);
                }
                catch (InterruptedException e){
                    break;
                }
            }
        }
    }
}