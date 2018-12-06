package com.training.day5;

/**
 * 
 * @author Priyanka IS-A relationship - INHERITANCE
 */
public class InheritanceSample {

	public static void main(String[] args) {
		Programmer p1 = new Programmer();
		p1.bonus = 5000;
		p1.salary = 20000;
		p1.coding();
		System.out.println(p1.toString());
		
		//Multilevel Sample
		UIProgrammer uiprogrammer = new UIProgrammer();
		System.out.println(uiprogrammer.freeTraining);
		uiprogrammer.bonus = 2000;
		uiprogrammer.salary = 25000;
		uiprogrammer.coding();
		uiprogrammer.developUI();
		uiprogrammer.works();
		System.out.println(uiprogrammer.toString());
		
		JavaProgrammer java = new JavaProgrammer();
		java.knowsAdvanceJava = true;
		java.bonus = 900;
		java.coding();
		java.prgrams();
		java.works();
		System.out.println(java);
	}

}
