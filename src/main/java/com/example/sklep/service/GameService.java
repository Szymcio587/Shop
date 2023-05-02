package com.example.sklep.service;

import com.example.sklep.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GameService {

    @Autowired
    GameRepository gameRepository;


}
