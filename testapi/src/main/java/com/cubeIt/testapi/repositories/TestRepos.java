package com.cubeIt.testapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cubeIt.testapi.models.TestMission;

public interface TestRepos extends MongoRepository<TestMission,String>{

}
