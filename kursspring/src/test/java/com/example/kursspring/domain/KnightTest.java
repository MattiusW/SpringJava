package com.example.kursspring.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class KnightTest {

    @Test
    public void testIfQuestMarkedAsStarted(){
        Knight knight = new Knight("Percival", 29);
        Quest quest = new Quest("Testowe zadanie");

        knight.setQuest(quest);

        assertTrue(knight.getQuest().isStarted());
    }
}
