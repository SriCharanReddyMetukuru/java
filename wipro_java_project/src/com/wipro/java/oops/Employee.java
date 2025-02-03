/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
//POJO: Plain old java object access the getters/setters for Employee class

public class Employee {

	private int emp_id;
	private String emp_name;
	private String emailid;
	private int emp_phno;
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public int getEmp_phno() {
		return emp_phno;
	}

	public void setEmp_phno(int emp_phno) {
		this.emp_phno = emp_phno;
	}

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
