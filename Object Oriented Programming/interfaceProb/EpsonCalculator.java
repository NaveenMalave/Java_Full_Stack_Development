package com.interfaceProb;

public class EpsonCalculator implements Calculator {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		int c =  a+b;
		System.out.println("Addition result is "+c);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		int c =  a-b;
		System.out.println("Subtraction result is "+c);
		
	}

	@Override
	public void mul() {
		int a = 10;
		int b = 5;
		int c =  a*b;
		System.out.println("multiplication result is "+c);
		
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		int c =  a/b;
		System.out.println("divison result is "+c);
		
	}
	

}
