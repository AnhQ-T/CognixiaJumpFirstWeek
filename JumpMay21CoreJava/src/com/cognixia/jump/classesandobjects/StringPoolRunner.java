package com.cognixia.jump.classesandobjects;

public class StringPoolRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "s1";
		String s2 = "s2";
		String s3 = "s1";
		
		
		// make Strings directly to heap, bypassing String pool
		// all of these, regardless of what's in "", make a new object in the heap
		String s4 = new String("s4");
		String s5 = new String("s1");
		String s6 = new String("s4");
		
		// let's evaluate equality of the contents of String
		// (what's in the "")
		System.out.println("Compare s1 with s3 " + (s1 == s3));
		System.out.println("Compare s1 with s3 " + (s1 == s2));
		
		System.out.println("Compare s1 with s5 " + (s1 == s5));
		System.out.println("Compare s1 with s5 " + (s1.equals(s5)));
		System.out.println("Compare s4 with s6 " + (s4 == s6));
		System.out.println("Compare s4 with s6 " + (s4.equals(s6)));
	}

}
