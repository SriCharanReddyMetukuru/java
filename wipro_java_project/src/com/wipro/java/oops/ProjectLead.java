package com.wipro.java.oops;


/**
 * parent class= Employee
 * child class=projectLead
 * keyword= extends
 */

public class ProjectLead extends Employee{

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ProjectLead prolead=new ProjectLead();
		
		//ProjectLead prolead1=(ProjectLead)new Employee();
		
		Employee emp=new ProjectLead();
		
		emp.setEmp_id(1234);
		emp.setEmailid("rahul@gmail.com");
		emp.setEmp_name("rahul");
		emp.setEmp_phno(9941);
		
		
		System.out.println(emp.getEmp_name());
		System.out.println(emp.getEmp_id());
		System.out.println(emp.getEmailid());
		System.out.println(emp.getEmp_phno());

	}
	
}
