package com.wipro.java.oops.abstraction;

public class BMW extends Car {
	
	@Override
	public void mileage() {
		System.out.println("BMW: 11 km/lt");
	}
	
	@Override
	public void speed() {
		System.out.println("BMW: 230 km/hr");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car bmw=new BMW();
		bmw.mileage();
		bmw.speed();
		
	}

}
