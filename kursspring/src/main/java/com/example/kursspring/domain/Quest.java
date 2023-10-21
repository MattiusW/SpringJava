package com.example.kursspring.domain;

public class Quest {

    private String description;

    private int reward = 100;

    private int lenght = 20000;

    private boolean started = false;

    private boolean completed = false;

    public Quest(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public boolean isFinish() {
        return completed;
    }

    public void setFinish(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString(){
        return description;
    }
}
