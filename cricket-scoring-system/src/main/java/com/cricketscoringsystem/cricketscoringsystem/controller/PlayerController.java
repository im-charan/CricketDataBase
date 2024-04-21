package com.cricketscoringsystem.cricketscoringsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Player;
import com.cricketscoringsystem.cricketscoringsystem.services.PlayerService;

import java.util.List;

// import io.micrometer.core.instrument.Meter.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/players")
@CrossOrigin("http://localhost:3000")
public class PlayerController {
    
    @Autowired
    private PlayerService playerService;

    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable int id) {
        return playerService.getPlayerById(id);
    }

    @GetMapping
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @PostMapping
    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }

    @PutMapping("/{id}")
    public Player updatPlayer(@PathVariable int id,@RequestBody Player player) {
        return playerService.updatePlayer(id, player);
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable int id){
        playerService.deletePlayer(id);
    }
    
    
}
