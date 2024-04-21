package com.cricketscoringsystem.cricketscoringsystem.model.entity;

// import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private int playerId;
    @Column(name = "player_name")
    private String playerName;
    
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    
    public Player(String playerName, Team team) {
        this.playerName = playerName;
        this.team = team;
    }

    public Player(int playerId, String playerName, Team team) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.team = team;
    }

    public Player() {
    }

    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }


    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    

}
