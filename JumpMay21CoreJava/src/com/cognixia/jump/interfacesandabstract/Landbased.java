package com.cognixia.jump.interfacesandabstract;

public interface Landbased {
	
	default void move() {
		
		System.out.println("Walking.");
		
	}
	
}
