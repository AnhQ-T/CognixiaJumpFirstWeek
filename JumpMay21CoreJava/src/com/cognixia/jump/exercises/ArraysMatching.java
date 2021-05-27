package com.cognixia.jump.exercises;

public class ArraysMatching {

	public static void main(String[] args) {
		
		// Initializing test cases
		int[] arr1 = {3,2,5,1};
		int[] arr2 = {5,2,1,3};
		
		int[] sortedArr1 = arraySort(arr1);
		int[] sortedArr2 = arraySort(arr2);
		
		if(arr1.length != arr2.length) {
			System.out.println("The two arrays are not equal");
		}
		
		else if (sortedArr1.equals(sortedArr2)) {
			System.out.println("The two arrays are equal");
		}
		
		else {
			System.out.println("The two arrays are not equal");
		}
		
		
	}
	
	private static int[] arraySort(int arr[]) {
		
		int arrLength = arr.length;
		
		for(int i = 0; i < arrLength; i++) {
			for(int x = i + 1; x < arrLength; x++) {
				
				int temp = 0;
				
				if (arr[i] > arr[x]) {
					temp = arr[i];
					arr[i] = arr[x];
					arr[x] = temp;
				}
			}
		}
		
		return arr;
		
	}
	


}
