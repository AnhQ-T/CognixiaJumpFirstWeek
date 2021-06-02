package com.cognixia.jump.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsFrameworkRunner {

	public static void main(String[] args) {
		
		// Collections interface
			
			// List
			
			List<Integer> intList = new ArrayList<Integer>();
			LinkedList<Double> dubList = new LinkedList<>();
			
			intList.add(10);
			intList.add(20);
			intList.add(30);
			intList.add(40);
			
			intList.add(10);
			intList.add(20);
			intList.add(30);
			intList.add(40);
			
			intList.add(10);
			intList.add(20);
			intList.add(30);
			intList.add(40);	
			
			intList.remove(10);
			
			String[] strings = {"Cats", "Dogs", "Whales", "Elephants"};
			
			List<String> stringList = Arrays.asList(strings);
			
//			stringList.add(3, "Spiders");
			
			System.out.println(stringList);
			
			System.out.println("intList is size " + intList.size());
			System.out.println(intList);
		
				// Iterate through list or queue (non set collection)
			
			for(int i = intList.size() - 1; i >= 0; i--) {
				System.out.println(intList.get(i));
			}
			
			System.out.println("For each loop");
			for(Integer i : intList) {
				System.out.println(i);
			}
			
			// Set
			Set<String> stringSet = new HashSet<>();
			
			stringSet.add("Red");
			stringSet.add("Blue");
			stringSet.add("Green");
			stringSet.add("Yellow");
			
			System.out.println("String set:\n" + stringSet);
			
				// Iterate through Set - with iterable
		
			// Queue
		
			// Homogeneous vs Heterogeneous Collections
		
		// Map
		
			// HashMap
		
			// Iterate through a map
	}

}
