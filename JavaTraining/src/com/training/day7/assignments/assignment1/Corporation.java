package com.training.day7.assignments.assignment1;

public class Corporation {
	private String name;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Corporation [name=" + name + ", basePay=" + basePay + "]";
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

	private double basePay;

	/**
	 * @return the basePay
	 */
	public double getBasePay() {
		return basePay;
	}

	/**
	 * @param basePay
	 *            the basePay to set
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

}
