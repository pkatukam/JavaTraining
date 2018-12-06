package com.training.day2;

public class VariablesSample {

	private int i = 10; // Instance Variable.
	private static int j = 10; // Static variable.

	public void increment() {
		i++;
		j++;
	}

	public int getNumber() {
		int k = 15; // Local Variable.

		// static int p = 10; //Static Local variable not allowed.

		return k;
	}

	public static void main(String[] args) {
		VariablesSample varSample = new VariablesSample();
		VariablesSample varSample2 = new VariablesSample();
		varSample.increment();
		System.out.println(varSample.i + " " + varSample2.i);
		System.out.println(VariablesSample.j);

		// int i = varSample.i;
		// int i2 = varSample2.i
		// varSample is a reference that can point to a object of type
		// VariableSample

		// System.out.println("i: " + varSample.i + " j: " + j + " k " +
		// varSample.getNumber());

	}
}
