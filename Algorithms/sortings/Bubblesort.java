package com.sortings;
import java.util.*;
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter array size");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array emlemnts");
		for(int i =0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("before sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int a[] = bubbleSort(arr);
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	static int[] bubbleSort(int[] arr) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j = 0;j<=arr.length-2-i;j++) {
				int temp=0;
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

}
