package com.wipro.java.oops;

/**
 * parent class= Employee
 * child class= Manager
 * keyword= extends
 */

public class Manager extends Employee{

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		
		// create a object for manager
		Employee emp=new Manager();
		
		// setting up the manager details
		emp.setEmp_id(234);
		emp.setEmailid("sheetal@gmail.com");
		emp.setEmp_name("sheetal");
		emp.setEmp_phno(9967);
		
		// getting the manager details
		System.out.println(emp.getEmp_name());
		System.out.println(emp.getEmp_id());
		System.out.println(emp.getEmailid());
		System.out.println(emp.getEmp_phno());
		
	}

}
