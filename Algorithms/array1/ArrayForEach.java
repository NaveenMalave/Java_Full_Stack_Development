package com.array1;
import java.util.*;
public class ArrayForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of arry");
		String a[] = new String[sc.nextInt()];
		System.out.println("enter the name");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.next();
		}
		
		System.out.println("names are");
		for(String ss :a) {
			System.out.println(ss);
		}
	}

}
