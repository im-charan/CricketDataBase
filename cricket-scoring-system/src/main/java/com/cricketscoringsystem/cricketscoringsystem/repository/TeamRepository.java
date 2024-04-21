package com.cricketscoringsystem.cricketscoringsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team,Integer>{

}
