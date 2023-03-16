package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicArray = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    public void setMusicArray(List<Music> musicArray){
        this.musicArray = musicArray;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer(){

    }
    public void playMusic(){
        //System.out.println("Playing: " + music.getSong());
        for (Music m: musicArray){
            System.out.println("Playing: " + m.getSong());
        }
    }
    public void setMusic(Music music){
        this.music = music;
    }

}
