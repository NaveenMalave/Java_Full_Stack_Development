package com.weakhashmap;

public class Student {
	int usn;
	String name;
	int age;
	public Student(int usn, String name, int age) {
		super();
		this.usn = usn;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", age=" + age + "]";
	}
	

}
