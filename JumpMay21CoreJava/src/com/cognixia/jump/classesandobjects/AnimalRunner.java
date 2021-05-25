package com.cognixia.jump.classesandobjects;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal anim1 = new Animal();
		
		Animal anim2 = new Animal(10.0, "Fish");
		
		int x = 4;
		
		anim1.setType("Mammal");
		
		System.out.println(anim1.getType());
		
		anim1.sound("bark");
		anim1.toString();
		
	}

}
