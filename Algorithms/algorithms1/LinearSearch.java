package com.algorithms1;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the key to search");
		int key = sc.nextInt();
		int res= lineSearch(arr,key);
		if(res<0) {
		System.out.println("key not found"+res);
		}else {
			System.out.println("key found at index "+res);
		}

	}
	static int lineSearch(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
