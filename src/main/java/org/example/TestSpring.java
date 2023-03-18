package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("rockMusic", Music.class);
        Music music1 = context.getBean("classicalMusic", Music.class);
        MusicPlayer player = new MusicPlayer(music);
        MusicPlayer player1 = new MusicPlayer(music1);
        player.playMusic();
        player1.playMusic();
        context.close();
    }
}
