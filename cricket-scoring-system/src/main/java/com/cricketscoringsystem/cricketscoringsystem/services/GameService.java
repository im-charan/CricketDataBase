package com.cricketscoringsystem.cricketscoringsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Game;
import com.cricketscoringsystem.cricketscoringsystem.repository.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    
    public List<Game> getAllGames(){
        return gameRepository.findAll();    
    }

    public Game getGameById(int Id){
        Optional<Game> gameOptional = gameRepository.findById(Id);
        return gameOptional.orElse(null);
    }

    public Game addGame(Game game){
        return gameRepository.save(game);
    }

    public Game updateGame(int Id,Game updatedGame){
        Optional<Game> gameOptional = gameRepository.findById(Id);
        if(gameOptional.isPresent()){
            Game existingGame = gameOptional.get();
            existingGame.setDate(updatedGame.getDate());
            existingGame.setVenue(updatedGame.getVenue());
            return gameRepository.save(existingGame);
        }
        return null;
    }

    public void deleteGame(int Id){
        gameRepository.deleteById(Id);
    }
}

