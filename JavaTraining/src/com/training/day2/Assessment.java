package com.training.day2;

public class Assessment {
	int b = 5;

	public static void main(String[] args) {

		/** Compilation Error **/
		// int a = 3.5;

		/** No Errors **/
		int a1 = 5;
		double a2 = (float) a1;

		/** Exception in thread "main" java.lang.ArithmeticException: / by zero **/
		float av = 9 / 0;

		/** Type mismatch: cannot convert from Assessment to Assessment.B **/
		// B b = new Assessment();

		/**
		 * No enclosing instance of type Assessment is accessible. Must qualify
		 * the allocation with an enclosing instance of type Assessment (e.g.
		 * x.new A() where x is an instance of Assessment).
		 **/
	//	Assessment assessment = new B();

	}

	class B extends Assessment {
		private void sys() {
			System.out.println("Test");

		}
	}

}
