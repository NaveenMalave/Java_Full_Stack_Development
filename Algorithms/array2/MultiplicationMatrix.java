package com.array2;

import java.util.Scanner;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a = {{1,2,3},
	               	{4,5,6},{3,4,5}};
		int[][] b = {{1,4,2},
               	{2,5,7},{3,2,4}};
		int row1 = 3;
		int col1=3;
		int row2=3;
		int col2=3;
		int[][] sum = new int[row1][col2];
		
		System.out.println("the array 1 is");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("the array 2 is");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
			System.out.print(b[i][j]+" ");	
			}
			System.out.println();
		}
		if (col1 != row2) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }
		
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				for(int k=0;k<row2;k++) {
				sum[i][j]+=a[i][k]*b[k][j];
			}
			}
		}
System.out.println("the multiplication of matrix:");
for(int i=0;i<sum.length;i++) {
	for(int j=0;j<sum[i].length;j++) {
		System.out.print(sum[i][j]+" ");
	}
	System.out.println();
}

	}

}
