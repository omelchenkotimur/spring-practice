package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private SovietvaweMusic sovietvaweMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(SovietvaweMusic sovietvaweMusic, RockMusic rockMusic) {
        this.sovietvaweMusic = sovietvaweMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.SOVIETWAVE) {
            System.out.println(sovietvaweMusic.getSongs().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }
}
/*
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("sovietvaweMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String PlayMusic() {
        return "Playing... " + music1.getSong() + ", " + music2.getSong();
    }
}*/
