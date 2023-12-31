package com.example.kursspring.domain;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Component
@Scope("prototype")
@Entity
public class Knight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Size(min=2, max=40, message = "Imie rycerza musi miec 2 a 40 znakow")
    private String name;

    @NotNull
    @Range(min = 18, max = 60, message = "Rycerz musi miec co najmniej 18 lat a nie wiecej niz 60")
    private int age;
    private int level;

    @OneToOne
    private Quest quest;

    public Knight(){
        this.level = 1;
    }

    public Knight(String name, int age){
        this.name = name;
        this.age = age;
        this.level = 1;
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
        quest.setStarted(true);
        this.quest = quest;
    }

    public Quest getQuest(){
        return quest;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }

    @Override
    public String toString(){
        return "Rycerz o imieniu " + name + "( " + age + " ) Zadanie: " + quest;
    }
}
