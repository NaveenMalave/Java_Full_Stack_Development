package com.EmplyeeDatatype;
import java.util.*;
public class EmployeeDemo2user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		Employee arr[] = new Employee[n];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the emplyee "+ i+ " detals");
			arr[i]=new Employee();
			arr[i].name=sc.next();
			arr[i].sns=sc.nextInt();
			arr[i].gender=sc.next();
			arr[i].salary=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
		    System.out.println(arr[i].name+" "+arr[i].sns+" "+arr[i].gender+" "+arr[i].salary);
		    }
		     

	}

}
