package com.example.sklep;

import com.example.sklep.model.Game;
import com.example.sklep.model.GameType;
import com.example.sklep.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
public class SklepApplication {

    @Autowired
    GameRepository gameRepository;

    public static void main(String[] args) {
        SpringApplication.run(SklepApplication.class, args);
    }

    public void run(String... args) {
        AddGames();
        ShowAllGames();
    }

    public void AddGames() {
        System.out.println("Adding games...");
        gameRepository.save(new Game(1L, "Grand Theft Auto V", GameType.ACTION, 100, 4.6, " "));
        gameRepository.save(new Game(2L, "FIFA 23", GameType.SPORT, 220, 2.0, " "));
        gameRepository.save(new Game(3L, "Dark Souls 3", GameType.ACTION, 250, 5.0, " "));
    }

    public void ShowAllGames() {
        gameRepository.findAll().forEach(game -> System.out.print(game));
    }

}
