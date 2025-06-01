package com.array2;
import java.util.*;

public class Jagged2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1D length");
		int[][] arr = new int[sc.nextInt()][];
		System.out.println("enter 2D length for each 1D");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter 2D length of 1D "+i);
			arr[i]= new int[sc.nextInt()];
		}
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.println("enter the age of class"+i+"of "+j+"Student");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the age of students are in each calass");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
