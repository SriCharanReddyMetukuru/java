package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CheckedException {

	    public static void main(String[] args) {
	        try {
	            File file = new File("invalid_file.txt"); 
	            FileReader reader = new FileReader(file); // it will throw FileNotFoundException
	        } catch (IOException e) {
	            System.out.println("Checked Exception Caught: " + e.getMessage());
	        }
	}

}