package com.ExceptionHandling;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection established");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers");
			int num = sc.nextInt();
			int dem = sc.nextInt();
			int q = num/dem;
			System.out.println("Division result"+q);
			System.out.println("Enter array length");
			int[] arr = new int[sc.nextInt()];
			System.out.println("Element and the position to insert elements into array");
			int ele = sc.nextInt();
			int pos = sc.nextInt();
			arr[pos]=ele;
			System.out.println("Element at position"+pos+"is"+arr[pos]);
		}catch (ArithmeticException e) {
			System.out.println("Arithematic exception / by Zero");
		}catch(NegativeArraySizeException e) {
			System.out.println("Negative array size exception"+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index out of Bound exception");
		}
		catch(Exception e) {
			System.out.println("Some Iddue occur during typing");
		}
		System.out.println("COnnection terminated");

	}

}
