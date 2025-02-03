package com.wipro.java.oops.inheritance;

public class Car {
	private String brand;
	private String model;
	private int year;

		public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void cardetails() {
		System.out.println(" Brand:"+brand+" model:"+model+" year:"+year);
		
	}
	
		
		
}
