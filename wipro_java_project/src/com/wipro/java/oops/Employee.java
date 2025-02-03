/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
//POJO: Plain old java object access the getters/setters for Employee class

public class Employee {
    
	// creating a variables with access specifiers
	private int emp_id;
	private String emp_name;
	private String emailid;
	private int emp_phno;
	private boolean isTaxApplicable;
	
	
	// getting the empid
	public int getEmp_id() {
		return emp_id;
	}
	
	//setting the empid
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	//getting the emp_name
	public String getEmp_name() {
		return emp_name;
	}
	
	//setting the emp_name
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	//getting the email id
	public String getEmailid() {
		return emailid;
	}

	//setting the email id
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	//getting the employee phno
	public int getEmp_phno() {
		return emp_phno;
	}

	//setting the employee phno
	public void setEmp_phno(int emp_phno) {
		this.emp_phno = emp_phno;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
