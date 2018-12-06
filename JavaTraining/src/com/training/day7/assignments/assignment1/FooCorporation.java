package com.training.day7.assignments.assignment1;

public class FooCorporation {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Sriram");
		employee1.setWeeklyHoursWorked(35);
		
		Corporation corp1 = new Corporation();
		corp1.setName("TCS");
		corp1.setBasePay(7.50);
		
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Agassi");
		employee2.setWeeklyHoursWorked(47);
		
		Corporation corp2 = new Corporation();
		corp2.setBasePay(8.20);
		corp2.setName("IBM");
		
		
		Employee employee3 = new Employee();
		employee3.setId(1);
		employee3.setName("Ojee");
		employee3.setWeeklyHoursWorked(73);
		
		Corporation corp3 = new Corporation();
		corp3.setBasePay(10.00);
		corp3.setName("Cysco");
		FooCorporation foo = new FooCorporation();
		foo.calculateSalary(employee1, corp1);
		System.out.println(employee1.getName() + "\t " + employee1.getSalary());
		foo.calculateSalary(employee2, corp2);
		System.out.println(employee2.getName() + "\t " + employee2.getSalary());
		foo.calculateSalary(employee3, corp3);
		System.out.println(employee3.getName() + "\t " + employee3.getSalary());
		
	}

	public void calculateSalary(Employee employee, Corporation corporation) {
		// #Rules :-
		// Employee gets paid Hours * Base Pay
		System.out.println("*************************************************************************************");
		int hours = employee.getWeeklyHoursWorked();
		double basePay = corporation.getBasePay();
		double salary;
		if (basePay < 8) {
			System.out.println("The base pay cannot be less than 8:00$ ");
		//	return;
		} else if (hours > 60) {
			System.out.println("The hours cannot be more than 60");
		//	return;
		} else {
			if (hours <= 40) {
				salary = hours * basePay;
			} else { // For every hour over 40 Hours, they get overTime =
						// basePay * 1.5
				int overTimeHrs = hours - 40;
				salary = 40 * basePay;
				double overTime = overTimeHrs * basePay * 1.5;
				salary = salary + overTime;
			}
			employee.setSalary(salary);
		}
		System.out.println("Salary Calculation for " + corporation + " " + employee);
		
	}

}
