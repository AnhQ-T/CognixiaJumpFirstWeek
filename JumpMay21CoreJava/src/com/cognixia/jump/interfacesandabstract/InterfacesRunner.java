package com.cognixia.jump.interfacesandabstract;

public class InterfacesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibian amph = new Amphibian();
		
		amph.move();
		
		amph.makeSound();
		
		amph.printType("Whale");
		
		amph.printWeight(50.0);
		
		Landbased.printTerrain();
	}

}
