package com.example.kursspring.domain;

import org.springframework.stereotype.Component;

@Component
public class Quest {

    private String description = "Uratuj ksiezniczke";

    public Quest(){
        this.description = description;
    }

    @Override
    public String toString(){
        return description;
    }
}
