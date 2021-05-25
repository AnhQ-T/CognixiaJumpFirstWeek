package com.cognixia.jump.exercises;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int x = 1; x <= 100; x++) {
//			
//			if ((x % 3 == 0) & (x % 5 == 0)) {
//				System.out.println(x + " " + "FizzBuzz");
//			}
//			
//			else if (x % 3 == 0) { 
//				System.out.println(x + " " + "Fizz");
//			}
//			
//			else if (x % 5 == 0) {
//				System.out.println(x + " " + "Buzz");
//			}
//			
//			else {
//				System.out.println(x);
//			}
//		}

		int j = 1;

		while (j <= 100) {

			boolean isPrime = true;

			for (int x = 2; x <= j / 2; x++) {

				if (j % x == 0) {
					isPrime = false;
				}
			}

			if (isPrime == false) {
				if ((j % 3 == 0) & (j % 5 == 0)) {
					System.out.println(j + " " + "FizzBuzz");
				}

				else if (j % 3 == 0) {
					System.out.println(j + " " + "Fizz");
				}

				else if (j % 5 == 0) {
					System.out.println(j + " " + "Buzz");
				}

				else {
					System.out.println(j);
				}
				j++;
			}

			else {
				j++;
				continue;
			}

		}

	}

}
