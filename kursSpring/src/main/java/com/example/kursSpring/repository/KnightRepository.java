package com.example.kursSpring.repository;

import java.util.Collection;

import com.example.kursSpring.domain.Knight;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
//@PropertySource("classpath:castle.properties")
public class KnightRepository
{
    Map<String, Knight> knights = new HashMap<>();
    public void KnightRepository(){

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

    @PostConstruct //Metoda, którą chcemy by wykonała się po tym jak Spring zostanie utworzony.
    public void build() {
        createKnight("Lancelot", 29);
        createKnight("Percival", 25);
    }
    @Override
    public String toString() {
        return "KnightRepository{" + "knights=" + knights +"}";
    }
}
