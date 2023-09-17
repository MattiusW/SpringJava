package com.example.kursSpring.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Castle
{
    private String name = "East Watch";
    public Castle()
    {

    }

    @PostConstruct //Metoda, którą chcemy by wykonała się po tym jak Spring zostanie utworzony.
    public void build()
    {
        System.out.println("Wybudowano zamek " + name);
    }

    @PreDestroy //Metoda chcemy aby otworzyła się przed tym jak obiekt zostanie zniszczony.
    public void tearDown()
    {
        System.out.println("Zaraz wyburzymy zamek " + name);
    }
}
