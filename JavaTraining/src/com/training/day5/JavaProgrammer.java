package com.training.day5;

public class JavaProgrammer extends Programmer{
	boolean knowsAdvanceJava;

	public void prgrams() {
		System.out.println("Middle Level Programming");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JavaProgrammer [knowsAdvanceJava=" + knowsAdvanceJava
				+ ", bonus=" + bonus + ", salary=" + salary + "]";
	}
	
	

}
