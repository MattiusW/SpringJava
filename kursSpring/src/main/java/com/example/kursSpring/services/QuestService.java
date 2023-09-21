package com.example.kursSpring.services;

import com.example.kursSpring.domain.Knight;
import com.example.kursSpring.repository.KnightRepository;
import com.example.kursSpring.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.kursSpring.domain.Quest;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.List;

//Klasa bezstanowe, komponenty springowe zawieraja zestaw publicznych metod, ktore obsluguja operacje biznesowe
@Service
public class QuestService {
    @Autowired
    KnightRepository knightRepository;
    @Autowired
    QuestRepository questRepository;

    final static Random rand = new Random();

    //W tej metodzie tworzymy logike biznesowa
    public void assignRandomQuest(String knightName){
        List<Quest> allQuest = questRepository.getAll();
        Quest randomQuest = allQuest.get(rand.nextInt(allQuest.size()));
        knightRepository.getKnight(knightName).setQuest(randomQuest);
        questRepository.deleteQuest(randomQuest);
    }
}
