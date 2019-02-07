package com.jersey.restdemo;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("aliens")
public class AlienResource {
	AlienRepo alienRepo = new AlienRepo();
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public List<Alien> getAliens(){
		System.out.println("getAliens ..");
		
		return alienRepo.getAliens();
	}
	
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien a){
		System.out.println("createAlien");
		alienRepo.createAlien(a);
		return a;
	}
	
}
