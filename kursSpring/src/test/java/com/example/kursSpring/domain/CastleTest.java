package com.example.kursSpring.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastleTest
{
    @Test
    public void castleToStringMessage()
    {
        //Quest quest = new Quest();
        Knight knight = new Knight();
        //knight.setQuest(quest);
        //Castle castle = new Castle(knight, "Castle Black");
        String except = "Znajduje sie tu zamek o nazwie: Castle Black Zamieszkaly przez rycerza Knight name Lancelot ( 29 )  zadanie: Uratuj ksiezniczke";
        //assertEquals(except, castle.toString());
    }
}
