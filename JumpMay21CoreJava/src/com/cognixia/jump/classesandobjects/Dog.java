package com.cognixia.jump.classesandobjects;

public class Dog extends Animal {
	
	String color;
	String breed;
	boolean shedding;
	
	Collar collar;

	Dog() {
		super(0, "dog");
		this.collar = new Collar(Animal.getCount(), true);
		this.color = "N/A";
		this.breed = "N/A";
		this.shedding = false;
	}

	public Dog(double weight, String type, String color, String breed, boolean vacinated, boolean shedding) {
		super(weight, "Dog");
		this.color = color;
		this.breed = breed;
		this.collar = new Collar(Animal.getCount(), vacinated);
		this.shedding = shedding;
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + ", breed=" + breed + ", shedding=" + shedding + ", collar=" + collar.getIdNumber() + ", vacinated=" + collar.isVacinated() + "]";
	}



	
}
