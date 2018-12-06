package com.training.day3;

public class BasicOopsConcept {
	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "John Smith", 32, "Testing");
		Employee emp2 = new Employee(1, "Agstya", 32, "HR");
		
		
		
		System.out.println("Prints ---> " + emp1.toString());
		
		
		System.out.println("******************BiCycles**************");
		BiCycle biCycle1 = new BiCycle();
		biCycle1.rides();
		biCycle1.makesSound();
		biCycle1.setNo_of_seaters(2);
		System.out.println("Seaters " + biCycle1.getNo_of_seaters());

		System.out.println("******************TriCycles**************");
		BiCycle biCycle2 = new BiCycle();
		biCycle2.rides();
		biCycle2.makesSound();
		biCycle2.setNo_of_seaters(3);
		System.out.println("Seaters " + biCycle2.getNo_of_seaters());

		System.out.println("\n*****************Motors*******************");
		Motor motor1 = new Motor();
		motor1.rides();
		motor1.makesSound();
		motor1.setNo_of_tyres(4);
		System.out.println("Tyres of motors " + motor1.getNo_of_tyres());
//blocks
		{
			System.out
					.println("\n*****************OverLoading Sample*******************");
			OverLoadingAddition addition = new OverLoadingAddition();
			addition.add(3, 5);
			addition.add(3.6f, 5.8f);
			addition.add("Agastya", " Katukam");
			// One task (addition) in three different ways
		}

	}
}
