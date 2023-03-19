package org.example;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
