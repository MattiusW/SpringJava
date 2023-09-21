package com.example.kursSpring.domain;

import java.util.Objects;

//@Component
//@Scope("prototype") //Wstrzykiwanie nowej instancji
public class Knight
{
    //@Value("Lancelot") Nigdy nie uzywane
    private String name;
    //@Value("29") Nigdy nie uzywane
    private int age;
    private Quest quest;

    public Knight()
    {
        this.name = "Lancelot";
        this.age = 29;
    }

//    public Knight(String name, int age, Quest quest) //Wstrzykiwanie zależności poprzez klasę nadrzędną
//    {
//        this.name = name;
//        this.age = age;
//       this.quest = quest;
//    }
    public Knight(String name, int age)
    {
       this.name = name;
       this.age = age;
    }
    public void setQuest(Quest quest) //Wstrzykiwanie zależności poprzez settera, metode
    {
        System.out.println("Ustawiam zadanie dla rycerza");
        this.quest = quest;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    @Override
    public String toString()
    {
        return "Knight name " + name + " ( " + age + " ) " + " zadanie: " + quest;
    }
}
