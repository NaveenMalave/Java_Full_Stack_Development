package com.ExceptionHandling;

public class Bank {
	 void initiate(){
		System.out.println("Connection to Bank Established");
		ATM atm = new ATM();
		atm.authenticate();
		System.out.println("COnnection to bank terminated");
	}

}
