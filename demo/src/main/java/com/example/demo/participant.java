package com.example.demo;

public class participant {

private String name;
	
public participant(String name) {
	// TODO Auto-generated constructor stub
	this.name=name;
}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "user [name=" + name + "]";
	}
	
	


}
