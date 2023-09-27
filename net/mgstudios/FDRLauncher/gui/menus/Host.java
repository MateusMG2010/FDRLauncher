package net.mgstudios.FDRLauncher.gui.menus;

import net.mgstudios.FDRLauncher.game.GameRunner;
import net.mgstudios.FDRLauncher.gui.component.LiteButton;
import net.mgstudios.FDRLauncher.gui.component.LitePanel;
import net.mgstudios.FDRLauncher.gui.component.Return;
import net.mgstudios.FDRLauncher.sound.SoundManager;
import net.mgstudios.FDRLauncher.gui.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;

public class Host extends LitePanel {
    final JSpinner PLAYER_SPINNER = new JSpinner(new SpinnerNumberModel(2, 2, 8, 1));
    final JFormattedTextField PLAYER_SPINNER_EDITOR = ((JSpinner.DefaultEditor) PLAYER_SPINNER.getEditor()).getTextField();
    final LiteButton Host = new LiteButton("Host", "> Host");
    final Properties properties = System.getProperties();
    static LiteButton NIGHTS = new LiteButton("Introduction","> Introduction");
    final Return return_btn = new Return(List.Multiplayer);
    public Host(){
        super(false);

        NIGHTS.setBounds(35,445,455,35);
        NIGHTS.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                NIGHTS.setText(NIGHTS.getText().replace("> ",""));
                SoundManager.SelectBeep();
                Frame.LOAD(List.Renovation);
            }
        });

        PLAYER_SPINNER.setBackground(Color.BLACK);
        PLAYER_SPINNER.setForeground(Color.WHITE);
        PLAYER_SPINNER.setBounds(35,385,170,35);

        PLAYER_SPINNER_EDITOR.setBackground(Color.BLACK);
        PLAYER_SPINNER_EDITOR.setForeground(Color.WHITE);
        PLAYER_SPINNER_EDITOR.setFont(new Font(Font.SERIF,Font.PLAIN,32));
        PLAYER_SPINNER_EDITOR.setEditable(false);

        Host.setBounds(35,515,455,35);
        Host.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SoundManager.SelectBeep();
                new GameRunner().Host(properties.getProperty("map_code"), PLAYER_SPINNER.getValue().toString());
            }
        });
        this.add(PLAYER_SPINNER);
        this.add(Host);
        this.add(NIGHTS);
        this.add(return_btn);
    }
    public static void setText(String TEXT, String SELECTED_TEXT){
        NIGHTS.setText(TEXT);
        NIGHTS.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                SoundManager.Beep();
                NIGHTS.setText(SELECTED_TEXT);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                NIGHTS.setText(TEXT);
            }
        });
    }
}