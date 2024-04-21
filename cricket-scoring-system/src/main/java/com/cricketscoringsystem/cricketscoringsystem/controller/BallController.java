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

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Ball;
import com.cricketscoringsystem.cricketscoringsystem.services.BallService;

@RestController
@RequestMapping("/api/balls")
@CrossOrigin("http://localhost:3000")
public class BallController {
    @Autowired
    private BallService ballService;

    @GetMapping
    public List<Ball> getAllBalls(){
        return ballService.getAllBalls();
    }

    @GetMapping("/{id}")
    public Ball getBallById(@PathVariable int id){
        return ballService.getBallById(id);
    }

    @PostMapping
    public Ball addBall(@RequestBody Ball ball){
        return ballService.addBall(ball);
    }

    @PutMapping("/{id}")
    public Ball updateBall(@PathVariable int id,@RequestBody Ball ball){
        return ballService.updateBall(id, ball);
    }

    @DeleteMapping("/{id}")
    public void deleteBall(@PathVariable int id){
        ballService.deleteBall(id);
    }
}
