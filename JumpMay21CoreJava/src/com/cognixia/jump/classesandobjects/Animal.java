package com.cognixia.jump.classesandobjects;

public class Animal {
	
	private double weight;
	private String type;
	
	Animal() {
		weight = 0;
		type = "";
	}
	
	Animal(double weight, String type) {
		this.weight = weight;
		this.type = type;
	}
	
	void sound(String input) {
		System.out.println("Your animal sound is: " + input);
	}
	
	void setType(String type) {
		this.type = type;
	}
	
	String getType() {
		return this.type;
	}
	
	public void	setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", type=" + type + "]";
	}
	
}
