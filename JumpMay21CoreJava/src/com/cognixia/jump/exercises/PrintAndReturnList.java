package com.cognixia.jump.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintAndReturnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> inputs = Arrays.asList("Red", "Yellow", "Green", "Yellow", "Blue");
		
		System.out.println(stringListHandler(inputs) + "\n");
		
	}
	
	// Problem 1
	
	public static Set stringListHandler(List<String> input) {
		
		List<String> inputList = new ArrayList<>(input);
		Set<String> stringSet = new HashSet<>();
		
		for (String item : inputList) {
			System.out.println(item);
			if (stringSet.contains(item)) {
				System.out.println("The list contain duplicate with value " + item);
			}
			stringSet.add(item);
		}
		
		return stringSet;
		
	}
}
