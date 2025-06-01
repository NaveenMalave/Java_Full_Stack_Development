package com.sortings;
import java.util.*;
public class paypalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array size");
		Array arr = new Array(scan.nextInt());
		
		
		System.out.println("enter "+arr.length()+" Elements");
		for(int i=0;i<=arr.length()-1;i++) {
			arr.insert(i, scan.nextInt());
		}
		arr.display();
		System.out.println();
		/*
		System.out.println("enter index to delete from o to "+(arr.length()-1));
		arr.delete(scan.nextInt());*/
		arr.Sort();
		arr.display();
		System.out.println("enter a element to search");
		int key = scan.nextInt();
		int index = arr.binarySearch(key);
		if(index>=0) {
			System.out.println("element "+key+" found at index "+index);
		}else {
			System.out.println("element "+key+" is not found at index4");
		}
		
	}

}
