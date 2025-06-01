package com.array1;

import java.util.Scanner;

public class SortArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter the array elements");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("elements before sorting");
		for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("after sorting the array");
		int[] a = sortingArray(arr);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}

	}
	static int[] sortingArray(int[] arr) {
		int temp=0;
		for(int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
