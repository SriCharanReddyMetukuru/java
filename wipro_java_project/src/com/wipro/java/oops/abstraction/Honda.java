package com.wipro.java.oops.abstraction;

public class Honda extends Car{
	
	@Override
	public void mileage() {
		System.out.println("Honda: 16 km/lt");
	}
	
	@Override
	public void speed() {
		System.out.println("Honda: 190 km/hr");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car honda=new Honda();
		honda.mileage();
		honda.speed();
		
	}

}

