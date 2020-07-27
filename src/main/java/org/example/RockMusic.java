package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Manowar - Number One");
        songs.add("Metallica - fuel");
        songs.add("Grave Digger - Round table");

    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
