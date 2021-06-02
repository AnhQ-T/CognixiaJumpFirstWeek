package com.cognixia.jump.interfacesandabstract;

public abstract class Animal {
	
	public void printType(String type) {
		System.out.println("Your animal is a " + type);
	}
	
	
	public abstract void printWeight(double weight);
	
	public void useType(String type) {
		printType(type);
	}
}
