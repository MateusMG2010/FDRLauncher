package net.mgstudios.FDRLauncher.gui.menus.map;

import net.mgstudios.FDRLauncher.gui.component.LitePanel;
import net.mgstudios.FDRLauncher.gui.component.map.MapButton;
import net.mgstudios.FDRLauncher.gui.component.map.PageChanger;
import net.mgstudios.FDRLauncher.gui.menus.List;

public class Renovation extends LitePanel {
    PageChanger BACK = new PageChanger("<<", List.Original, PageChanger.BACK_BOUNDS);
    PageChanger NEXT = new PageChanger(">>", List.Original, PageChanger.NEXT_BOUNDS);
    MapButton INTRODUCTION = new MapButton("Introduction", "e1m1");
    MapButton NIGHT_1 = new MapButton("Night 1", "e1m2");
    MapButton NIGHT_2 = new MapButton("Night 2", "e1m3");
    MapButton NIGHT_3 = new MapButton("Night 3", "e1m4");
    MapButton NIGHT_4 = new MapButton("Night 4", "e1m5");
    MapButton NIGHT_5 = new MapButton("Night 5", "e1m6");
    MapButton NIGHT_6 = new MapButton("Night 6", "e1m7");
    MapButton VERSUS_MODE = new MapButton("Versus Mode", "e2m1");
    MapButton SECRET = new MapButton("???","e1m8");
    public Renovation(){
        super(true);
        this.add(INTRODUCTION);
        this.add(NIGHT_1);
        this.add(NIGHT_2);
        this.add(NIGHT_3);
        this.add(NIGHT_4);
        this.add(NIGHT_5);
        this.add(NIGHT_6);
        this.add(SECRET);
        this.add(VERSUS_MODE);

        INTRODUCTION.setBounds(35,120,345,35);
        NIGHT_1.setBounds(35,180,345,35);
        NIGHT_2.setBounds(35,240,345,35);
        NIGHT_3.setBounds(35,300,345,35);
        NIGHT_4.setBounds(35,360,345,35);
        NIGHT_5.setBounds(35,420,345,35);
        NIGHT_6.setBounds(35,480,345,35);
        VERSUS_MODE.setBounds(35,540,345,35);
        SECRET.setBounds(35,600,345,35);

        this.add(BACK);
        this.add(NEXT);
    }
}