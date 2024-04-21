package com.cricketscoringsystem.cricketscoringsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Player;
import com.cricketscoringsystem.cricketscoringsystem.repository.PlayerRepository;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Player getPlayerById(int Id){
        Optional<Player> playerOptional = playerRepository.findById(Id);
        return playerOptional.orElse(null);
    }

    public Player addPlayer(Player player){
        return playerRepository.save(player);
    }

    public Player updatePlayer(int Id,Player updatedPlayer){
        Optional<Player> playerOptional = playerRepository.findById(Id);
        if(playerOptional.isPresent()){
            Player existingPlayer = playerOptional.get();
            existingPlayer.setPlayerName(updatedPlayer.getPlayerName());
            return playerRepository.save(existingPlayer);
        }
        return null;
    }

    public void deletePlayer(int Id){
        playerRepository.deleteById(Id);
    }
}
