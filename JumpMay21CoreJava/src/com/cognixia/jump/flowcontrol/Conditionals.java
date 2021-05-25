package com.cognixia.jump.flowcontrol;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer value: ");

		int userValue = input.nextInt();

//		if (userValue > 0) {
//			System.out.println("Your value " + userValue + "was positive");
//		}
//		
//		if (userValue < 10) {
//			System.out.println("Your value was less than 10");
//		}
//		
//		if (userValue % 2 == 0) {
//			System.out.println("Your value " + userValue + " was even. And between 0 and 10");
//		}
		
		if (userValue > 0) {
			System.out.println("Positive interger " + userValue);
		}
		
		else if (userValue % 2 == 0) {
			System.out.println("Even integer " + userValue);
		}
		
		else {
			System.out.println("Negative integer " + userValue);
		}


		input.close();

	}

}
