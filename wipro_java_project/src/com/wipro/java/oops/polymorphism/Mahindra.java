package com.wipro.java.oops.polymorphism;

import com.wipro.java.oops.inheritance.Car;

public class Mahindra extends Car{
 
	@Override
	public void cardetails() {
		System.out.println("Mahindra car details "+getBrand()+" model:"+getModel()+" year:"+getYear());
	}
	
	public static void main(String args[]) {
		Car mahi=new Mahindra();
		mahi.setBrand("mahindra");
		mahi.setModel("thar");
		mahi.setYear(2025);
		mahi.cardetails();
		
	}

}
