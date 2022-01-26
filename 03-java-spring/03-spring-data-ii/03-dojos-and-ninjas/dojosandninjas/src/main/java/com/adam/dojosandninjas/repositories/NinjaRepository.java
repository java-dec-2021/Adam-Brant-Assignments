package com.adam.dojosandninjas.repositories;
import java.util.List;

import com.adam.dojosandninjas.models.Ninja;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    
    // get all ninjas
    List<Ninja> findAll();
}
