package com.cognixia.jump.interfacesandabstract;

public class Amphibian implements WaterBased, Landbased {

	@Override
	public void move() {
		
		System.out.println("Swim or walk");
			
	}

}
