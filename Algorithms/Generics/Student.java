package Generics;

import java.util.Objects;
import java.util.Comparable;

public  class Student implements Comparable {
	String name;
	int age;
	float height;
	int marks;
	public Student(String name, int age, float height, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", height=" + height + ", marks=" + marks ;
	}
	public int compareTo(Object o) {
		Student s = (Student)o;
		if(this.name.compareTo(s.name)> 0) {
			return 1;
		}else {
			return -1;
		}
	}
	

}
