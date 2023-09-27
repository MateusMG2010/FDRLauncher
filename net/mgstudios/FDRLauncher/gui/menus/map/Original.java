package net.mgstudios.FDRLauncher.gui.menus.map;

import net.mgstudios.FDRLauncher.gui.component.LitePanel;
import net.mgstudios.FDRLauncher.gui.component.map.MapButton;
import net.mgstudios.FDRLauncher.gui.component.map.PageChanger;
import net.mgstudios.FDRLauncher.gui.menus.List;

public class Original extends LitePanel {
    PageChanger BACK = new PageChanger("<<", List.Renovation, PageChanger.BACK_BOUNDS);
    PageChanger NEXT = new PageChanger(">>", List.Renovation, PageChanger.NEXT_BOUNDS);
    MapButton PIZZERIA = new MapButton("Freddy's Pizzeria", "e3m1");
    MapButton NIGHT_1 = new MapButton("Night 1: Classic", "e3m2");
    MapButton NIGHT_2 = new MapButton("Night 2: Classic", "e3m3");
    MapButton NIGHT_3 = new MapButton("Night 3: Classic", "e3m4");
    MapButton NIGHT_4 = new MapButton("Night 4: Classic", "e3m5");
    MapButton NIGHT_5 = new MapButton("Night 5: Classic", "e3m6");
    MapButton NIGHT_6 = new MapButton("Night 6: Classic", "e3m7");
    MapButton VERSUS_MODE = new MapButton("Versus Mode: Classic", "e4m1");
    public Original(){
        super(true);

        this.add(PIZZERIA);
        this.add(NIGHT_1);
        this.add(NIGHT_2);
        this.add(NIGHT_3);
        this.add(NIGHT_4);
        this.add(NIGHT_5);
        this.add(NIGHT_6);
        this.add(VERSUS_MODE);

        PIZZERIA.setBounds(35,120,455,35);
        NIGHT_1.setBounds(35,180,455,35);
        NIGHT_2.setBounds(35,240,455,35);
        NIGHT_3.setBounds(35,300,455,35);
        NIGHT_4.setBounds(35,360,455,35);
        NIGHT_5.setBounds(35,420,455,35);
        NIGHT_6.setBounds(35,480,455,35);
        VERSUS_MODE.setBounds(35,540,455,35);

        this.add(BACK);
        this.add(NEXT);
    }
}