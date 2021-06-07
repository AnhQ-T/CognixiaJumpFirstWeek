package com.cognixia.jump.threads;

public class Numbers {

	public static void print(int max) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < max; i++) {
			System.out.println("Thread " + Thread.currentThread().getId()
					+ ": " + i);
			
		}

	}
}