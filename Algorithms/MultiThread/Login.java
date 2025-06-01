package com.MultiThread;

import java.util.Scanner;

public class Login implements Runnable {
	//get the name of current thread
public void run() {
	String name=Thread.currentThread().getName();
	if(name.equals("login")) {
		login();
	}else if(name.equals("print")) {
		print();
	}else {
		multiply();
	}
}
public void login() {
	Scanner sc = new Scanner(System.in);
	System.out.println("login to website activity started");
	System.out.println("Enter un and pwd");
	String un = sc.next();
	String pwd = sc.next();
	System.out.println("welcome.. you are logged in");
	System.out.println("Login to wiebsite activity ended");
	
}
public void print() {
	try {
		System.out.println("Printing activity");
		for(int i=1;i<=5;i++) {
			System.out.println("kodnest");
			Thread.sleep(5000);
		}
		System.out.println("printing activity ended");
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	public void multiply() {
		try {
			System.out.println("Multiplication actiivity started");
			int a = 100;
			int b=2;
			Thread.sleep(5000);
			int c = a*b;
			System.out.println("multiplication activity ended");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

