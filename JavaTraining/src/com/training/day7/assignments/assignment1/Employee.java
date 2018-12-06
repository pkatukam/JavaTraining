package com.training.day7.assignments.assignment1;

public class Employee {
	private int weeklyHoursWorked;
	private int id;
	private String name;
	private double salary;
	

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the weeklyHoursWorked
	 */
	public int getWeeklyHoursWorked() {
		return weeklyHoursWorked;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [weeklyHoursWorked=" + weeklyHoursWorked + ", id="
				+ id + ", name=" + name + ", salary=" + salary + "]";
	}

	/**
	 * @param weeklyHoursWorked
	 *            the weeklyHoursWorked to set
	 */
	public void setWeeklyHoursWorked(int weeklyHoursWorked) {
		this.weeklyHoursWorked = weeklyHoursWorked;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
}
