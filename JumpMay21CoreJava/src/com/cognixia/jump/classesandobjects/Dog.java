package com.cognixia.jump.classesandobjects;

public class Dog extends Animal {
	
	String color;
	String breed;
	boolean shedding;
	
	Collar collar;

	Dog() {
		super(0, "dog");
		this.collar = new Collar();
		this.color = "N/A";
		this.breed = "N/A";
		this.shedding = false;
	}

	public Dog(double weight, String type, String color, String breed, boolean shedding) {
		super(weight, type);
		this.color = color;
		this.breed = breed;
		this.shedding = shedding;
	}
	
}
