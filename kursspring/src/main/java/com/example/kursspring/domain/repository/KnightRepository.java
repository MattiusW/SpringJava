package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Knight;
import jakarta.annotation.PostConstruct;
import jdk.jshell.spi.ExecutionControl;

import java.util.Collection;
import java.util.Optional;

public interface KnightRepository {
    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Optional<Knight> getKnight(String name);

    void deleteKnight(Integer id);

    void build();

    Knight getKnightById(Integer id);

    void createKnight(Knight knight);

    default void updateKnight(int id, Knight knight) {throw new UnsupportedOperationException();};
}
