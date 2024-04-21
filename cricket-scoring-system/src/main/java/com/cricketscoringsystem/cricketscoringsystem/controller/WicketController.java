package com.cricketscoringsystem.cricketscoringsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Wicket;
import com.cricketscoringsystem.cricketscoringsystem.services.WicketService;

@RestController
@RequestMapping("/api/wickets")
@CrossOrigin("http://localhost:3000")
public class WicketController {
    @Autowired
    private WicketService wicketService;

    @GetMapping 
    public List<Wicket> getAllWickets(){
        return wicketService.getAllWickets();
    }

    @GetMapping("/{id}")
    public Wicket getWicketByID(@PathVariable int id){
        return wicketService.getWicketById(id);
    }

    @PostMapping
    public Wicket addWicket(@RequestBody Wicket wicket){
        return wicketService.addWicket(wicket);
    }
    
    @PutMapping("/{id}")
    public Wicket updateWicket(@PathVariable int id, @RequestBody Wicket wicket){
        return wicketService.updateWicket(id, wicket);
    }

    @DeleteMapping("/{id}")
    public void deleteWicket(@PathVariable int id){
        wicketService.deleteWicket(id);
    }
}
