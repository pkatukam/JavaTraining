package com.training.day5;

/**Single Level Inheritance**/
public class Programmer extends Employee {
	double bonus;
	
	public void coding() {
		System.out.println("Programmer Codes");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Programmer [bonus=" + bonus + " Salary " + salary + "]";
	}
	
	
}
