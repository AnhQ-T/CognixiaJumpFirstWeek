package com.cognixia.jump.classesandobjects;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Data type (class) variable name assign or instantiate with constructor
		// the "new" reserves space in heap memory
		Animal anim1 = new Animal();
		
		Animal anim2 = new Animal(10.0, "Fish");
		
		int x = 4;
	
		anim1.setType("Mammal");
		System.out.println(anim1.getCount());
		System.out.println(anim2);
		System.out.println(anim1.getType());
		
		anim1.sound("bark");
		anim1.sound("meow");
		
		Dog myDog1 = new Dog();
		myDog1.setType("Lab");
		
		Animal.printTotalAnimals();
	}

}