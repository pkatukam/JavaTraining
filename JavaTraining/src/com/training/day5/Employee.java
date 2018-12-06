package com.training.day5;

public class Employee {
	double salary;

	
	public void coding() {
		System.out.println("Employee Codes");
	}
	
	public void works() {
		System.out.println("employee Works");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]" ;
	}
}
