package com.mateuszwalczyk.gameshop.service.impl;

import com.mateuszwalczyk.gameshop.entity.Game;
import com.mateuszwalczyk.gameshop.repository.GamePagingAndSortingRepository;
import com.mateuszwalczyk.gameshop.repository.GameRepository;
import com.mateuszwalczyk.gameshop.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImplements implements GameService {

    @Autowired
    GameRepository gameRepository;

    @Autowired
    GamePagingAndSortingRepository gamePagingAndSortingRepository;

    @Override
    public void saveGame(Game game) {
        gameRepository.save(game);
    }

    @Override
    public List<Game> getGameQuantity() {
        return gameRepository.getGameQuantity();
    }

    @Override
    public List<Game> getGameWithQuantityOver(int minQuantity) {
        return gameRepository.getGameWithQuantityOver(minQuantity);
    }

    @Override
    public List<Game> getGameWithName(String regex) {
        return gameRepository.getGameWithName(regex);
    }

    @Override
    public List<Game> findByQuantity(Integer quantity) {
        return gameRepository.findByQuantity(quantity);
    }

    @Override
    public List<Game> findByQuantityBetween(Integer minQ, Integer maxQ) {
        return gameRepository.findByQuantityBetween(minQ, maxQ);
    }

    @Override
    public List<Game> findByQuantityGreaterThanEqualOrderByQuantityDesc(Integer minQ) {
        return gameRepository.findByQuantityGreaterThanEqualOrderByQuantityDesc(minQ);
    }

    @Override
    public Page<Game> findAll(Pageable pageable) {
        return gamePagingAndSortingRepository.findAll(pageable);
    }

}
