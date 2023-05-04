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
        gameService.AddGame(new Game(1L, "Grand Theft Auto V", GameType.ACTION, 100, 4.6, " "));
        gameService.AddGame(new Game(2L, "FIFA 23", GameType.SPORT, 220, 2.0, " "));
        gameService.AddGame(new Game(3L, "Dark Souls 3", GameType.ACTION, 250, 5.0, " "));

        Game game = gameService.GetGame(1L).get();
        return game.getName();
    }

    @GetMapping("/games")
    public List<Game> sendGames() {
        //List<Game> games = gameService.GetGame(1L);
        //return games;
        return Collections.emptyList();
    }

}
