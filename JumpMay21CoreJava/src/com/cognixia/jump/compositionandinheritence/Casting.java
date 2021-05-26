package com.cognixia.jump.compositionandinheritence;

public class Casting {
	
	public static void main(String[] args) {
		
		Student student = new Student("student", 3.0);
		
		// upcasting => child to parent
		
		Person person1 = student;
		Person person2 = (Person) student;
		Person person3 = new Student("student3", 3.0);
				
		person1.greeting();
		
		// downcasting => parent to child
		
		// in order to downcast, must have already upcasted
		
		Student student2 = (Student) person1;
		
		student2.setGpa(3.2);
		
	}
	
}
