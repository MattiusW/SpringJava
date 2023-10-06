package com.example.kursspring.domain;

import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastleTest {
    @Test
    public void castleToStringMessage(){
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle(knight, "Castle Black");
        String except = "Zamek nazwa: Castle Black mieszka: Rycerz o imieniu Lancelot( 29 ) Zadanie: Uratuj ksiezniczke";
        assertEquals(except, castle.toString());
    }
}
