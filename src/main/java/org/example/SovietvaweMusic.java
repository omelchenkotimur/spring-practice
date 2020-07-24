package org.example;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class SovietvaweMusic implements Music{

    @Override
    public String getSong() {
        return "Маяк - кольца Сатурна";
    }
}
