package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SovietvaweMusic implements Music{
    @PostConstruct
    public void doMyInit(){
        System.out.println("Initialization...");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destroying...");
    }

    @Override
    public String getSong() {
        return "Маяк - кольца Сатурна";
    }
}
