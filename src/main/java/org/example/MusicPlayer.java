package org.example;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private SovietvaweMusic sovietvaweMusic;
    private RockMusic rockMusic;

    public MusicPlayer(SovietvaweMusic sovietvaweMusic, RockMusic rockMusic) {
        this.sovietvaweMusic = sovietvaweMusic;
        this.rockMusic = rockMusic;
    }

    public String PlayMusic() {
        return "Playing... " + sovietvaweMusic.getSong();
    }
}