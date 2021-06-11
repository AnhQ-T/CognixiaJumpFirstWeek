package com.cognixia.jump.classesandobjects;

public class SingletonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton mySingle = Singleton.getInstance();
		
		Singleton otherSingle = Singleton.getInstance();
		
		System.out.println(mySingle + " " + otherSingle);
		
	}

}
