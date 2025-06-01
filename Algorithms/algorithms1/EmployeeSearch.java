package com.algorithms1;
import java.util.*;
public class EmployeeSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter employees size");
		Employee emparr[] = new Employee[scan.nextInt()];
		for(int i=0;i<emparr.length;i++) {
			System.out.println("enter employee "+i+" name and age ");
			String name = scan.next();
			int age = scan.nextInt();
			emparr[i]=new Employee(name,age);
		}
   System.out.println("enter a name to search");
   String key = scan.next();
   EmpMethod em = new EmpMethod();
   int res = em.empSearch(emparr,key);
   if(res<0) {
   System.out.println("name not found " + res);
	}else {
		System.out.println("name found at index  "+res);
	}
	}
}
