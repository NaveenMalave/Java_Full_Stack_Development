package com.FileHandling;

import java.util.Scanner;

public class Error {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number ");
   int a = sc.nextInt();
   
   System.err.println("Warning check--->"+a);
	}

}
