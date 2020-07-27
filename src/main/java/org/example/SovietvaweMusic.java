package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SovietvaweMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Маяк - Кольца Сатурна");
        songs.add("ППВК - Волны");
        songs.add("Электроника - Юность");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
