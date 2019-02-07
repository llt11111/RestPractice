package com.jersey.restdemo;

import java.util.List;

public class MainAPp {
	public static void main(String[] args) {
		AlienRepo alienRepo = new AlienRepo();
		List<Alien> alienList = alienRepo.getAliens();
		System.out.println(alienList);
		Alien a = new Alien();
		a.setId(111);
		a.setName("NON");
		alienRepo.createAlien(a);
		
		System.out.println(alienList);
	}
}
