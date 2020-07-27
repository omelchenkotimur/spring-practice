package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);\
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        SovietvaweMusic sovietvaweMusic = context.getBean("sovietvaweMusic", SovietvaweMusic.class);

        context.close();
    }
}