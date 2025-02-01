package com.wipro.java;

 
public class Main {
	
	int num = 5;
	 
    public void changeValue(int num) {
        this.num = num;
    }
    
    public static void main(String[] args) {
        Main obj = new Main();      // Creating a object instance named obj
        obj.changeValue(10);              // Changing the num value from changeValue function
        System.out.println(obj.num);	//  print the num value
    }
}