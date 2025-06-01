package com.handleException;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("This is DEMO App main");
			Demo2 d2 = new Demo2();
			d2.display2();
		}catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
