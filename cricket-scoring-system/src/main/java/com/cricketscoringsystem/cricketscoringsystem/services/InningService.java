package com.cricketscoringsystem.cricketscoringsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Game;
import com.cricketscoringsystem.cricketscoringsystem.model.entity.Inning;
import com.cricketscoringsystem.cricketscoringsystem.repository.GameRepository;
import com.cricketscoringsystem.cricketscoringsystem.repository.InningRepository;

@Service
public class InningService {
    @Autowired
    private InningRepository inningRepository;

    @Autowired
    private GameRepository gameRepository;


    public List<Inning> getAllInnings(){
        return inningRepository.findAll();
    }

    public Inning getInningById(int Id){
        Optional<Inning> inningOptional = inningRepository.findById(Id);
        return inningOptional.orElse(null);
    }

    public Inning addInning(Inning inning) {
        if (inning == null) {
            throw new IllegalArgumentException("Inning object cannot be null");
        }
    
        Game existingGame = inning.getGame();
        if (existingGame != null && existingGame.getGameId() == 0) {
            // If the Game entity is not yet persisted, save it first
            existingGame = gameRepository.save(existingGame);
            // Set the saved Game entity back to the Inning object
            inning.setGame(existingGame);
        }
    
        // Save the Inning entity
        return inningRepository.save(inning);
    }
    

    public Inning updateInning(int Id,Inning updatedInning){
        Optional<Inning> inningOptional = inningRepository.findById(Id);
        if(inningOptional.isPresent()){
            Inning existingInning = inningOptional.get();
            Game existingGame = existingInning.getGame();

            // Update the game details from the updated inning
            existingGame.setDate(updatedInning.getGame().getDate());
            existingGame.setVenue(updatedInning.getGame().getVenue());

            // Save the updated game
            Game savedGame = gameRepository.save(existingGame);
            existingInning.setGame(savedGame);
            return inningRepository.save(existingInning);
        }
        return null;
    }

    public void deleteInning(int Id){
        inningRepository.deleteById(Id);
    }
}
