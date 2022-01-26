package com.adam.dojosandninjas.services;

import java.util.List;

import com.adam.dojosandninjas.models.Ninja;
import com.adam.dojosandninjas.repositories.NinjaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {
    
    @Autowired
    private NinjaRepository ninjaRepo;

    // get all ninjas
    public List<Ninja> getAllninjas(){
        return ninjaRepo.findAll();
    }
    // create a new ninja
    public Ninja createNinja(Ninja newNinja){
        return ninjaRepo.save(newNinja);
    }
    // update a ninja
    public Ninja updateNinja(Ninja ninja){
        return ninjaRepo.save(ninja);
    }
    // delete a ninja
    public void deleteNinja(Long id){
        ninjaRepo.deleteById(id);
    }
    // ninja details
    public Ninja ninjaDetails(Long id){
        return ninjaRepo.findById(id).orElse(null);
    }
}
