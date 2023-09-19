package com.example.kursSpring.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:castle.properties")
public class Castle
{
    @Value("${my.castle.name}")
    private String name;
    Knight knight;

    @Autowired
    public Castle(Knight knight)
    {
        this.knight = knight;
    }

    Castle(Knight knight, String name)
    {
        this.knight = knight;
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
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
    @Override
    public String toString()
    {
        return "Znajduje sie tu zamek o nazwie: " + this.name + " Zamieszkaly przez rycerza " + knight;
    }

}
