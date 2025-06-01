package com.synchronizedThread;

public class KurukshethraApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worrior worrior = new Worrior();
		
		Thread t1 = new Thread(worrior);
		Thread t2 = new Thread(worrior);
		t1.setName("Arjuna");
		t2.setName("Karna");
		t1.start();
		t2.start();

	}

}
