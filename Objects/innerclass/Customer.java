package com.innerclass;

public class Customer {
	String name;
	int age;
	//member inner class
	class Address{
		String streetName;
		int no;
		int pincode;
		String landMark;
		public Address(String streetName, int no, int pincode, String landMark) {
			super();
			this.streetName = streetName;
			this.no = no;
			this.pincode = pincode;
			this.landMark = landMark;
		}
	}
	Address addr;
	//static Inner class
	static class DateOfBirth{
		int day;
		int month;
		int year;
		public DateOfBirth(int day, int month, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}	
	}
	DateOfBirth dob;
	void order() {
		System.out.println(name + "ordering a product");
		//Local Inner class
		class Product{
			String name;
			int price;
			public Product(String name, int price) {
				super();
				this.name = name;
				this.price = price;
			}
			
		}
		Product p = new Product("Red Tape shoe",2500);
		System.out.println(p.name +"with"+p.price);
	}

}
