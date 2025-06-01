package com.MultiThread;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("KodNest");
		t.setPriority(3);
		System.out.println(t);
	}

}
