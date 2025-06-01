package com.MultiThread;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("LOGIN TO WEBSITE STARTED");
		System.out.println("Enter us and pwd");
		String us = sc.next();
		String pwd = sc.next();
		System.out.println("WELCOME YOU ARE LOGGED IN");
		System.out.println("LOGIN TO WEBSITE ENDED");
		
		System.out.println("PRINTING ACTIVITYE STARTED");
		for(int i=1;i<=5;i++) {
			System.out.println("KODNEST");
			Thread.sleep(5000);
		}
		System.out.println("PRINTING ACTIVITYE ENDED");
		
		System.out.println("MULTIPLICATION ID STARTED");
		 int a=100;
		 int b=2;
		 int c=a*b;
		 Thread.sleep(5000);
		 System.out.println(c);
		System.out.println("MULTIPLICATION ID ENDED");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
