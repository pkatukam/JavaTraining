package com.training.day2;

public class Test {
	int i = 5;
	int a = 7;

	public int ternary() {
		return (i == 5) ? a : 10;
	}
	
	public int shiftBitwise(){
		return 8 << 2; // 0001000 - 0100000
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.ternary());
		System.out.println(t.shiftBitwise());
	}
}
