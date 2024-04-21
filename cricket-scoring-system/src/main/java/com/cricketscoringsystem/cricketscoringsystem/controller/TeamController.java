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

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Team;
import com.cricketscoringsystem.cricketscoringsystem.services.TeamService;

@RestController
@RequestMapping("/api/teams")
@CrossOrigin("http://localhost:3000")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping
    public List<Team> getAllTeams(){
        return teamService.getAllTeams();
    }

    @GetMapping("/{id}")
    public Team getTeamById(@PathVariable int id){
        return teamService.getTeamById(id);
    }

    @PostMapping
    public Team addTeam(@RequestBody Team team){
        return teamService.addTeam(team);
    }

    @PutMapping("/{id}")
    public Team updateTeam(@PathVariable int id,@RequestBody Team team){
        return teamService.updateTeam(id, team);
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable int id){
        teamService.deleteTeam(id);
    }
}
