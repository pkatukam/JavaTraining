package com.training.day4;

/***
 * 
 * @author Priyanka Rules - 1) Constructor name should be same as class name 2)
 *         It cannot have return type Two Types of Constructor - Default and
 *         Parameterized Constructor
 * 
 *         If you define a parameterized constructor in your class you cannot
 *         use default constructor if not explicitely defined in your class
 *
 */
public class ConstuctorSample {

	float i;
	String str;
	boolean b;

	// Default Constructor
	public ConstuctorSample() {
		System.out.println("Default Construcor");
		this.i = 2;
		this.str = "Priyanka";
		print();
	}

	// Parameterized Constructor.
	public ConstuctorSample(float i, String str) {
		// TODO Auto-generated constructor stub
		System.out.println("Paramterised Constructor " + i);
		this.i = i;
		this.str = str;
	}

	// Method and no constructor.
	public int ConstuctorSample() {
		// TODO Auto-generated constructor stub
		System.out.println("Method");
		return 1;
	}

	void print() {
		System.out.println("Print method called from a constructor");
	}
}