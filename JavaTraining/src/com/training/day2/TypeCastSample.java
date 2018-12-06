package com.training.day2;

public class TypeCastSample {

	public static void main(String[] args) {
		widening();
		narrowing();
	}

	
	/**Upcasting**/
	private static void widening() {
		int i = 100;
		long l = i; // no explicit type casting required
		float f = l; // no explicit type casting required
		System.out.println("**********Widening / UpCasting****************");
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);
	}
	
	/**DownCasting**/
	private static void narrowing() {
		double d = 100.04;
		long l = (long) d; // explicit type casting required
		int i = (int) l; // explicit type casting required
		System.out.println("**********Narrowing  / LowCasting****************");
		System.out.println("Double value " + d);
		System.out.println("Long value " + l);
		System.out.println("Int value " + i);
	}
}
