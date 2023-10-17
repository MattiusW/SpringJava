package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Knight;
import jakarta.annotation.PostConstruct;

import java.util.Collection;

public interface KnightRepository {
    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Knight getKnight(String name);

    void deleteKnight(String name);

    void build();
}
