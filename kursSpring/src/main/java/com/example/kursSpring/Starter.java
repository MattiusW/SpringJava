package com.example.kursSpring;

import com.example.kursSpring.domain.Knight;
import com.example.kursSpring.domain.Quest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner
{
    @Override
    public void run(String... args) throws Exception
    {
        Quest savePrincess = new Quest("Save princess");
        Quest dragonKilling = new Quest("Kill the Dragon");
        Knight lancelot = new Knight("Lancelot", 29, savePrincess); //Wstrzykiwanie zależności
        Knight percival = new Knight("Percival", 32);

        System.out.println(lancelot);
        System.out.println(percival);
        percival.setQuest(dragonKilling); //Wstrzykiwanie przez metode
        System.out.println(percival);

    }
}
