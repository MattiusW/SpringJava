package com.example.kursSpring;

public class WzorzecSingleton {

    private static WzorzecSingleton instance = null;

    //utworzenie prywatnego konstruktora aby nie było do niego dostępu
    private WzorzecSingleton(){

    }

    //Metoda pobierajaca i zwracajaca instance
    public WzorzecSingleton getInstance(){
        if(instance == null){
            instance = new WzorzecSingleton();
        }

        return instance;
    }

    public final String operation(Person person){
        return person.name.toUpperCase();
    }

}
