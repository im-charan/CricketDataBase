package com.cricketscoringsystem.cricketscoringsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Ball;
import com.cricketscoringsystem.cricketscoringsystem.repository.BallRepository;

@Service
public class BallService {
    @Autowired
    private BallRepository ballRepository;

    public List<Ball> getAllBalls(){
        return ballRepository.findAll();
    }
    public Ball getBallById(int Id){
        Optional<Ball> ballOptional = ballRepository.findById(Id);
        return ballOptional.orElse(null);
    }
    public Ball addBall(Ball ball){
        return ballRepository.save(ball);
    }
    public Ball updateBall(int Id,Ball updatedBall){
        Optional<Ball> ballOptional = ballRepository.findById(Id);
        if(ballOptional.isPresent()){
            Ball existingBall = ballOptional.get();
            existingBall.setRuns(updatedBall.getRuns());
            return ballRepository.save(existingBall);
        }
        return null;
    }
    public void deleteBall(int Id){
        ballRepository.deleteById(Id);
    }

}
