package com.example.kursspring.config;

import com.example.kursspring.domain.repository.DBKnightRepository;
import com.example.kursspring.domain.repository.InMemoryRepository;
import com.example.kursspring.domain.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class MainConfig {

    @Bean(name="InMemoryKnightRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepo(){
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name="DBKnightRepository")
    @Profile("prod")
    public KnightRepository createDBRepo(){
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }

}