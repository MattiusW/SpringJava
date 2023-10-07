package com.example.kursspring;

import com.clockworkjava.component.TestComponent;
import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    TestComponent test;
    @Autowired
    Castle castle;
    @Override
    public void run(String... args) throws Exception{

        System.out.println(castle);

    }
}
