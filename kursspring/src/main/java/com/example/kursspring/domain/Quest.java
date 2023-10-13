package com.example.kursspring.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
