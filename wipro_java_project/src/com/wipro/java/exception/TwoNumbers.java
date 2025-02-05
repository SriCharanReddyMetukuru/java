package com.wipro.java.exception;


public class TwoNumbers {
    public static void main(String[] args) {
        
    	// Declaring and initializing the variables
    	 int num1=34;
    	 int num2=0;
    	 
    	 //Exception handling
        try {
          
            int result = num1 / num2;

            System.out.println("Result: " + result);

        } 
        
        catch (Exception e) {
            System.out.println(e.toString());
        }
        
        
         finally {
            System.out.println("Execution completed.");
        }
    }
}