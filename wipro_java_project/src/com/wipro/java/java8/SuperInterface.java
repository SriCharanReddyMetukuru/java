package com.wipro.java.java8;

interface Square
{
	default void show() {
		System.out.println("polygon is Square");
	}
}

interface Rectangle
{
	default void show() {
		System.out.println("polygon is Rectangle");
	}
}

public class SuperInterface implements Square,Rectangle {

	public void show() {
		
		Square.super.show();
		Rectangle.super.show();
		
	}
	
	public static void main(String[] args) {
		
		SuperInterface si=new SuperInterface();
		si.show();
		
	}
}
