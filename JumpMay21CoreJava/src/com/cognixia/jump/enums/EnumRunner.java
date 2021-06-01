package com.cognixia.jump.enums;

public class EnumRunner {

	public static void main(String[] args) {
		gradeRunner();	
	}
	
	public static void gradeRunner() {
		Grade grade = Grade.FRESHMAN;
		
		System.out.println(grade.name());
		
		grade.hello();
		
		switch(grade) {
		case FRESHMAN:
			System.out.println("First year in high school.");
			break;
		case SOPHMORE:
			System.out.println("Second year in high school.");
			break;
		case JUNIOR:
			System.out.println("Third year in high school.");
			break;
		case SENIOR:
			System.out.println("Fourth year in high school.");
			break;
		default:
			System.out.println("Not valid grade level");
			break;
		}
	}

}
