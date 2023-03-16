package org.example;

public class RapMusic implements Music{
    private RapMusic(){}
    // Spring будет использовать паттерн Singleton, несмотря на то что у нас нет проверок на уникальность объека
    public static RapMusic getRapMusic(){
        return new RapMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Oida";
    }
}
