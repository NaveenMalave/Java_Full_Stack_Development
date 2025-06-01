package com.algorithms1;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter the array elements");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the elements you want to search");
		int key = sc.nextInt();
		Arrays.sort(arr);
		int res = BinarySearch(arr,key);
		if(res==-1) {
		System.out.println(key+"not found");
		}else {
			System.out.println(key+ " found at index "+res);
		}

	}
	static int BinarySearch(int[] arr,int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = low+high/2;
			if(key==arr[mid]) {
				return mid;
			}else if(key>arr[mid]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}

}
