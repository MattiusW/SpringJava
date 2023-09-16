package com.example.kursSpring.domain;

public class Knight
{
    private String name;
    private int age;
    private Quest quest;

    public Knight(String name, int age, Quest quest) //Wstrzykiwanie zależności poprzez klasę nadrzędną
    {
        this.name = name;
        this.age = age;
        this.quest = quest;
    }
    public Knight(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setQuest(Quest quest) //Wstrzykiwanie zależności poprzez settera, metode
    {
        this.quest = quest;
    }
    @Override
    public String toString()
    {
        return "Knight name " + name + " ( " + age + " ) " + " Zadanie: " + quest;
    }
}
