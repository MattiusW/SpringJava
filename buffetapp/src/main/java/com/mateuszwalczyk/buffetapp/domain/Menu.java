package com.mateuszwalczyk.buffetapp.domain;

import org.springframework.stereotype.Component;

@Component
public class Menu {

    private int id;
    private String dish;

    private double price;

    public Menu(){

    }

    public Menu(String dish, double price){
        this.dish = dish;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getDish(){
        return dish;
    }

    public void setDish(String dish){
        this.dish = dish;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }


    public String toString(){
        return " Dish: " + this.dish + ", Price: " + this.price;
    }

}
