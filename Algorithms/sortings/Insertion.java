package com.sortings;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {86,42,23,18,25};
		for(int i=1;i<=arr.length-1;i++) {
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		System.out.println("the sorted array by insertion sort is ");
		for(int s:arr) {
			System.out.print(s+" ");
		}

	}

}
