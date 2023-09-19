package com.example.kursSpring;

public enum PersonUtils
{
    INSTANCE;

    public final String operation(Person person) {
        return person.name.toUpperCase();
    }
}
