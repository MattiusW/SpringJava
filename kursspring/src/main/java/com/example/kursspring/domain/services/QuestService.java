package com.example.kursspring.domain.services;

import com.example.kursspring.domain.Quest;
import com.example.kursspring.domain.repository.InMemoryRepository;
import com.example.kursspring.domain.repository.KnightRepository;
import com.example.kursspring.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class QuestService {

    @Autowired
    KnightRepository knightRepository;

    QuestRepository questRepository;

    @Autowired
    final static Random rand = new Random();

    public void assignRandomQuest(String knightName){
        List<Quest> allQuest = questRepository.getAll();
        Quest randomQuest = allQuest.get(rand.nextInt(allQuest.size()));
        knightRepository.getKnight(knightName).ifPresent(knight -> knight.setQuest(randomQuest));
    }

    public List<Quest> getAllNotStartedQuest() {
        return questRepository.getAll().stream().filter(quest -> !quest.isStarted()).collect(Collectors.toList());
    }

    @Autowired
    public void setQuestRepository(QuestRepository questRepository){
        this.questRepository = questRepository;
    }
}
