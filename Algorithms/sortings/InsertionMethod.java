package com.sortings;
import java.util.*;
public class InsertionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int[] arr= new int[sc.nextInt()];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the array elements are: ");
		for(int a:arr) {
			System.out.println(a+" ");
		}
		System.out.println("the array after insertion sort");
		InsertionMethodLogic  in = new InsertionMethodLogic();
		in.insertion(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}
	

}
