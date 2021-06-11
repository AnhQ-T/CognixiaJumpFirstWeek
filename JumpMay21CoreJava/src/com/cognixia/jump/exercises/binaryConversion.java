package com.cognixia.jump.exercises;

public class binaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		binaryConverter("10101");
		
	}
	
	public static void binaryConverter(String input) {
		
		int inputLength = input.length();
		
		int total = 0;
		
		for (int i = 0; i < inputLength; i++) {
			if (input.charAt(i) == '1') {
				total += Math.pow(2, (inputLength - i) - 1);	
			}
		}
		
		System.out.println(total);
			
	}

}
