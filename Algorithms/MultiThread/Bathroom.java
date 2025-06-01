package com.MultiThread;

public class Bathroom implements Runnable{
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		try {
			String name =Thread.currentThread().getName();
			System.out.println(name +" IS ENTERING BATHEROOM");
			Thread.sleep(5000);
			System.out.println(name+" IS USING BATHROOM");
			Thread.sleep(5000);
			System.out.println(name+" IS EXITIIG BATHROOM");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
