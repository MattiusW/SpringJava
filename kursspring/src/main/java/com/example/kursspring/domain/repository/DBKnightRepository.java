package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Knight;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Collection;

public class DBKnightRepository implements KnightRepository {
    @Override
    public void createKnight(String name, int age){
        System.out.println("Uzywam bazy danych");
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Collection<Knight> getAllKnights(){
        System.out.println("Uzywam bazy danych");
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Knight getKnight(String name){
        System.out.println("Uzywam bazy danych");
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void deleteKnight(String name){
        System.out.println("Uzywam bazy danych");
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @PostConstruct
    public void build(){

    }
}
