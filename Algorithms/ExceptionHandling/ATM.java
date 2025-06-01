package com.ExceptionHandling;

import java.util.Scanner;

public class ATM {
	void authenticate() {
		try {
		System.out.println("Connection to database is esatablished");
		System.out.println("Enter 2 digits that is userID and Pwd division.");
		Scanner sc = new Scanner(System.in);
		int userID = sc.nextInt();
		int pwd = sc.nextInt();
		int res =userID/pwd;
		System.out.println("Authenticate division result."+res);
		}catch(Exception e) {
			System.out.println("exception generated at atm");
		}
	}
}
