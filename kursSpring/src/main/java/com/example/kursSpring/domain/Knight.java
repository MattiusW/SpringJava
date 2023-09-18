package com.example.kursSpring.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Knight
{
    //@Value("Lancelot") Nigdy nie uzywane
    private String name = "Lancelot";
    //@Value("29") Nigdy nie uzywane
    private int age = 29;
    private Quest quest;

    public Knight()
    {

    }

//    public Knight(String name, int age, Quest quest) //Wstrzykiwanie zależności poprzez klasę nadrzędną
//    {
//        this.name = name;
//        this.age = age;
//       this.quest = quest;
//    }
//    public Knight(String name, int age)
//    {
//        this.name = name;
//       this.age = age;
//   }

//    public void setQuest(Quest quest) //Wstrzykiwanie zależności poprzez settera, metode
//    {
//        this.quest = quest;
//    }
    @Override
    public String toString()
    {
        return "Knight name " + name + " ( " + age + " ) ";
    }
}
