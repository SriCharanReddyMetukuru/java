package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Name implements Comparator<Movie1> {

	public int compare(Movie1 m1, Movie1 m2) {
		// Sort by name in alphabetical order
		return m1.getN(). compareTo(m2.getN());
	}

	public static void main(String[] args) {
		// Create a list of movies
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1. add (new Movie1("Force Awakens", 8.3, 2015));
		m1. add (new Movie1("Star Wars", 8.7, 1977));
		m1. add (new Movie1("Empire Strikes Back", 8.8, 1980));
		
		// Sort movies by name and display all 
		Collections.sort(m1, new Name());
		System.out.println("\nMovies sorted by name:");
		for (Movie1 m : m1) {
			System.out.println(m.getN() + " " + m.getR() + " "+ m.getY());
		}
}
}