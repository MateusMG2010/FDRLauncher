package net.mgstudios.FDRLauncher.gui.component;

import net.mgstudios.FDRLauncher.gui.Frame;
import net.mgstudios.FDRLauncher.gui.menus.List;
import net.mgstudios.FDRLauncher.sound.SoundManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Return extends LiteButton {
    public Return(List PANEL_TO_LOAD){
        super("Return","> Return");
        this.setBounds(35, 645, 250, 30);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SoundManager.SelectBeep();
                Return.super.reset();
                Frame.LOAD(PANEL_TO_LOAD);
            }
        });
    }
}