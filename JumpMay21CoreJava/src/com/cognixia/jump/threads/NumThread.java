package com.cognixia.jump.threads;

public class NumThread extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("Start Thread " + Thread.currentThread().getId());
		
		Numbers.print(100);
		
		super.run();
	}
}
