package com.cognixia.jump.interfacesandabstract;

public interface Landbased {
	
	void makeSound();
	
	default String move(String input) {
		
		return ("Your animal moves");
		
	}
	
	static void printTerrain() {
		System.out.println("This is landbased");
	}
	
}
