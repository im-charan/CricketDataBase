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
@Table(name = "inning_over")
public class Inning_Over {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inning_over_id")
    private int inning_OverId;
    
    
    @ManyToOne 
    @JoinColumn(name = "inning_id")
    private Inning inning;
    
    public Inning_Over() {
    }
    
    public Inning getInning() {
        return inning;
    }

    public void setInning(Inning inning) {
        this.inning = inning;
    }
    
    public int getInning_OverId() {
        return inning_OverId;
    }
    
    public void setInning_OverId(int inning_OverId) {
        this.inning_OverId = inning_OverId;
    }
    
}
