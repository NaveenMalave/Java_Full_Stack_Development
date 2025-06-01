package com.array2;
import java.util.*;
public class SecondPrincipalDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of matrix");
		int n = sc.nextInt();
		int[][] arr= new int[n][n];
		int sum =0;
		System.out.println("enter the array values ");
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
 System.out.println("the original string;");
 for(int i=0;i<arr.length;i++) {
	 for(int j =0;j<arr[i].length;j++) {
		 System.out.print(arr[i][j]+" ");
	 }
	 System.out.println();
 }
 System.out.println("the secondary  diagonal elements");
 for(int i =0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if((i+j)==(arr.length-1)) {
			sum+=arr[i][j];
			System.out.println(arr[i][j]);
			}
		}
	}
 System.out.println("the sum of secondary diagonal elements "+sum);
	}

}
