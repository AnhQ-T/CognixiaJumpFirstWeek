package com.cognixia.jump.compositionandinheritence;

public class Student extends Person {
	
	private double gpa;

	public Student(String name, double gpa) {
		super(name);
		this.gpa = gpa;
	}
	
	public void greeting() {
		System.out.println("Hello, I am a student named " + getName());
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", getName()=" + getName() + "]";
	}
	
	
	
}
