package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

//Movie class implements Comparable
//interface to define default sorting
public class Movie implements Comparable<Movie>{
	private String n; // Movie Name
	private double r;  // Movie Rating
	private int y;   // Release year
	
//constructor
	public Movie(String n, double r, int y) {
		this.n = n;
		this.r = r;
		this.y = y;
	}
	
	public int compareTo(Movie m) {
		return Double.compare(this.r, m.r);
	}
	public String getName() {
		return n;
	}
	public double getRating() {
		return r;
	}
	public int getYear() {
		return y;
	}
	

	public static void main(String[] args) {
		// Create a list of movies
		ArrayList<Movie> l = new ArrayList<>() ;
		l.add(new Movie("BigBang",9.2,2002));
		l.add(new Movie("50sheds",8.5,2005));
		l.add(new Movie("Demonslayer",9.5,2020));
		
		//Sort  movies using comparable's
		//compareTo method by Year
		Collections.sort(l);
		
		System.out.println("Movies after sorting the rating: ");
		for (Movie m : l) {
			System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
		}
	}

}