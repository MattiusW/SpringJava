package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Knight;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class KnightRepository {
    Map<String, Knight> knights = new HashMap<>();

    public KnightRepository(){

    }

    public void createKnight(String name, int age){
        knights.put(name, new Knight(name, age));
    }

    public Collection<Knight> getAllKnights(){
        return knights.values();
    }

    public Knight getKnight(String name){
        return knights.get(name);
    }

    public void deleteKnight(String name){
        knights.remove(name);
    }

    @PostConstruct
    public void build(){
        createKnight("Lancelot" ,29);
        createKnight("Percival" ,24);
    }

    @Override
    public String toString() {
        return "KnightRepository{" +
                "knights=" + knights +
                '}';
    }
}
