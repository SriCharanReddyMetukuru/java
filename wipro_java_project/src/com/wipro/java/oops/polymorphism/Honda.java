package com.wipro.java.oops.polymorphism;

import com.wipro.java.oops.inheritance.Car;

public class Honda extends Car {
	
	@Override
	public void cardetails() {
		System.out.println("Honda car details "+getBrand()+" model:"+getModel()+" year:"+getYear());
	}
	
	public static void main(String args[]) {
		Car honda=new Honda();
		honda.setBrand("honda");
		honda.setModel("city");
		honda.setYear(2024);
		honda.cardetails();
		
	}

}
