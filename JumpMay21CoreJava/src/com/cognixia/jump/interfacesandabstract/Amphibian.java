package com.cognixia.jump.interfacesandabstract;

public class Amphibian extends Animal implements WaterBased, Landbased {
	
	public void makeSound() {
		System.out.println("A sound is made	");
	}

	@Override
	public void printWeight(double weight) {
		
		System.out.println("Your animal weight is " + weight);
		
	}

}
