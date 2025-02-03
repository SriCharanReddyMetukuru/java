package com.wipro.java.oops;

/**
 * parent class= Employee
 * child class=projectLead
 * keyword= extends
 */

public class Developer extends Employee {

	public Developer() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the obj for developer
		Employee emp=new Developer();
		
		// setting up the developer details
		emp.setEmp_id(345);
		emp.setEmailid("Megha@gmail.com");
		emp.setEmp_name("Megha");
		emp.setEmp_phno(9435);
		
		//getting the employee details
		System.out.println(emp.getEmp_name());
		System.out.println(emp.getEmp_id());
		System.out.println(emp.getEmailid());
		System.out.println(emp.getEmp_phno());


	}

}
