package com.example.kursspring;

import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception{

        Quest saveThePrincess = new Quest("Uratuj ksiezniczke");
        Knight lancelot = new Knight("Lancelot", 29, saveThePrincess);
        System.out.println(lancelot);

        Quest killTheDragon = new Quest("Zabij smoka");
        Knight percival = new Knight("Percival", 32);
        percival.setQuest(killTheDragon);
        System.out.println(percival);
    }
}
