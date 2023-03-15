package com.cubeIt.testapi.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.cubeIt.testapi.models.Vehicule;

/*
@CrossOrigin("*")
@RestResource*/
public interface VehiculeRepository extends MongoRepository <Vehicule,String>{

	List<Vehicule> findByMarque(String marque);

	List<Vehicule> findByModele(String modele);
    
}
