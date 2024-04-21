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
@Table(name = "wicket")
public class Wicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wicket_id")
    private int wicketId;

    @Column(name = "wicket_type")
    private String wicketType;

    @ManyToOne
    @JoinColumn(name = "ball_id")
    private Ball ball;
    
    public Wicket() {
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }


    public int getWicketId() {
        return wicketId;
    }
    public void setWicketId(int wicketId) {
        this.wicketId = wicketId;
    }
    public String getWicketType() {
        return wicketType;
    }
    public void setWicketType(String wicketType) {
        this.wicketType = wicketType;
    }
}
