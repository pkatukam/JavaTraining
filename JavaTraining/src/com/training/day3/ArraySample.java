package com.training.day3;

public class ArraySample {

	public static void main(String[] args) {
		int[] myArray1 = new int[5];// Allocate 5 int memory space @run-time
		int[][] multiDimArray2 = new int[5][];

		int myArray[] = { 1, 3, 5, 7, 10, 12, 16 };
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			// System.out.print(myArray[i] + "\t");
		}

		int[][] multiDimArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };// 3X3
		for (int i = 0; i < multiDimArray.length; i++) {
			for (int j = 0; j < multiDimArray.length; j++) {
				// System.out.print(multiDimArray[i][j] + "\t");
			}
			// System.out.print("\n");
		}
		int[][] multiDimArray1 = new int[5][5];
		int counter = 1;
		for (int i = 0; i < multiDimArray1.length; i++) {
			for (int j = 0; j < multiDimArray1.length; j++) {
				multiDimArray1[i][j] = counter;
				counter++;
			}
		}

		for (int i = 0; i < multiDimArray1.length; i++) {
			for (int j = 0; j < multiDimArray1.length; j++) {
				System.out.print(multiDimArray1[i][j] + "\t");
			}
			System.out.print("\n");
		}

	}

	public void print(int[] singleDim) {

	}

	public void print(int[][] multiDim) {

	}

	public void fillArray(int[] singleDim) {

	}

	public void fillArray(int[][] multiDim) {

	}

	public void summation(int[] singleDim) {

	}

	public void summation(int[][] multiDim) {

	}

	/**
	 * {1,2,3} + {4,5,6} = {5,7,9}
	 **/
	public int[] addition(int[] array1, int[] array2) {
		return new int[1];
	}
	
	public int[][] addition(int[][] array1, int[][] array2) {
		return new int[1][1];
	}

}
