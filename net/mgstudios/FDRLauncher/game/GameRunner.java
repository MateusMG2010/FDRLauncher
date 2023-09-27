package net.mgstudios.FDRLauncher.game;

import net.mgstudios.FDRLauncher.gui.ErrorManager;

import java.io.File;
import java.io.IOException;

public class GameRunner {
    boolean exists(String path_name){
        return new File(path_name).exists();
    }
    void RunCommand(String command){
        try {
            Runtime.getRuntime().exec(new String[]{"cmd.exe","/c",command});
        }
        catch (IOException e){
            System.out.println("===RUNTIME-ERROR===");
            System.out.println("Catch: IOException");
            System.out.println("At GameRunner.RunCommand()");
        }
    }
    public boolean checkAll(){
        return exists("Data\\gzdoom.exe") && exists("Data\\Wads\\FiveNightsAtFreddys1_3.wad") && exists("Data\\Wads\\FNAF.pk3") && exists("Data\\Wads\\NormalsNSpeculars.pk3") && exists("Data\\Wads\\doom1.wad");
    }
    public void Singleplayer(){
        if(checkAll()){
            RunCommand("start Data\\gzdoom.exe -IWAD Data\\WaDs\\DOOM1.WAD +set cl_maxdecals 2147483647 +set movebob 0.05 -FILE Data\\WaDs\\FiveNightsAtFreddys1_3.wad Data\\WaDs\\FNAF.PK3 Data\\WaDs\\NormalsNSpeculars.PK3 +sv_cheats 0");
            System.exit(0);
        }
        else {
            ErrorManager.makeDialog("Some Game Files Not Found!");
        }
    }
    public void Host(String MAP_CODE, String PLAYER_NUMBER){
        if(checkAll()){
            RunCommand("start Data\\gzdoom.exe -IWAD Data\\WaDs\\DOOM1.WAD +set cl_maxdecals 2147483647 +set movebob 0.05 -FILE Data\\Wads\\* -host %s +map %s -netmode 0 +sv_cheats 0".formatted(PLAYER_NUMBER, MAP_CODE));
            System.exit(0);
        }
        else {
            ErrorManager.makeDialog("Some Game Files Not Found!");
        }
    }
    public void Join(String IP){
        if(checkAll()){
            RunCommand("start Data\\gzdoom.exe -IWAD Data\\WaDs\\DOOM1.WAD +set cl_maxdecals 2147483647 +set movebob 0.05 -FILE Data\\WaDs\\* -join %s".formatted(IP));
            System.exit(0);
        }
        else {
            ErrorManager.makeDialog("Some Game Files Not Found!");
        }
    }
}