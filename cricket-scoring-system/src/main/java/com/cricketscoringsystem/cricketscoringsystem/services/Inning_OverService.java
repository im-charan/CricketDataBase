package com.cricketscoringsystem.cricketscoringsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Inning_Over;
import com.cricketscoringsystem.cricketscoringsystem.repository.Innning_OverRepository;

@Service
public class Inning_OverService {
    @Autowired
    private Innning_OverRepository innning_OverRepository;
    
    public List<Inning_Over> getAllInning_Overs(){
        return innning_OverRepository.findAll();
    }
    public Inning_Over getInning_OverById(int Id){
        Optional<Inning_Over> inning_OverOptional = innning_OverRepository.findById(Id);
        return inning_OverOptional.orElse(null);
    }
    public Inning_Over addInning_Over(Inning_Over inning_Over){
        return innning_OverRepository.save(inning_Over);
    }
    public Inning_Over updatInning_Over(int Id,Inning_Over updatedInning_Over){
        Optional<Inning_Over> inning_OverOptional = innning_OverRepository.findById(Id);
        if(inning_OverOptional.isPresent()){
            Inning_Over existingInning_Over = inning_OverOptional.get();
            return innning_OverRepository.save(existingInning_Over); 
        }
        return null;
    }
    public void deleteInning_Over(int Id){
        innning_OverRepository.deleteById(Id);
    }

}
