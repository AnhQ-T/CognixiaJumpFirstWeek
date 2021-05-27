package com.cognixia.jump.arrays;

import com.cognixia.jump.classesandobjects.Dog;

public class ArraysExampleDriver {

	public static void main(String[] args) {
		
		// declaring an array (Primitive and objects)
		double[] testScores;
		double testScore;
		
		Dog[] dogs;
		Dog dog;
		
		// initializing
		dogs = new Dog[10];
		testScores = new double[10];
		System.out.println(testScores[0]);
		
		int[] integers = {2, 4, 6, 8, 10};
		
		Dog[] bigDogs = {new Dog(50, "Black", "Great Dane", true),
				new Dog(100, "multi", "St. Bernard", true)};
		
		// assigning values
		dogs[0] = new Dog(25, "red", "lab", true);
		System.out.println("Integers array, element 2 =" + integers[2]);
		integers[2] = 1000;
		System.out.println(dogs[1]);
		System.out.println(dogs[0]);
		
		System.out.println(integers.length);
		System.out.println(bigDogs.length);

		
	}

}