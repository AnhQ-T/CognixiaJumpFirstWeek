package com.cognixia.jump.classesandobjects;

public class Dog extends Animal {
	
	// attributes
	String color;
	String breed;
	
	// composition attribute
	Collar collar;
	
	boolean shedding;
	
	// no parameters to apply
	Dog(){
		super(0, "Dog");
		this.collar = new Collar();
		this.color = "N/A";
		this.breed = "N/A";
		this.shedding = false;
	}

	public Dog(double weight, String color, String breed, boolean shedding) {
		super(weight, "Dog");
		this.collar = new Collar(Animal.getCount(), true);
		this.color = color;
		this.breed = breed;
		this.shedding = shedding;
	}

	public Dog(double weight, String color, String breed, int collarIdNum, boolean vacinated, 
			boolean shedding) {
		super(weight, "Dog");
		this.color = color;
		this.breed = breed;
		this.collar = new Collar(collarIdNum, vacinated);
		this.shedding = shedding;
	}
	

	@Override
	public String toString() {
		return "Dog [color=" + color + ", breed=" + breed + ", collar=" + collar 
				+ ", \nshedding=" + shedding + "]";
	}
	
	
	
}