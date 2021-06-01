package com.cognixia.jump.interfacesandabstract;

public interface WaterBased {
	
	default void move() {
		
		System.out.println("Swimming.");
		
	}
	
	
	
}
