package com.cognixia.jump.classesandobjects;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal anim1 = new Animal();
		
		Animal anim2 = new Animal(10.0, "Fish");
		
		int x = 4;
		
		anim1.type = "Mammal";
		
		System.out.println(anim2.weight);
		
		anim1.sound();
		
	}

}
