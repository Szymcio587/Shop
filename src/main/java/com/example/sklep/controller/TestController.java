package com.example.sklep.controller;

import com.example.sklep.model.Game;
import com.example.sklep.model.GameType;
import com.example.sklep.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/")
    public String Test() {
        System.out.println("Adding games...");
        gameRepository.save(new Game(1L, "Grand Theft Auto V", GameType.ACTION, 100, 4.6, " "));
        gameRepository.save(new Game(2L, "FIFA 23", GameType.SPORT, 220, 2.0, " "));
        gameRepository.save(new Game(3L, "Dark Souls 3", GameType.ACTION, 250, 5.0, " "));

        Game returned = gameRepository.findById(1L).get();

        return "The name of the first game is " + returned.getName();
    }
}
