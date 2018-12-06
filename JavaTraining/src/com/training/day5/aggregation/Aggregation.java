package com.training.day5.aggregation;

public class Aggregation {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.getAddress().setAddr1("XYZ");
				
		Student st2 = new Student();
		st2.getAddress().setAddr1("India");
		
		System.out.println(st1.getAddress().getAddr1());
		System.out.println(st2.getAddress().getAddr1());

	}
}
