package com.cognixia.jump.exercises;

public class ReverseString {

	public static void main(String[] args) {
		// initializing test cases
		String s1 = "abcd";
		String s2 = "Hello World!";
		
		// Part 1, with built in method
		
		String s1Reversed = reverseMethod(s1);
		System.out.println(s1Reversed);
		
		String s2Reversed = reverseMethod(s2);
		System.out.println(s2Reversed);
		System.out.println();
		
		// Part 2, no built in reverse method
		
		String s1ReversedNoBuiltIn = reverseNoBuiltIn(s1);
		System.out.println(s1ReversedNoBuiltIn);
		
		String s2ReversedNoBuiltIn = reverseNoBuiltIn(s2);
		System.out.println(s2ReversedNoBuiltIn);
		
		// Bonus
		String s2ReverseBonus = reverseBonus(s2);
		System.out.println(s2ReverseBonus);
		
	}
	
	public static String reverseMethod(String input) {
		
		StringBuffer reversedString1 = new StringBuffer(input);
		reversedString1.reverse();
		String inputReversed = reversedString1.toString();
		
		return inputReversed;
	}

	
	public static String reverseNoBuiltIn(String input) {
		
		String inputReversed = "";
		
		for(int x = input.length() - 1; x >= 0; --x) {
			inputReversed += input.charAt(x);
		}
		
		return inputReversed;
	}
	
	public static String reverseBonus(String input) {
		
		String inputReversed = "";
		String[] inputArr = input.split(" ");
		
		for(int x = 0; x < inputArr.length; x++) {
			StringBuffer reversedString = new StringBuffer(inputArr[x]);
			reversedString.reverse();
			inputReversed = inputReversed + reversedString.toString() + " ";
		}
		
		return inputReversed;
		
	}
}
