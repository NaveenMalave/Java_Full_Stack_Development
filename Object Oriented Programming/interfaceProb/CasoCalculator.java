package com.interfaceProb;

import java.util.*;
public class CasoCalculator implements Calculator{
Scanner sc  = new Scanner(System.in);
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("enter a and b values");
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c = a +b;
		System.out.println("Addition result " + c);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("enter a and b values");
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c = a - b;
		System.out.println("Substraction result " + c);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("enter a and b values");
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		System.out.println("Multiplication result " + c);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("enter a and b values");
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c = a / b;
		System.out.println("divison result " + c);
	}

}
