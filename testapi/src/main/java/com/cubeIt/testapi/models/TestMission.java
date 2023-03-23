package com.cubeIt.testapi.models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "testmissions")
@Data @NoArgsConstructor @AllArgsConstructor
public class TestMission {
	    @Id
	    private String id;

	    private String nom;
	    private String destination;
		public TestMission(String nom, String destination) {
			super();
			this.nom = nom;
			this.destination = destination;
		}
	    
}
