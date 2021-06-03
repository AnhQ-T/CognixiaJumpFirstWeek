package com.cognixia.jump.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsRunner {

	public static void main(String[] args) {
		
		propMethod();
		
	}
	
	public static void propMethod() throws InputMismatchException, ArithmeticException {
		
		Scanner scan = new Scanner(System.in);
		int num, ans = 0;
		
		System.out.println("Please enter an integer:");
		num = scan.nextInt();
		ans = 10 / num;
		
		System.out.println("Your input was: " + num + "\nYour answer is: " + ans);
		
		scan.close();
	}

}
