package com.jersey.restdemo;

import javax.xml.bind.annotation.XmlRootElement;

// URL :::    http://localhost:8080/restdemo/aliens


@XmlRootElement
public class Alien {
	private int id; 
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " id  : "+ this.getId() + " name : "+ this.getName() + " \n";
	}
}
