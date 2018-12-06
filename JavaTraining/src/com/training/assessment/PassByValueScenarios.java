package com.training.assessment;

import java.util.ArrayList;
import java.util.Iterator;

import com.training.day4.Student;

public class PassByValueScenarios {

	public static void changeLastElem(int[] a) {
		a = null;
	}

	public static void replaceFirst(int[] a) {
		a[0] = a[a.length - 1];
	}

	public static void printElements(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void test(String stra) {
		stra = "Apple";
	}

	public static void add(int i) {
		i++;
		System.out.println("Inside the method " + i);
	}

	public static void changeArrayList(ArrayList<String> arrayListp) {
		// arrayList = null;
		arrayListp.add("Sara");
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		// arrayListp = list;
		arrayListp.addAll(list);
		for (Iterator<String> iterator = arrayListp.iterator(); iterator
				.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string + "\t");
		}

	}

	public static void changeStudent(Student studentp) {
		studentp = new Student();
		studentp.setName("Pawan");
		studentp.setRollNumber(11);
	}

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5 };
		PassByValueScenarios.changeLastElem(x);
		PassByValueScenarios.printElements(x);
		PassByValueScenarios.replaceFirst(x);
		PassByValueScenarios.printElements(x);
		String str = "Priya";
		PassByValueScenarios.test(str);
		System.out.println(str);
		int i = 8;
		PassByValueScenarios.add(i);
		System.out.println(i);
		ArrayList<String> strList = new ArrayList<>();

		strList.add("Priyanka");
		strList.add("Aguchi");
		strList.add("Ojee");
		changeArrayList(strList);
		for (Iterator<String> iterator = strList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		Student st1 = new Student();
		st1.setName("Sriram");
		st1.setRollNumber(11);
		changeStudent(st1);
		System.out.println(st1);

	}
}
