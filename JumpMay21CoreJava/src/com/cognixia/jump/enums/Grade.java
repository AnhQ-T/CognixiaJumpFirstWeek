package com.cognixia.jump.enums;

public enum Grade {
	FRESHMAN(1), SOPHMORE(2), JUNIOR(3), SENIOR(4);
	
	public final int value;
	
	Grade(int value) {
		this.value = value;
		System.out.println("A " + this.toString() + " has been in high school for " + (this.ordinal() + 1) + " years ");
	}

	public void hello() {
		System.out.println("Hello this student is a " + this.toString());
	}
	
}
