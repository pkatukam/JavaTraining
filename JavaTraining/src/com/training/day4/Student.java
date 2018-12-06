package com.training.day4;

public class Student {
	public int rollNumber;
	public String name;
	public static String collegeName;
	static int counter;

	public Student() {
		System.out.println("Default Constructor" + collegeName);
		// TODO Auto-generated constructor stub
		counter++;
		System.out.println(counter);
	}

	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public static int getCounter() {
		return counter;

	}

	/**
	 * @return the rollNumber
	 */
	public int getRollNumber() {
		return rollNumber;
	}

	/**
	 * @param rollNumber
	 *            the rollNumber to set
	 */
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "] " + counter;
	}


	static {
		System.out.println("STATIC BLOCK");
		counter = 0;
		collegeName = "ITC";
	}

}
