package com.example.kursspring;

import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;
    @Override
    public void run(String... args) throws Exception{

        System.out.println(castle);

        Quest saveThePrincess = new Quest("Uratuj ksiezniczke");
        Knight lancelot = new Knight("Lancelot", 29, saveThePrincess);
        System.out.println(lancelot);

        Quest killTheDragon = new Quest("Zabij smoka");
        Knight percival = new Knight("Percival", 32);
        percival.setQuest(killTheDragon);
        System.out.println(percival);
    }
}
