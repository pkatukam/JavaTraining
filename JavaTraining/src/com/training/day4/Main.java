package com.training.day4;

/**
 * 
 * @author Priyanka byte -> short -> int -> float -> double
 */
public class Main {

	public static void main(String[] args) {
		
		ConstuctorSample cons =  new ConstuctorSample();
		System.out.println(cons + " " + cons.i + " : " + cons.str);	
		cons.ConstuctorSample();
		
		
		
		
		
		
		
		
		
		
		
		/**Method Overloading Example - Start */
		//System.out.println("Main Method");
		MethodOverloadingSample methodOverload = new MethodOverloadingSample();
		short i = 1;
		float j = 2;
		char c = '3';
	//	methodOverload.print(c, 1);
		// Overloading main method is possible but you have to explicitely call
		// the method for execution.
		//Main.main(24);
		/** Method Overloading - End */

	}

	public static void main(int i) {
		System.out.println("Main Method with int parameter " + i);

	}

}
