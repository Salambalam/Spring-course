package org.example;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class ClassicalMusic implements Music {
    public void doMyInit(){
        System.out.println("Doing initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
