package com.training.day9.assignments.assignement1;

public class Pattern {

	public static void main(String[] args) {
		printPattern1(5);
		System.out.println("");
		printPattern2(5);
		System.out.println("");
		printPattern3(5);
		System.out.println("");
		printPattern3(10);

		System.out.println("");
		printPattern4(10);
	}

	public static void printPattern1(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void printPattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void printPattern3(int n) {
		for (int i = 0; i < n; i = i + 2) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			for (int k = 0; k < i + 1; k = k + 2) {
				System.out.print(" ");
			}
		}
	}

	public static void printPattern4(int n) {
		for (int i = 0; i < n; i = i + 2) {
			for (int k = i; k < n - 1; k = k + 2) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}

}
