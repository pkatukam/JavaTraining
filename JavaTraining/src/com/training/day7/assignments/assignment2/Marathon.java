package com.training.day7.assignments.assignment2;

public class Marathon {
	public static void main(String[] arguments) {

		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
				"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
				"Daniel", "Neda", "Aaron", "Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
				393, 299, 343, 317, 265 };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}
		int index = fastest(names, times);
		System.out.println("\nThe Fastest Player is - " + names[index]
				+ " with timimg " + times[index]);
		
		index = secondFastest(names, times);
		System.out.println("\nThe Second Fastest Player is - " + names[index]
				+ " with timimg " + times[index]);

	}

	public static int fastest(String[] names, int[] times) {
		int timing = Integer.MAX_VALUE;
		int index = Integer.MAX_VALUE;
		for (int i = 0; i < times.length; i++) {
			if (timing > times[i]) {
				timing = times[i];
				index = i;
			}
		}
		return index;
	}

	public static int secondFastest(String[] names, int[] times) {
		int fastestTimimgs = times[fastest(names, times)];
		int timing = Integer.MAX_VALUE;
		int index = Integer.MAX_VALUE;
		for (int i = 0; i < times.length; i++) {
			if (timing > times[i] && times[i] > fastestTimimgs) {
				timing = times[i];
				index = i;
			}
		}
		return index;
	}
}