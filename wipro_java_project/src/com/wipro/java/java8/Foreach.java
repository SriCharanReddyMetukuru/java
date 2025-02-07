package com.wipro.java.java8;

/**
 * 
 * The For-each class demonstrates the use of the enhanced for-each loop in Java.
 * The for-each loop is a simplified way to iterate over arrays or collections 
 * without requiring explicit initialization, condition checking, or incrementing.
 **/
public class Foreach {
	public Foreach() {
	}

	public static void main(String[] args) {
		// Declare and initialize an integer array
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 6, 8, 9 };
		for (int e : arr) {         // Using a for-each loop to iterate over the written array
			System.out.println(e);  // Print each element of the array
		}	

	}

}