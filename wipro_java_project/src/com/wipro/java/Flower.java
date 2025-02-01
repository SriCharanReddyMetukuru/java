/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {

	String Flower_name;
	int Sepal_length;
	int Petal_length;
	
	Flower(String name,int Sepal_length,int Petal_length) {
		this.Flower_name=name;
		this.Sepal_length=Sepal_length;
		this.Petal_length=Petal_length;
	}

	void display() {
		System.out.println("Flower_name:"+Flower_name+" Sepal_length:"+Sepal_length+" Petal_length:"+Petal_length);
	}
	public static void main(String[] args) {
		Flower flowerobj1=new Flower("Rose",4,6);
		Flower flowerobj2=new Flower("Lotus",6,4);
		flowerobj1.display();
		flowerobj2.display();
	}

}
