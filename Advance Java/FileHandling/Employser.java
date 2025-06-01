package com.FileHandling;
import java.io.Serializable;
public class Employser implements Serializable {
	private transient int age;
	private String name;
	public Employser(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employser [age=" + age + ", name=" + name + "]";
	}

}
