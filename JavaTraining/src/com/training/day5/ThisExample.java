package com.training.day5;

/**
 * Reference variable --> current object
 * @author Priyanka
 *
 */
public class ThisExample {
	
	public static void main(String[] args) {
		Student st1 = new Student(1, "Sriram", 24);
		Student st2 = new Student(2, "Pavan", 24);
		st1.print();
		st2.print();
		
		st1.printObj();
		st2.printObj();
		
	}

}
