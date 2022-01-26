package com.adam.dojosandninjas.repositories;

import java.util.List;

import com.adam.dojosandninjas.models.Dojo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
    
    // get all dojos
    List<Dojo> findAll();
}
