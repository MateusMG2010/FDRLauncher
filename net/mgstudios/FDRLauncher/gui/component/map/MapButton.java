package net.mgstudios.FDRLauncher.gui.component.map;

import net.mgstudios.FDRLauncher.gui.Frame;
import net.mgstudios.FDRLauncher.gui.component.LiteButton;
import net.mgstudios.FDRLauncher.gui.menus.Host;
import net.mgstudios.FDRLauncher.gui.menus.List;
import net.mgstudios.FDRLauncher.sound.SoundManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;

public class MapButton extends LiteButton {
    Properties properties = System.getProperties();
    public MapButton(String MAP_NAME, String MAP_CODE){
        super(MAP_NAME,"> %s".formatted(MAP_NAME));
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                properties.setProperty("map_code", MAP_CODE);
                System.out.printf("Selected: %s\n", MAP_CODE);
                Host.setText(MAP_NAME, "> %s".formatted(MAP_NAME));
                MapButton.super.setText(MAP_NAME);
                SoundManager.SelectBeep();
                Frame.LOAD(List.Host);
            }
        });
    }
}