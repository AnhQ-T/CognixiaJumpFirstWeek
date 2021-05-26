package com.cognixia.jump.classesandobjects;

public class Collar {
	
	private int idNumber;
	private boolean vacinated;
	
	public Collar() {
		this.idNumber = idNumber;
		this.vacinated = false;
	}
	
	public Collar(int idNumber, boolean vacinated) {
		super();
		this.idNumber = idNumber;
		this.vacinated = vacinated;
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public boolean isVacinated() {
		return this.vacinated;
	}
	
	public void setVacinated(boolean vacinated) {
		this.vacinated = vacinated;
	}
	
}
