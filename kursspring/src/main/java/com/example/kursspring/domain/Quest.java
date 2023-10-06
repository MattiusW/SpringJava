package com.example.kursspring.domain;

import org.springframework.stereotype.Component;

@Component
public class Quest {

    private String description;

    public Quest(){
        this.description = description = "Uratuj ksiezniczke";
    }

    @Override
    public String toString(){
        return description;
    }
}
