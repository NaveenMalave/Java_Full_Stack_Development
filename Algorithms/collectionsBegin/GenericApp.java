package com.collectionsBegin;

public class GenericApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoBoot<String> d = new DemoBoot<String>();
		d.setItem("Karna");
		d.display();
		
		DemoBoot<Integer> dl = new DemoBoot<Integer>();
		dl.setItem(23);
		dl.display();
		
		DemoBoot<Employee> e = new DemoBoot <Employee>();
		e.setItem(new Employee("krishna",35));
		e.display();

	}

}
