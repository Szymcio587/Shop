package com.example.sklep.controller;

import com.example.sklep.repository.GameRepository;
import com.example.sklep.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public String Test() {
        GameRepository gameRepository = new
        gameService = new GameService();
        gameService.
    }
}
