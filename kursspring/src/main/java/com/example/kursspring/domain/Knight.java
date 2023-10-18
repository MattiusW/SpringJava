package com.example.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Scope("prototype")
public class Knight {

    private String name;
    private int age;

    private Quest quest;

    public Knight(){
        this.name = "Lancelot";
        this.age = 29;
    }

    public Knight(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        return this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knight knight = (Knight) o;
        return age == knight.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public void setQuest(Quest quest){
        System.out.println("Ustawiam zadanie dla rycerza");
        this.quest = quest;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return "Rycerz o imieniu " + name + "( " + age + " ) Zadanie: " + quest;
    }
}
