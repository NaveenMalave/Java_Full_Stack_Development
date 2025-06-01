package com.MultiThread;

public class ActivityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity a1 = new Activity();
		Activity a2 = new Activity();
		Activity a3 = new Activity();
		
		a1.setName("login");
		a2.setName("print");
		a3.setName("mul");
		
		a1.start();
		a2.start();
		a3.start();

	}

}
