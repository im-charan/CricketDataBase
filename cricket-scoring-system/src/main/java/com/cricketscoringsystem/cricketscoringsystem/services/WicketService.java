package com.cricketscoringsystem.cricketscoringsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketscoringsystem.cricketscoringsystem.model.entity.Wicket;
import com.cricketscoringsystem.cricketscoringsystem.repository.WicketRepository;

@Service
public class WicketService {
    
    @Autowired
    private WicketRepository wicketRepository;

    public List<Wicket> getAllWickets(){
        return wicketRepository.findAll();
    }
    public Wicket getWicketById(int Id){
        Optional<Wicket> wicketOptional = wicketRepository.findById(Id);
        return wicketOptional.orElse(null);
    }
    public Wicket addWicket(Wicket wicket){
        return wicketRepository.save(wicket);
    }
    public Wicket updateWicket(int Id,Wicket updatedWicket){
        Optional<Wicket> wicketOptional = wicketRepository.findById(Id);
        if(wicketOptional.isPresent()){
            Wicket existingWicket = wicketOptional.get();
            existingWicket.setWicketType(updatedWicket.getWicketType());
            return wicketRepository.save(existingWicket);
        }
        return null;
    }
    public void deleteWicket(int Id){
        wicketRepository.deleteById(Id);
    }

}
