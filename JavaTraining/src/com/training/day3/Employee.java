package com.training.day3;

public class Employee {

	// Data + Propoerties
	private int employeeID;
	private String name;
	private int age;
	private String deptName;
	
	
	public Employee(int employeeID, String name, int age, String deptName) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.age = age;
		this.deptName = deptName;
	}

	// Behaviour
	public void doWork(String workName) {
		System.out.println("I work on " + workName);
	}

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID
	 *            the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the deptName
	 */
	public String getdeptName() {
		return deptName;
	}

	/**
	 * @param deptName
	 *            the deptName to set
	 */
	public void setdeptName(String deptName) {
		this.deptName = deptName;
	}
}
