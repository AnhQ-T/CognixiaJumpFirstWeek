package com.cognixia.jump.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.cognixia.jump.interfacesandabstract.Amphibian;
import com.cognixia.jump.interfacesandabstract.WaterBased;

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
			
			List<String> stringList = new ArrayList<>(Arrays.asList(strings));
			
			stringList.add(3, "Spiders");
			
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
			
			Iterator<String> iter = stringSet.iterator();
			
			System.out.println("\nLooping through set with iterator:");
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
		
			// Queue - and polymorphism
			LinkedList<String> ll = new LinkedList<>(stringSet);
			Queue<String> q = new LinkedList<>(ll);
			List<String> stringL = new LinkedList<>(ll);
			Deque<String> dl = new LinkedList<>(ll);
			
			System.out.println("Printing our queue: " + q);
			
			System.out.println("\nLooping through q, with for each: ");
			for (String s : q) {
				System.out.println(s);
			}
			// Homogeneous vs Heterogeneous Collections
			List<Amphibian> aL = new ArrayList<>();
			List<WaterBased> waterList = new ArrayList<>();
			
			
		// Map	
		
			// HashMap
			Map<String, Integer> coinMap = new HashMap<>();
			
			coinMap.put("Penny", 1);
			coinMap.put("Nickle", 5);
			coinMap.put("Dime", 10);
			coinMap.put("Quarter", 25);
			coinMap.put("Penny", 1);
			
			System.out.println("\nCoinMap size is " + coinMap.size());
			System.out.println(coinMap.get("Nickle"));
			System.out.println(coinMap.keySet());
			
			Set<String> mapKeySet = coinMap.keySet();
			
			// Iterate through a map
			Iterator<String> mapIter = mapKeySet.iterator();
			
			System.out.println("Printing mapped values: ");
			while(mapIter.hasNext()) {
				System.out.println(coinMap.get(mapIter.next()));
			}
			
			for(String s : coinMap.keySet()) {
				System.out.println(s);
			}
			
			// another way to loop and get map values
			System.out.println("Printing through map using Entry set\n");
			for(Map.Entry<String, Integer> entry: coinMap.entrySet()) {
				System.out.println("Key = " + entry.getKey());
				System.out.println("Value = " + entry.getValue());
			}
	}

}
