package com.cricketscoringsystem.cricketscoringsystem.model.entity;

import jakarta.persistence.Column;
// import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ball")
public class Ball {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ball_id")
    private int ballId;
    
    @ManyToOne
    @JoinColumn(name = "inning_over_id")
    private Inning_Over inning_OverId;

    @Column(name = "runs")
    private int runs;

    public Ball() {
    }
    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }


    public Inning_Over getInning_OverId() {
        return inning_OverId;
    }

    public void setInning_OverId(Inning_Over inning_OverId) {
        this.inning_OverId = inning_OverId;
    }

    public int getBallId() {
        return ballId;
    }

    public void setBallId(int ballId) {
        this.ballId = ballId;
    }

}
