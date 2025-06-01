package com.ExceptionHandling;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main connection Established");
		Bank bank = new Bank();
		bank.initiate();
		System.out.println("Main connection Terminated");

	}

}
