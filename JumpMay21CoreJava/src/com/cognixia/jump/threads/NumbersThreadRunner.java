package com.cognixia.jump.threads;

public class NumbersThreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main thread ID " + Thread.currentThread().getId());
		
		NumThread t1 = new NumThread();
		
		for(int i = 0; i < 3; i++) {
			new NumThread().start();
		}
	}

}
