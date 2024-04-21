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

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Inning;
import com.cricketscoringsystem.cricketscoringsystem.services.InningService;

@RestController
@RequestMapping("/api/innings")
@CrossOrigin("http://localhost:3000")
public class InningController {
    
    @Autowired
    private InningService inningService;

    @GetMapping 
    public List<Inning> getAllInnings(){
        return inningService.getAllInnings();
    }

    @GetMapping("/{id}")
    public Inning getInningById(@PathVariable int id){
        return inningService.getInningById(id);
    }

    @PostMapping
    public Inning addInning(@RequestBody Inning inning){
        return inningService.addInning(inning);
    }

    @PutMapping("/{id}")
    public Inning updateInning(@PathVariable int id,@RequestBody Inning inning){
        return inningService.updateInning(id, inning);
    }

    @DeleteMapping("/{id}")
    public void deleteInning(@PathVariable int id){
        inningService.deleteInning(id);
    }
}
