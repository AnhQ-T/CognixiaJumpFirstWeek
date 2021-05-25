package com.cognixia.jump.firstproject;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		
		String storedInput = input.nextLine();
		
		System.out.println("Your input was: " + storedInput);
		
		input.close();

	}

}
