package com.collectionsBegin;

public class Employee {
	String name;
	int age;
	
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age ;
	}
	

}
