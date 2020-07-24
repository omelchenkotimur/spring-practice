package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        SovietvaweMusic sovietvaweMusic = context.getBean("musicBean", SovietvaweMusic.class);
        sovietvaweMusic.getSong();

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer1.PlayMusic();
//
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());
//
//        musicPlayer2.setVolume(15);
//        System.out.println(musicPlayer1.toString());
//        System.out.println(musicPlayer2.toString());
//        boolean sameObject = musicPlayer1 == musicPlayer2;
//        System.out.println(sameObject);
//
//        System.out.println(musicPlayer1.getVolume());
        context.close();
    }
}
