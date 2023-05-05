package com.example.sklep.init;

import com.example.sklep.model.Game;
import com.example.sklep.model.GameType;
import com.example.sklep.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class GamesInitializator implements CommandLineRunner {

    @Autowired
    private GameService gameService;

    public void run(String... args) {
        gameService.AddGame(new Game(1L, "Grand Theft Auto V", GameType.ACTION, 100, 4.6, " "));
        gameService.AddGame(new Game(2L, "FIFA 23", GameType.SPORT, 220, 2.0, " "));
        gameService.AddGame(new Game(3L, "Dark Souls 3", GameType.ACTION, 250, 5.0, " "));
    }
}
