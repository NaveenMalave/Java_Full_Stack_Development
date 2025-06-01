package com.agregation;

public class Mobile {
	String brand = "Samsung";
	String color ="white ";
	int cost = 120000;
	OS os = new OS();
	Charger ch;
	void acceptCharger(Charger ch) {
		System.out.println("The charger is charging");
	}

}
