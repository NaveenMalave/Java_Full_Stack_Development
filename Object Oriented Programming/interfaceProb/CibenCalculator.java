package com.interfaceProb;

import java.util.*;
public class CibenCalculator implements Calculator{
Scanner sc = new Scanner(System.in);
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("enter a and b values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==0 || b == 0) {
			System.out.println("for this really do you need calculator");
		}else {
			int c = a+b;
			System.out.println("addition is " + c);
		}
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("enter a and b values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==0 || b == 0) {
			System.out.println("for this really do you need calculator");
		}else {
			int c = a-b;
			System.out.println("subtraction is " + c);
		}
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("enter a and b values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==0 || b == 0) {
			System.out.println("for this really do you need calculator");
		}else {
			int c = a*b;
			System.out.println("multiplication is " + c);
		}
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("enter a and b values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if( b == 0) {
			System.out.println("for this really do you need calculator");
		}else {
			int c = a/b;
			System.out.println("addition is " + c);
		}
		
	}

}
