package com.example.sklep.controller;

import com.example.sklep.model.Game;
import com.example.sklep.model.GameType;
import com.example.sklep.repository.GameRepository;
import com.example.sklep.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class TestController {

    @Autowired
    private GameService gameService;

    @GetMapping("/")
    public String Test() {
        Optional<Game> game = gameService.GetGame(1L);
        if(game.isPresent())
            return game.get().getName();

        return "No games in database";
    }

    @GetMapping("/games")
    public List<Game> sendGames() {
        List<Game> games = gameService.GetAllGames();
        return games;
    }

}
