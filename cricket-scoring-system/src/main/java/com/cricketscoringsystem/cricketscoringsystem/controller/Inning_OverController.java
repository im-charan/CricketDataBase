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

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Inning_Over;
import com.cricketscoringsystem.cricketscoringsystem.services.Inning_OverService;

@RestController
@RequestMapping("/api/inning_overs")
@CrossOrigin("http://localhost:3000")
public class Inning_OverController {
    @Autowired
    private Inning_OverService inning_OverService;

    @GetMapping
    public List<Inning_Over> getAllInning_Overs(){
        return inning_OverService.getAllInning_Overs();
    }

    @GetMapping("/{id}")
    public Inning_Over getInning_OverById(@PathVariable int id){
        return inning_OverService.getInning_OverById(id);
    }

    @PostMapping
    public Inning_Over addInning_Over(@RequestBody Inning_Over inning_Over){
        return inning_OverService.addInning_Over(inning_Over);
    }

    @PutMapping("/{id}")
    public Inning_Over updateInning_Over(@PathVariable int id,@RequestBody Inning_Over inning_Over){
        return inning_OverService.updatInning_Over(id, inning_Over);
    }

    @DeleteMapping("/{id}")
    public void deleteInning_Over(@PathVariable int id){
        inning_OverService.deleteInning_Over(id);
    }
}
