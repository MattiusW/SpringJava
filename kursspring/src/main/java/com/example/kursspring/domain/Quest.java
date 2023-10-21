package com.example.kursspring.domain;

public class Quest {

    private String description;

    public Quest(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return description;
    }
}
