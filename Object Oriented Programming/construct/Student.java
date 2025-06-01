package com.construct;

public class Student {
	String name;
	int age;
	String gender;
	int marks;
	int sem;
	String address;
	
	void eat() {
		System.out.println("student is eating..");
	}
	void sleep() {
		System.out.println("student is sleeping...");
	}
	void study() {
		System.out.println("student is studying..");
	}
	public Student(String name, int age, String gender, int marks, int sem, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
		this.sem = sem;
		this.address = address;
	}
public Student() {
	
}
public Student(String name) {
	this.name=name;
}
}
