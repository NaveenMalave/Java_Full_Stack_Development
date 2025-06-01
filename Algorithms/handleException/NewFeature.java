package com.handleException;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NewFeature {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =a/b;
		System.out.println(c);
		System.out.println("Enter array size");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the element and the position");
		int ele = sc.nextInt();
		int pos = sc.nextInt();
		arr[pos]=ele;
		System.out.println("Element is "+arr[pos]);
		}catch (ArithmeticException|ArrayIndexOutOfBoundsException  | NegativeArraySizeException | InputMismatchException |NullPointerException e) {
			System.out.println("EXCEPTION HANDLED BY THE NEW FEATURED CATCH");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
