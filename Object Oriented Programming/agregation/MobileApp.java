package com.agregation;

public class MobileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile samsung = new Mobile();
		System.out.println(samsung.brand);
		System.out.println(samsung.color);
		System.out.println(samsung.cost);
		System.out.println(samsung.os.name);
		System.out.println(samsung.os.type);
		
		Charger charger = new Charger();
		charger.brand =  "Samsung";
		charger.color = "white";
		
		samsung.acceptCharger(charger);
		
		samsung = null;
		System.out.println("MOBILE LOST AND GONE");
		
		System.out.println(charger.brand);
		System.out.println(charger.color);
	

	}

}
