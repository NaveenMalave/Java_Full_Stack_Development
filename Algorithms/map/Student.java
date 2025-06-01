package com.map;

public class Student {
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", age=" + age + ", gender=" + gender + ", marks=" + marks
				+ ", sem=" + sem + ", email=" + email + "]";
	}
	int usn;
	String name;
	int age;
	String gender;
	int marks;
	int sem;
	String email;
	
	public Student(int usn, String name, int age, String gender, int marks, int sem, String email) {
		super();
		this.usn = usn;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
		this.sem = sem;
		this.email = email;
	}
	void eat() {
		System.out.println("stuent is eating");
	}
	void sleep() {
		System.out.println("student is sleeping");
	}
   void study() {
	   System.out.println("Student will study");
   }
}
