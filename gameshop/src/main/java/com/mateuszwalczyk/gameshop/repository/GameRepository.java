package com.mateuszwalczyk.gameshop.repository;

import com.mateuszwalczyk.gameshop.entity.Game;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameRepository extends CrudRepository<Game, Long> {

    //Get all game list
    @Query("SELECT game FROM Game game")
    public List<Game> getGameQuantity();

    //Get game with min value
    @Query("SELECT game FROM Game game WHERE game.quantity > :minQuantity")
    public List<Game> getGameWithQuantityOver(@Param("minQuantity")int minQuantity);

    @Query("SELECT game FROM Game game WHERE game.name like :regex")
    public List<Game> getGameWithName(@Param("regex") String regex);

    public List<Game> findByQuantity(Integer quantity);

    public List<Game> findByQuantityBetween(Integer minQ, Integer maxQ);

    public List<Game> findByQuantityGreaterThanEqualOrderByQuantityDesc(Integer minQ);

}
