package com.attra.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String empName;
	int empid;
	transient String email;
	static String company = "Attra"; 

	public Employee(String empName, int empid, String email) {
		super();
		this.empName = empName;
		this.empid = empid;
		this.email = email;
	}

	// The following is Getters and Setters

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empid=" + empid + ", email=" + email + ", company=" + company + "]";
	}

}
