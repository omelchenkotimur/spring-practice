package org.example;

public class SovietvaweMusic implements Music{

    private SovietvaweMusic(){

    }

    public static SovietvaweMusic getSovietMusic (){
        return new SovietvaweMusic();
    }

    public void doMyInit(){
        System.out.println("initialization_");
    }

    public void doMyDestroy(){
        System.out.println("destroying_");
    }

    @Override
    public String getSong() {
        return "Маяк - кольца Сатурна";
    }
}
