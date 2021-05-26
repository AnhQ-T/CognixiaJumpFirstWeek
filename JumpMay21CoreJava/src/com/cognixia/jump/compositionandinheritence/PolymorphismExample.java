package com.cognixia.jump.compositionandinheritence;

public class PolymorphismExample {
	
	public static void main(String[] args) {
		
		Person orquidia = new Person("Orquidia");
		
		System.out.println(orquidia);
		orquidia.greeting();
		
		Student leul = new Student("Leul", 3.8);
		
		System.out.println(leul);
		leul.greeting();
	
		Person nikita = new Student("Nikita", 3.7);
		
		nikita.greeting();
		
		nikita.setName("NIKITA");
		System.out.println("Name= " + nikita.getName());
		
		// can't access methods that aren't already defined in Person
		// nikita.setGpa(3.8);
		
//		leul.finalMethod();
//		nikita.finalMethod();
		
		leul.hello();
		leul.hello("Orquida");
		
		leul.add(3, 4);
		leul.add(3.4, 4.2);
	}
	
}
