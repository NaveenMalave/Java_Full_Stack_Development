package com.array1;

import java.util.*;
public class ArrayScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	int[] arr = new int[5];
	System.out.println("length of array"+arr.length);
	for(int i = 0 ;i<=arr.length-1;i++) {//length -->data member or field
	 System.out.println("enter the Age of student  "+ i);
	 arr[i]=sc.nextInt();
	}
	for(int i = 0 ;i<=arr.length-1 ;i++) {
     System.out.println("student age of  "+i+"is "+arr[i]);
	}
	}

}
