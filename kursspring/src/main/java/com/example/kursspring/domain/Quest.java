package com.example.kursspring.domain;

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
