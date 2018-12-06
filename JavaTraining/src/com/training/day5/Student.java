package com.training.day5;

public class Student {
	private int id;
	private String name;
	private int age;

	Student(int age) {
		this.age = age;
	}

	Student(int id, String name, int age) {
		this(age);
		this.id = id;
		this.name = name;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public void print() {
		System.out.println(this.toString());//this.toString() Implicitely
	}
	
	public void printStudent(Student student) {
		System.out.println("Student [id=" + student.id + ", name=" + student.name + ", age=" + student.age + "]");
	}
	
	public void printObj() {
		printStudent(this);
	}
	
}
