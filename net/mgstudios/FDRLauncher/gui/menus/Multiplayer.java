package net.mgstudios.FDRLauncher.gui.menus;

import net.mgstudios.FDRLauncher.gui.Frame;
import net.mgstudios.FDRLauncher.gui.component.LiteButton;
import net.mgstudios.FDRLauncher.gui.component.LitePanel;
import net.mgstudios.FDRLauncher.gui.component.Return;
import net.mgstudios.FDRLauncher.sound.SoundManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Multiplayer extends LitePanel {
    final LiteButton host = new LiteButton("Host","> Host");
    final LiteButton join = new LiteButton("Join", "> Join");
    final Return return_btn = new Return(List.MainMenu);
    public Multiplayer(){
        super(false);
        host.setBounds(35,385,295,35);
        host.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SoundManager.SelectBeep();
                host.reset();
                Frame.LOAD(List.Host);
            }
        });
        join.setBounds(35,445,295,35);
        join.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SoundManager.SelectBeep();
                join.reset();
                Frame.LOAD(List.Join);
            }
        });
        this.add(host);
        this.add(join);
        this.add(return_btn);
    }
}