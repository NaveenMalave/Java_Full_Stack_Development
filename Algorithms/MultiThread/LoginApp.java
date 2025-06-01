package com.MultiThread;

public class LoginApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Main activity started");
			Login job = new Login();
			 
			Thread t1 = new Thread(job);
			Thread t2 = new Thread(job);
			Thread t3 = new Thread(job);
			
			t1.setName("login");
			t2.setName("print");
			t3.setName("multiply");
			
			t1.start();
			t2.start();
			t3.start();
			
			t1.join();
			t2.join();
			t3.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Activity Ended");

	}

}
