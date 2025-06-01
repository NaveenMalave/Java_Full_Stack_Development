package com.array2;
import java.util.*;
public class PricipalDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of square matrix");
		int n = sc.nextInt();
		int[][] arr= new int[n][n];
		int sum=0;
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			for(int j =0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the square matrix is");
		for(int i=0;i<n;i++) {
			for(int j =0;j<n;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(i==j) {
					sum=sum+arr[i][j];
				System.out.println(arr[i][j]+" ");
				}
			}
			
		}
		System.out.println("sum of principal diagonal elements "+sum);

	}

}
