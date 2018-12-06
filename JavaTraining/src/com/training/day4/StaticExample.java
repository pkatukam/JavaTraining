package com.training.day4;

/**
 * 
 * 
 * @author Priyanka
 * 
 *         Static Variables - refer to common property for all objects.(Not
 *         Unique per object) static method - can be invoked without a neec to
 *         create instance of the class. You can access the static variable only
 *         & you can change it.
 * 
 *
 */

public class StaticExample {
	int i = 10;
	public static void main(String[] args) {
		
		System.out.println(Student.collegeName );
		System.out.println("Static Method call " + Student.getCounter());
		
		StaticExample eg = new StaticExample();
		System.out.println(eg.i);
		
		Student s1 = new Student();
		Student s2 = new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		s1.rollNumber = 1;
		s1.name = "Priyanka";
		//s1.collegeName = "BBS";
		System.out.println(s1.toString() + " " + s1.collegeName);
		
		s2.rollNumber = 2;
		s2.name = "Agastya";
		System.out.println(s2.toString() + " " + s2.collegeName);

		System.out.println("Number of students being created " + s1.counter);
		
		
	}

}
