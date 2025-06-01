package com.MultiThread;

public class BathroomApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
 Bathroom bt = new Bathroom();
 Thread t1 = new Thread(bt);
 Thread t2 = new Thread(bt);
 Thread t3 = new Thread(bt);
 
 t1.setName("boy");
 t2.setName("girl");
 t3.setName("other");
 
 t1.start();
 t2.start();
 t3.start();
	}catch (Exception e){
		e.printStackTrace();
	}
	}

}
