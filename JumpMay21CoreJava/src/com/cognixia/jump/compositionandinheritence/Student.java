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
	
//	public final void finalMethod() {
//		System.out.println("This method is final");
//	}
	
	public void hello() {
		System.out.println("Hello");
	}
	
	public void hello(String name) {
		System.out.println("Hello " + name);
	}
	
	public void add(int num1, int num2) {
		System.out.println("num1 + num2 = " + (num1 + num2));
	}
	
	public void add(double num1, double num2) {
		System.out.println("num1 + num2 = " + (num1 + num2));
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
