package com.example.kursspring.config;

import com.example.kursspring.domain.repository.DBKnightRepository;
import com.example.kursspring.domain.repository.InMemoryRepository;
import com.example.kursspring.domain.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class MainConfig {

    @Bean("InMemoryKnightRepository")
    public KnightRepository createInMemoryRepo(){
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name="DBRepository")
    public KnightRepository createDBRepo(){
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }

}