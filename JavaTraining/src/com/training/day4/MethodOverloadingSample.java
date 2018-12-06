package com.training.day4;

/**
 * Method Overloading Sample 
 * 1) Use same method name but different parameters 
 * 2) Diff Parameters - different number of parameters or Data types 
 * 
 * Note - Cannot achieve it by changing the return type.
 * 
 * Advantage : Increases Code Readability.
 * **/

public class MethodOverloadingSample {

	public void print() {
		System.out.println("Print method with no Paramters");
	}

	public void print(int i) {
		System.out.println("Print method with one integer Paramters - " + i);

	}

	public void print(byte i, byte j) {
		System.out.println("Print method with two byte Paramters - " + i + " : " + j);

	}
	
	public void print(short i, short j) {
		System.out.println("Print method with two short Paramters - " + i + " : " + j);

	}
	
	public void print(int i, int j) {
		System.out.println("Print method with two integer Paramters - " + i + " : " + j);

	}

	public void print(float i, float j) {
		System.out.println("Print method with one float Paramters " + i + " : " + j);

	}

}
