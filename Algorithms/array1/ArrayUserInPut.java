package com.array1;
import java.util.*;

public class ArrayUserInPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the array values.");
		for(int i = 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements are:");
		for(int i :arr) {
			System.out.println(i);
		}

	}

}
