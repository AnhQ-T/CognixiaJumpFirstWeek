package com.cognixia.jump.compositionandinheritence;

public class Person {
	
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	
	public void greeting() {
		System.out.println("Hello, my name is " + name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
}
