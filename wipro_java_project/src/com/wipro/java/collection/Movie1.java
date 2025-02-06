package com.wipro.java.collection;

public class Movie1 {
	private String n; // Movie Name
	private double r;  // Movie Rating
	private int y;   // Release year
	
	//constructor
	public Movie1(String n, double r, int y) {
		this.n = n;
		this.r = r;
		this.y = y;
	}
	
	public String getN() {
		return n;
	}
	public double getR() {
		return r;
	}
	public int getY() {
		return y;
	}
}