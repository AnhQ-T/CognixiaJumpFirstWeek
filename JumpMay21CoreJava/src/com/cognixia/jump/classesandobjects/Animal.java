// labeling and getting the tools in my workspace to do the job
package com.cognixia.jump.classesandobjects;

// POJO - plain old java object
public class Animal {
	
	// attributes
	private double weight;
	private String type;
	protected static int count = 0;
	

	protected Animal(){
		this.weight = 0;
		this.type = "";
		this.count++;
	}
	
	// overloaded constructor
	protected Animal(double weight, String type){
		this.weight = weight;
		this.type = type;
		this.count++;
	}
	
	// methods
	void sound(String input) {
		System.out.println("Your animal sounds like: " + input);
	}
	
	// Methods special section - Getters and Setters
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static int getCount() {
		return count;
	}
	
	public static void printTotalAnimals() {
		System.out.println(count);
	}

	@Override
	public String toString() {
		return "This Animal has weight=" + weight + ", and type=" + type;
	}
		
}