package com.varInterface;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		sbi.deposit();
		sbi.withdraw();
		sbi.demonstration1();
		RBI.demonstration2();
		System.out.println(RBI.a);
	}

}
