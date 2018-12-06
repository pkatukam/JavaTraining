package com.training.day5;

public class UIProgrammer extends Programmer {

	boolean freeTraining = true;

	public void coding() {
		System.out.println("Writes Scripts");
	}

	public void developUI() {
		System.out.println("DEvelops Front End");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UIProgrammer [freeTraining=" + freeTraining + ", bonus="
				+ bonus + ", salary=" + salary + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}
