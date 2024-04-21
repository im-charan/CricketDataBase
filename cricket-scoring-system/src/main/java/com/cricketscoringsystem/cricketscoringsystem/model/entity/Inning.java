package com.cricketscoringsystem.cricketscoringsystem.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inning")
public class Inning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inning_id")
    private int inningId;

    @ManyToOne
    @JoinColumn(name = "batting_team_id")
    private Team battingTeam;

    @ManyToOne
    @JoinColumn(name = "bowling_team_id")
    private Team bowlingTeam;
    
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    
    public Inning(Team battingTeam, Team bowlingTeam, Game game) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.game = game;
    }
    public Inning() {
    }
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }


    public Team getBowlingTeam() {
        return bowlingTeam;
    }

    public void setBowlingTeam(Team bowlingTeam) {
        this.bowlingTeam = bowlingTeam;
    }

    public Team getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(Team battingTeam) {
        this.battingTeam = battingTeam;
    }



    public int getInningId() {
        return inningId;
    }

    public void setInningId(int inningId) {
        this.inningId = inningId;
    }

}
