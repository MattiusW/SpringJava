package com.example.kursspring.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Castle {

    private String name = "East Watch";

    public Castle(){

    }

    @PostConstruct
    public void build(){
        System.out.println("Wybudowano zamek " + name);
    }

    @PreDestroy
    public void tearDown() {
        System.out.println("Zaraz wyburzymy zamek " + name);
    }

    @Override
    public String toString() {
        return "Zamek nazwa: " + this.name;
    }

}