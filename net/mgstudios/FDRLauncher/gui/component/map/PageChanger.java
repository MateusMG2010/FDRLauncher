package net.mgstudios.FDRLauncher.gui.component.map;

import net.mgstudios.FDRLauncher.gui.Frame;
import net.mgstudios.FDRLauncher.gui.component.LiteButton;
import net.mgstudios.FDRLauncher.gui.menus.List;
import net.mgstudios.FDRLauncher.sound.SoundManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PageChanger extends LiteButton {
    public static int[] BACK_BOUNDS = {35, 675, 85, 35};
    public static int[] NEXT_BOUNDS = {130, 675, 85, 35};
    public PageChanger(String TEXT, List TO_LOAD, int[] BOUNDS){
        super(TEXT,TEXT);
        this.setBounds(BOUNDS[0],BOUNDS[1],BOUNDS[2],BOUNDS[3]);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SoundManager.SelectBeep();
                Frame.LOAD(TO_LOAD);
            }
        });
    }
}