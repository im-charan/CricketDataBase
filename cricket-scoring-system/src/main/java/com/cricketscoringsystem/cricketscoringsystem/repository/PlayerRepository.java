package com.cricketscoringsystem.cricketscoringsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>{
    
}
