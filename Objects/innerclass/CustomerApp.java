package com.innerclass;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.name = "asin";
		customer.age = 23;
		System.out.println(customer.name);
		System.out.println(customer.age);
	     Customer.Address addr = customer.new Address("btm",2,50013,"relaince");
		System.out.println(addr.streetName);
		System.out.println(addr.no);
		System.out.println(addr.pincode);
		System.out.println(addr.pincode);
		 
		
		Customer.DateOfBirth d = new Customer.DateOfBirth(21,8,2024);
		System.out.println(d.day);
		System.out.println(d.month);
		System.out.println(d.year);
	}

}
