package com.cognixia.jump.flowcontrol;

import java.util.Scanner;

public class LoopsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int counter = 1;
//		
//		while(counter <= 10) {
//			System.out.println(counter);
//			counter++;
//		}
//		
//		boolean exitCondition = false;
//		System.out.println("Welcome, continue loop?");
//		
//		while(!exitCondition) {
//			Scanner input = new Scanner(System.in);
//			String choice = input.nextLine();
//			if (choice.equals("no")) {
//				exitCondition = true;
//			}
//			System.out.println("Welcome, continue loop?");
//		}
		
		boolean doLoop = false;
		int counter2 = 1;
		
		do {
			System.out.println("Inside the do while loop");
			if(counter2 > 5) {
				doLoop = false;
			}
			counter2++;
		} while (doLoop);
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 5; i >= 0; i--) {
//			System.out.println(i);
//		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + "" + j);
			}
		}
 		
		
	}

}
