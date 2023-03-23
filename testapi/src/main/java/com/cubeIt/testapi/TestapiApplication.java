package com.cubeIt.testapi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.cubeIt.testapi.models.Chauffeur;
import com.cubeIt.testapi.models.TestMission;
import com.cubeIt.testapi.models.Vehicule;
import com.cubeIt.testapi.repositories.ChauffeurRepository;
import com.cubeIt.testapi.repositories.TestRepos;
import com.cubeIt.testapi.repositories.VehiculeRepository;

@SpringBootApplication
public class TestapiApplication implements CommandLineRunner{
	/*
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	*/
	
	private final TestRepos testRepos;

	private final ChauffeurRepository chauffeurRepository;
	
	private final VehiculeRepository vehiculeRepository;
	
	@Autowired
	public TestapiApplication(VehiculeRepository vehiculeRepository,ChauffeurRepository chauffeurRepository,TestRepos testRepos) {
		
		this.vehiculeRepository=vehiculeRepository;
		this.chauffeurRepository=chauffeurRepository;
		this.testRepos=testRepos;

	}

	public static void main(String[] args) {
		SpringApplication.run(TestapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*
	Date date=new Date();
	Chauffeur c1= new Chauffeur("mission1/mission2/mission3/mission4",date);
	Chauffeur c2=new Chauffeur("bengerden/touzir/douz/mednin",date);
	Chauffeur c3=new Chauffeur("gafsa/tunis/sousse/nabeul",date);
	Chauffeur c4=new Chauffeur("bengerden/nabeul/sfax/jalta",date);
	
	List<Chauffeur>c_all=new ArrayList<Chauffeur>();
	c_all.add(c1);c_all.add(c2);c_all.add(c3);c_all.add(c4);
	
	
	
	
	Vehicule vl1=new Vehicule("test chauffeur x1","corolla",date,"4","22000");
	
	chauffeurRepository.saveAll(c_all);
	
	vl1.setChauffeurs(c_all);
	
	vehiculeRepository.save(vl1);*/
		
		
		/*
		TestMission test=new TestMission("test 1 nom","test 2 destination");
		 testRepos.save(test);*/
		
		 
		 
		 Vehicule vl2= vehiculeRepository.findById("6418f7819756b413d187a682").get();
		/*
		vl2.setTest(test);
		vehiculeRepository.save(vl2);*/
		
		System.out.println(vl2.getTest().getNom()+vl2.getTest().getDestination());
		
		
		
		
		/*
		List<Chauffeur>c_all=vl2.getChauffeurs();
		
	       for(Chauffeur c:c_all) {
	    	   System.out.println(c +"\n");
	       }
		*/
		
		
		
		
		
	/*	System.out.println("###########saving vehicules###############");
		
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		*/
		
		
		//restConfiguration.exposeIdsFor(Vehicule.class);
		System.out.println("###########Spring Start###############");
		
		
	}

}
