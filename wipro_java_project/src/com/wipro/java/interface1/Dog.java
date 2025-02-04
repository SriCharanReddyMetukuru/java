package com.wipro.java.interface1;

public class Dog  implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks ");
	}
	public static void main(String[] args) {
		Animal dog= new Dog();
		dog.makeSound();
	}

}