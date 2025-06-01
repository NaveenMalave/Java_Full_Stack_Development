package com.ExceptionHandling;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Connection Established");
   try {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter 2 numbers for division");
	   int num = sc.nextInt();
	   int dem = sc.nextInt();
	   int q = num/dem;
	   System.out.println("DIVISION RESULT- QUOTIENT IS "+q);
   }catch(Exception e){
	   System.out.println("Arithimetion exceptuon by zero");
   }
   System.out.println("connection terminated");
	}

}
