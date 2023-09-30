package com.clockworkjava.kursspring.domain;

public class Knight {
    private String name;
    private int age;

    public Knight(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Rycerz o imieniu " + name + "( " + age + " )";
    }
}
