package com.example.kursSpring;

import com.example.kursSpring.domain.Castle;
import com.clockworkjava.component.TestComponent;
import com.example.kursSpring.domain.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner
{
    //@Autowired
    //TestComponent test;
    @Autowired
    Castle castle;
    @Autowired //Wstrzykiwanie turnieju
    Tournament tournament;
    @Override
    public void run(String... args) throws Exception
    {
        System.out.println(castle);
        tournament.duel();
        System.out.print(tournament);
    }
}
