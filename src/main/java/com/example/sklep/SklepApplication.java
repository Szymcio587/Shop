package com.example.sklep;

import com.example.sklep.model.Game;
import com.example.sklep.model.GameType;
import com.example.sklep.repository.GameRepository;
import com.example.sklep.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
public class SklepApplication {

    public static void main(String[] args) {
        SpringApplication.run(SklepApplication.class, args);
    }

}
