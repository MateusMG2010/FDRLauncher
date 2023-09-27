package net.mgstudios.FDRLauncher.gui;

import net.mgstudios.FDRLauncher.extra.Resource;
import net.mgstudios.FDRLauncher.gui.menus.*;
import net.mgstudios.FDRLauncher.gui.menus.List;
import net.mgstudios.FDRLauncher.gui.menus.map.Original;
import net.mgstudios.FDRLauncher.gui.menus.map.Renovation;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public static JFrame frame;
    static final MainMenu mainMenu = new MainMenu();
    static final Multiplayer multiplayer = new Multiplayer();
    static final Join join = new Join();
    static final Host host = new Host();
    static final Renovation renovation = new Renovation();
    static final Original original = new Original();
    public Frame() {
        super("FDRLauncher -Five Nights at Freddy's Doom Renovation Mod Launcher");
        frame = this;
        LOAD(List.MainMenu);
        this.setSize(1024,768);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().createImage(Resource.getURL("assets/FDRLauncher/cursor.png")), new Point(0,0), "cursor"));
        this.setIconImage(new ImageIcon(Resource.getURL("assets/FDRLauncher/chica.png")).getImage());
        this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
    }
    private static void refresh(){
        SwingUtilities.updateComponentTreeUI(frame);
    }
    public static void LOAD(List MENU){
        switch (MENU){
            case MainMenu -> {
                frame.setContentPane(mainMenu);
                refresh();
            }
            case Multiplayer -> {
                frame.setContentPane(multiplayer);
                refresh();
            }
            case Join -> {
                frame.setContentPane(join);
                refresh();
            }
            case Host -> {
                frame.setContentPane(host);
                refresh();
            }
            case Renovation -> {
                frame.setContentPane(renovation);
                refresh();
            }
            case Original -> {
                frame.setContentPane(original);
                refresh();
            }
        }
    }
}