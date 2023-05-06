package com.example.sklep;

import com.example.sklep.model.Game;
import com.example.sklep.model.GameType;
import com.example.sklep.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
public class ShopApplication implements CommandLineRunner {

    private GameService gameService;

    @Autowired
    public ShopApplication(GameService gameService) {
        this.gameService = gameService;
    }
    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        if(gameService.GetAllGames().isEmpty()) {
            gameService.AddGame(new Game(1L, "Grand Theft Auto V", GameType.ACTION, 100, 4.6, " "));
            gameService.AddGame(new Game(2L, "FIFA 23", GameType.SPORT, 220, 2.0, " "));
            gameService.AddGame(new Game(3L, "Dark Souls 3", GameType.ACTION, 250, 5.0, " "));
        }

    }
}
