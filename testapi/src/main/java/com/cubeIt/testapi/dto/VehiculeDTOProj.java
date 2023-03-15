package com.cubeIt.testapi.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

public interface VehiculeDTOProj {

	
	@Value("#{targetid}")
	String getId();
	String getMarque();
	String getModele();
	
	
	Date getDatefab();
}
