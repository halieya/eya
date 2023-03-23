package com.cubeIt.testapi.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "chauffeurs")
@Data @NoArgsConstructor @AllArgsConstructor
public class Chauffeur {

	
	  @Id
	    private String id;

	    private String fullname;
	    

	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date datemission;


		public Chauffeur(String fullname, Date datemission) {
			super();
			this.fullname = fullname;
			this.datemission = datemission;
		}
	    
	    
}
