package net.mgstudios.FDRLauncher.gui.menus;

import net.mgstudios.FDRLauncher.game.GameRunner;
import net.mgstudios.FDRLauncher.gui.component.*;
import net.mgstudios.FDRLauncher.sound.SoundManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Join extends LitePanel {
    final LiteButton Play = new LiteButton("Play", "> Play");
    final JTextField ipField = new JTextField();
    final LiteLabel underlined = new LiteLabel("________________");
    final Return return_btn = new Return(List.Multiplayer);
    public Join(){
        super(false);
        Play.setBounds(35,445,295,35);
        Play.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(!ipField.getText().isEmpty()){
                    SoundManager.SelectBeep();
                    new GameRunner().Join(ipField.getText());
                }
            }
        });
        ipField.setBounds(35,385,250,30);
        ipField.setFont(new Font("Consolas", Font.PLAIN, 20));
        ipField.setForeground(Color.WHITE);
        ipField.setBorder(BorderFactory.createEmptyBorder());
        ipField.setOpaque(false);
        ipField.setDocument(new Limit(19));
        ipField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar() == KeyEvent.VK_ENTER){
                    if(!ipField.getText().isEmpty()){
                        SoundManager.SelectBeep();
                        new GameRunner().Join(ipField.getText());
                    }
                }
            }
        });
        underlined.setBounds(35,385,250,30);
        this.add(Play);
        this.add(ipField);
        this.add(underlined);
        this.add(return_btn);
    }
}