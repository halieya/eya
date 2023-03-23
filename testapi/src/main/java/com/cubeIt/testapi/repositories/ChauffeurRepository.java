package com.cubeIt.testapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cubeIt.testapi.models.Chauffeur;

public interface ChauffeurRepository extends MongoRepository<Chauffeur,String>{

}
