package com.MultiThread;

public class MsWordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MsWord ms = new MsWord();
		Thread t1 = new Thread(ms);
		Thread t2 = new Thread(ms);
		Thread t3 = new Thread(ms);
		t1.setName("type");
		t2.setName("spell");
		t3.setName("auto");
		t2.setDaemon(true);
		t3.setDaemon(true);
		t2.setPriority(9);
		t3.setPriority(7);
		t1.start();
		t2.start();
		t3.start();

	}

}
