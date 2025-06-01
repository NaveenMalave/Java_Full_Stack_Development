package com.array2;

import java.util.*;
public class companiDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[6][5];
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter employee of the "+i+" company "+ j+" person");
			arr[i][j]=sc.next();
		}
		}
		System.out.println("The employees in each company are:");
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
