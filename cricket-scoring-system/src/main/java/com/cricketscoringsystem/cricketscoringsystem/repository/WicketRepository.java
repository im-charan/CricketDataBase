package com.cricketscoringsystem.cricketscoringsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Wicket;

@Repository
public interface WicketRepository extends JpaRepository<Wicket,Integer>{
    
}
