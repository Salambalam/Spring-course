package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }
    @Bean
    public ArrayList<Music> musicList(){
        ArrayList<Music> music = new ArrayList<>();
        music.add(classicalMusic());
        music.add(rockMusic());
        music.add(rapMusic());
        return music;
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer((ArrayList<Music>) musicList());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
