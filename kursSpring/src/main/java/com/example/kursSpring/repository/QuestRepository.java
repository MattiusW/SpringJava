package com.example.kursSpring.repository;
import com.example.kursSpring.domain.Quest;
import jakarta.annotation.PostConstruct;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestRepository {

    Random rand = new Random();
    List<Quest> questList = new ArrayList<>();

    public void createQuest(String description){
        questList.add(new Quest(description));
    }

    public List<Quest> getAll(){
        return questList;
    }

    public void deleteQuest(Quest quest){
        questList.remove(quest);
    }

    @PostConstruct
    public void init(){
    }

    //@Scheduled(fixedDelay = 1000) //method delay
    //@Scheduled(fixedRate = 1000) //Opoznienia liczona od momentu uruchomienia
    @Scheduled(fixedDelayString = "${questCreationDelay}") //Przypisanie do propertisow
    public void createRandomQuest(){
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj ksiezniczke");
        descriptions.add("Wez udzial w turnieju");
        descriptions.add("Zabij bande goblinow");
        descriptions.add("Zabij smoka");

        String description = descriptions.get(rand.nextInt(descriptions.size()));
        System.out.println("Utworzylem zadanie o opisie " + description);
        createQuest(description);
    }
    @Override
    public String toString(){
        return "Quest Repository{" + "questList=" + questList + "}";
    }
}
