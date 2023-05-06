package com.example.sklep.mappers;

import com.example.sklep.model.Game;
import com.example.sklep.model.GameDTO;
import org.springframework.stereotype.Service;

@Service
public class GameMapper {

    public Game ConvertDTOToGame(GameDTO dto) {
        Game game = new Game();
        game.setId(dto.getId());
        game.setName(dto.getName());
        game.setType(dto.getType());
        game.setPrice(dto.getPrice());
        game.setNote(dto.getNote());
        game.setDescription(dto.getDescription());
        return game;
    }

    public GameDTO ConvertGameToDTO(Game game) {
        GameDTO dto = new GameDTO();
        dto.setId(game.getId());
        dto.setName(game.getName());
        dto.setType(game.getType());
        dto.setPrice(game.getPrice());
        dto.setNote(game.getNote());
        dto.setDescription(game.getDescription());
        return dto;
    }
}
