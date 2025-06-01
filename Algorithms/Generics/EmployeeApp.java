package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ll = new ArrayList<>();
		ll.add(new Employee("Rama",1,23,34000));
		ll.add(new Employee("rajaesh",2,24,5600));
		ll.add(new Employee("Ramu",3,23,57000));
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		

	}

}
