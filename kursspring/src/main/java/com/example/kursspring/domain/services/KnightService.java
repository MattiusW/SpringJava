package com.example.kursspring.domain.services;

import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class KnightService {

    @Autowired
    KnightRepository knightRepository;

    public List<Knight> getAllKnights(){
        return new ArrayList<>(knightRepository.getAllKnights());
    }
}
