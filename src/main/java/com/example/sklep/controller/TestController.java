package com.example.sklep.controller;

import com.example.sklep.mappers.GameMapper;
import com.example.sklep.model.Game;
import com.example.sklep.model.GameDTO;
import com.example.sklep.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TestController {

    @Autowired
    private GameService gameService;

    @Autowired
    private GameMapper gameMapper;

    @GetMapping("/")
    public String Test() {
        Optional<Game> game = gameService.GetGame(1L);
        if(game.isPresent()) {
            GameDTO dto = gameMapper.ConvertGameToDTO(game.get());
            return dto.getName();
        }

        return "No games in database";
    }

    @GetMapping("/games")
    public List<GameDTO> sendGames() {
        return gameService.GetAllGames().stream().map(game -> gameMapper.ConvertGameToDTO(game)).toList();
    }

}
