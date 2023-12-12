package com.mateuszwalczyk.gameshop.repository;

import com.mateuszwalczyk.gameshop.entity.Game;
import com.mateuszwalczyk.gameshop.service.GameService;
import com.mateuszwalczyk.gameshop.service.impl.GameServiceImplements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameRepositoryTest {

    @InjectMocks
    private GameServiceImplements gameServiceImplements;

    @Mock
    private GameRepository gameRepository;

    @Test
    public void testGetGameQuantity(){
        List<Game> mockGames = new ArrayList<>();

        Game game1 = new Game.GameBuilder()
                .setIdGame(1L)
                .setName("Factorio")
                .setPrice(new BigDecimal(33.00).setScale(2, RoundingMode.HALF_UP))
                .setQuantity(20)
                .buildGame();

        Game game2 = new Game.GameBuilder()
                .setIdGame(2L)
                .setName("CyberPunk")
                .setPrice(new BigDecimal(129.50).setScale(2, RoundingMode.HALF_UP))
                .setQuantity(10)
                .buildGame();

        mockGames.add(game1);
        mockGames.add(game2);

        when(gameRepository.getGameQuantity()).thenReturn(mockGames);

        List<Game> result = gameServiceImplements.getGameQuantity();
        assertEquals(mockGames,result);
    }

}
