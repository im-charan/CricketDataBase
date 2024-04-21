package com.cricketscoringsystem.cricketscoringsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Team;
import com.cricketscoringsystem.cricketscoringsystem.repository.TeamRepository;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;
    
    public List<Team> getAllTeams(){
        return teamRepository.findAll();
    }

    public Team getTeamById(int Id){
        Optional<Team> teamoOptional = teamRepository.findById(Id);
        return teamoOptional.orElse(null);
    }

    public Team addTeam(Team team){
        return teamRepository.save(team);
    }

    public Team updateTeam(int Id,Team updatedTeam){
        Optional<Team> teamOptional = teamRepository.findById(Id);
        if(teamOptional.isPresent()){
            Team existingTeam = teamOptional.get();
            existingTeam.setTeamName(updatedTeam.getTeamName());
            return teamRepository.save(existingTeam);
        }
        return null;
    }

    public void deleteTeam(int Id){
        teamRepository.deleteById(Id);
    }

}
