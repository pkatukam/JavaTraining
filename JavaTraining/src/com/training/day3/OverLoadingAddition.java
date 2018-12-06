package com.training.day3;

public class OverLoadingAddition {

	public void add(int a, int b) {
		System.out.println("public void add(int a, int b)");
		System.out.println(a + b);
	}

	public void add(float a, float b) {
		System.out.println("public void add(float a, float b)");
		System.out.println(a + b);
	}

	public void add(String a, String b) {
		System.out.println("public void add(String a, String b)");
		System.out.println(a + b);
	}

}
