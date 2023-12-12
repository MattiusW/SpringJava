package com.mateuszwalczyk.gameshop.controller;

import com.mateuszwalczyk.gameshop.entity.Game;
import com.mateuszwalczyk.gameshop.service.GameService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    private static final int PAGE_SIZE = 3;

    @Autowired
    GameService gameService;
    @RequestMapping("/")
    public List<Game> index(HttpServletResponse response) {
        return gameService.findByQuantityGreaterThanEqualOrderByQuantityDesc(5);
    }

    @RequestMapping("/minQuantityGame")
    public List<Game> GameWithQuantity(@RequestParam(name="quantity") Optional<Integer> quantityParam){
        int quantity = 1;
        //If quantity is not pass, set default value
        if(quantityParam.isPresent()){
            quantity = quantityParam.get();
        }

        return gameService.getGameWithQuantityOver(quantity);
    }

    //Find by name game
    @RequestMapping("/find_by_name")
    public List<Game> findByName(){
        String regexName = "M%";
        List<Game> result = gameService.getGameWithName(regexName);
        return result;
    }

    //Sorting page
    @RequestMapping("/games")
    public List<Game> games(@RequestParam(defaultValue = "0") String page){
        int currentPage = Integer.parseInt(page);
        PageRequest pageRequest = PageRequest.of(currentPage, PAGE_SIZE);

        Page<Game> games = gameService.findAll(pageRequest);

        return games.getContent();
    }
}
