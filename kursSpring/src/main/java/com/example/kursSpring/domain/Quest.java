package com.example.kursSpring.domain;

import org.springframework.stereotype.Component;
public class Quest
{
    private String description;

    public Quest()
    {
        this.description = "Uratuj ksiezniczke";
    }

    public String toString()
    {
        return description;
    }

}
