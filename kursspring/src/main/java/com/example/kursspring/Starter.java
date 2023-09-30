package com.example.kursspring;

import com.example.kursspring.domain.Knight;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception{
        Knight lancelot = new Knight("Lancelot", 29);
        System.out.println(lancelot);
    }
}
