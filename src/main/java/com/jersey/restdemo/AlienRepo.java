package com.jersey.restdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlienRepo {
	List<Alien> alienlist ;
	public AlienRepo() {
		// TODO Auto-generated constructor stub
		
		alienlist = new ArrayList<>();
		Alien a1 =  new Alien();
		a1.setName("lalit");
		a1.setId(540);
		
		Alien a2 =  new Alien();
		a2.setName("gagan");
		a2.setId(538);
		
		alienlist.add(a1);
		alienlist.add(a2);
		
	}
	
	public List<Alien> getAliens(){
		return this.alienlist;
	}
	
	public void createAlien(Alien a){
		List<Alien> list = getAliens();
		alienlist.add(a);
		
	}
}
