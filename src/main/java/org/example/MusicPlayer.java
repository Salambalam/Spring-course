package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    @Value("${musicPlayer.volume}")
    private int volume;

    private ArrayList<Music> musics;
    public MusicPlayer(ArrayList<Music> musics){
        this.musics = musics;
    }


    public String playMusic(){
        return "Playing: "  + musics.get((int)(Math.random()*musics.size())).getSong();
    }

}
