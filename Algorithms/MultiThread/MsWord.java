package com.MultiThread;

public class MsWord implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		if(name.equals("type")) {
			type();
		}else if(name.equals("spell")) {
			spell();
		}else {
			auto();
		}
		
	}
	
	public void type() {
		try {
			for( int i=0;i<=5;i++) {
		System.out.println("TYPEING....");
		Thread.sleep(5000);
			}
	}catch (Exception e) {
		e.printStackTrace();
	}	
	}
	public void spell() {
		try {
			for(;;) {
			System.out.println("SEPELLING.....");
			Thread.sleep(5000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void auto() {
		try {
			for(;;) {
			System.out.println("AUTOSAVING....");
			Thread.sleep(5000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
