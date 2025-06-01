package com.MultiThread;

import java.util.Scanner;

public class Activity extends Thread {

		// TODO Auto-generated method stub
	@Override
	public void run() {
	// TODO Auto-generated method stub
	String name = Thread.currentThread().getName();
	if(name.equals("login")) {
		login();
	}else if(name.equals("print")){
		print();	
	}else {
		mul();
	}
	}
		public void login(){
			Scanner sc = new Scanner(System.in);
			System.out.println(" LOGIN TO WEBSITE STARTED");
			System.out.println("ENTER US AND PWD");
			String us = sc.next();
			String pwd = sc.next();
			System.out.println("WELCOME YOU ARE LOGGED IN");
			System.out.println("LOGIN TO WIBSITE ENDED");
		
	}
		public  void print() {
			try {
			System.out.println("PRINTING ACTIVITES STARTD");
			for(int i=1;i<=5;i++) {
				System.out.println("KODNEST");
				Thread.sleep(5000);
			}
			System.out.println("PRINTING ACTIVITED ENDED");
		}catch(Exception e) {
			e.printStackTrace();
		}
}
		public void mul() {
			try {
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

