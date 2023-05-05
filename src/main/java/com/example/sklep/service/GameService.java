package com.example.sklep.service;

import com.example.sklep.model.Game;
import com.example.sklep.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public Optional<Game> GetGame(Long id) {
        return gameRepository.findById(id);
    }

    public List<Game> GetAllGames() {
        return gameRepository.findAll();
    }

    public void AddGame(Game game) {
        gameRepository.save(game);
    }

}
