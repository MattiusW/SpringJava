package com.mateuszwalczyk.gameshop.service;

import com.mateuszwalczyk.gameshop.entity.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameService {

    public void saveGame(Game game);

    public List<Game> getGameQuantity();

    public List<Game> getGameWithQuantityOver(int minQuantity);

    public List<Game> getGameWithName(String regex);

    public List<Game> findByQuantity(Integer quantity);

    public List<Game> findByQuantityBetween(Integer minQ, Integer maxQ);
    public List<Game> findByQuantityGreaterThanEqualOrderByQuantityDesc(Integer minQ);

    public Page<Game> findAll(Pageable pageable);
}
