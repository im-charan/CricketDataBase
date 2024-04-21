package com.cricketscoringsystem.cricketscoringsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Inning_Over;

@Repository
public interface Innning_OverRepository extends JpaRepository<Inning_Over,Integer>{

}
