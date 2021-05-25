package com.cognixia.jump.flowcontrol;

import java.util.Scanner;

public class SwitchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a sport: ");

		String sportInput = input.nextLine();

		switch (sportInput) {
		
			case "baseball": {
	
				System.out.println("You entered baseball");
				break;
			}
			
			case "soccer": {
				System.out.println("Play with your feet");
				break;
			}
			
			case "basketball": {
				System.out.println("Shoot hoops");
				break;
			}
			
			default:
				System.out.println("Didn't find your sport");
			}

		}

}
