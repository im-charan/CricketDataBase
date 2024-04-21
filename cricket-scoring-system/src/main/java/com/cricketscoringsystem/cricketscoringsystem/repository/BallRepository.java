package com.cricketscoringsystem.cricketscoringsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Ball;

@Repository
public interface BallRepository extends JpaRepository<Ball,Integer>{
    
}
