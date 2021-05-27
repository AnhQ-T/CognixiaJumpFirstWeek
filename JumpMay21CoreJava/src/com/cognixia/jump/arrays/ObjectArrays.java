package com.cognixia.jump.arrays;

import java.util.Arrays;

public class ObjectArrays {

	public static void main(String[] args) {
		Item[] items;
		items = new Item[12];
		System.out.println("Array Created" + items[0]);
		
		items[0] = new Item("New Item");
		System.out.println("Index 0 set: " + items[0]);
		System.out.println("Index 0 set: " + items[1]);
		
		Item item = new Item("Referenced Item");
		items[1] = item;
		System.out.println("Index 1 set to a refernece: " + items[1]);
		
		items[0] = null;
		items[1] = null;
		System.out.println("Indexes set to null: " + items[0]);
		System.out.println("Indexes set to null: " + items[1]);
		System.out.println("Indexes set to null: " + item);
		
		for (int i = 0; i < items.length; i++) {
			items[i] = new Item("Item " + (i + 1));
		}
		
		for (Item i: items) {
			System.out.println(i.toString());
		}
		
		
		char grid[][] = {
				{'A','B','C'},
				{'D','E','F'},
				{'H','I','J'}
			};
		
		System.out.println(grid[1][2]);
		System.out.println(Arrays.toString(items));
		System.out.println(Arrays.deepToString(grid));
		
		char[] newRow= {'h','i','j','k'};
		grid[2] = newRow;
		
		System.out.println(Arrays.deepToString(grid));
		
		char[] row4 = {'l','m'};
//		IndexOutOfBoundsException
//		grid[4] = row4;
	}
}

class Item {
	String name;
	public Item(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "name = " + this.name;
	}
}