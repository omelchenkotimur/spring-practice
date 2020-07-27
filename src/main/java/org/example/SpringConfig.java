package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("musicPlayer.properties")
public class SpringConfig {
    @Bean
    public SovietvaweMusic sovietvaweMusic(){
        return new SovietvaweMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(sovietvaweMusic(),rockMusic());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
