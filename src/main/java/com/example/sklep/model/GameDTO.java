package com.example.sklep.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {

    private Long id;
    private String name;
    private GameType type;
    private double price;
    private double note;
    private String description;
}
