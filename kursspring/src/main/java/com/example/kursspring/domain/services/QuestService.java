package com.example.kursspring.domain.services;

import com.example.kursspring.domain.Quest;
import com.example.kursspring.domain.repository.KnightRepository;
import com.example.kursspring.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    final static Random rand = new Random();

    public void assignRandomQuest(String knightName){
        List<Quest> allQuest = questRepository.getAll();
        Quest randomQuest = allQuest.get(rand.nextInt(allQuest.size()));
        knightRepository.getKnight(knightName).setQuest(randomQuest);
    }

}
