package com.adam.dojosandninjas.services;

import java.util.List;

import com.adam.dojosandninjas.models.Dojo;
import com.adam.dojosandninjas.repositories.DojoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DojoService {
    
    @Autowired
    private DojoRepository dojoRepo;

    // get all ninjas
    public List<Dojo> getAlldojos(){
        return dojoRepo.findAll();
    }
    // create a new ninja
    public Dojo createDojo(Dojo newDojo){
        return dojoRepo.save(newDojo);
    }
    // dojo details
    public Dojo dojoDetails(Long id){
        return dojoRepo.findById(id).orElse(null);
    }
}
