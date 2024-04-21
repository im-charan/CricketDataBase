package com.cricketscoringsystem.cricketscoringsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Game;
import com.cricketscoringsystem.cricketscoringsystem.services.GameService;


@RestController
@RequestMapping("/api/games")
@CrossOrigin("http://localhost:3000")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> getAllGames(){
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable int id) {
        return gameService.getGameById(id);
    }

    @PostMapping
    public Game addGame(@RequestBody Game game){
        return gameService.addGame(game);
    }

    @PutMapping("/{id}")
    public Game updateGame(@PathVariable int id, @RequestBody Game game) {
        return gameService.updateGame(id, game);
    }

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable int id){
        gameService.deleteGame(id); 
    }
    
}
