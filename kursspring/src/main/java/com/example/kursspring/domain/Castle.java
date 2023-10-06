package com.example.kursspring.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:castle.properties")
public class Castle {

    @Value("${my.castle.name:East Watch}")
    private String name;

    @Autowired
    Knight knight;
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
        return "Zamek nazwa: " + this.name + " mieszka: " + knight;
    }

}
