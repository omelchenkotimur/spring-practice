package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Manowar - Number One";
    }
}
