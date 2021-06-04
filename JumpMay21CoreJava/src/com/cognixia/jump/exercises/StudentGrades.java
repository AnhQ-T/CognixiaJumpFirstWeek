package com.cognixia.jump.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> studentMap = new HashMap<>();
		studentMap.put("John", 80);
		studentMap.put("Mary", 60);
		studentMap.put("Eric", 60);
		studentMap.put("Kevin", 75);
		studentMap.put("David", 100);
		
		highestGrade(studentMap);
		secondHighestScoring(studentMap);
		medianScore(studentMap);
		averageScore(studentMap);
	}
	
	public static Map highestGrade(Map<String, Integer> input) {
		
		Map<String, Integer> highestScoringStudent = new HashMap<>();
		int highestScore = Collections.max(input.values());
		
		for(Map.Entry<String, Integer> entry: input.entrySet()) {
			if(entry.getValue() == highestScore) {
				highestScoringStudent.put(entry.getKey(), entry.getValue());
				System.out.println("The highest scoring student is " + entry.getKey() + " with a score of " + entry.getValue());
			}
		}
		
		return highestScoringStudent;
	}
	
	public static Map secondHighestScoring(Map<String, Integer> input) {
		
		Map<String, Integer> secondHighestScoringStudent = new HashMap<>();
		List<Integer> scoreList = new ArrayList<>();
		
		for (int score: input.values()) {
			scoreList.add(score);
		}
		
		Collections.sort(scoreList);
		
		if (scoreList.size() > 1) {
			for(Map.Entry<String, Integer> entry: input.entrySet()) {
				if(entry.getValue() == scoreList.get(scoreList.size() - 2)) {
					secondHighestScoringStudent.put(entry.getKey(), entry.getValue());
					System.out.println("The second highest scoring student is " + entry.getKey() + " with a score of " + entry.getValue());
				}
			}
		}
	
		return secondHighestScoringStudent;
	}
	
	public static double medianScore(Map<String, Integer> input) {
		List<Integer> scoreList = new ArrayList<>();
		
		for (int score: input.values()) {
			scoreList.add(score);
		}
		
		Collections.sort(scoreList);
		
		if ((scoreList.size() % 2) == 1) {
			double median = scoreList.get((scoreList.size() - 1) / 2);
			System.out.println("The median score is " + median);
			return median;
		}
		
		else {
			double median = (scoreList.get( scoreList.get(scoreList.size() / 2) + scoreList.get(scoreList.size() / 2 - 1) ));
			return median;
		}
	
	}
	
	public static double averageScore(Map<String, Integer> input) {
		double averageScore = 0.0;
	
		for (int score : input.values()) {
			averageScore += score;
		}
		
		averageScore = averageScore / input.size();
		
		System.out.println("The average score is " + averageScore);
		return averageScore;
		
	}

}
