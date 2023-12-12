package com.mateuszwalczyk.gameshop.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGame;
    private String name;
    private BigDecimal price;
    private Integer quantity;
    public Game(){

    }
    Game(Long idGame, String name, BigDecimal price, Integer quantity){
        this.idGame = idGame;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static class GameBuilder {
        private Long idGame;
        private String name;
        private BigDecimal price;
        private Integer quantity;

        public GameBuilder setIdGame(Long idGame) {
            this.idGame = idGame;
            return this;
        }
        public GameBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public GameBuilder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public GameBuilder setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        public Game buildGame(){
            return new Game(idGame, name, price, quantity);
        }
    }

    public Long getIdGame() {
        return idGame;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public Integer getQuantity() {
        return quantity;
    }
}
