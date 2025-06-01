package com.array2;
import java.util.*;
public class AdditionOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a = {{1,2,3},
	               	{4,5,6},{3,4,5}};
		int[][] b = {{1,4,2},
               	{2,5,7},{3,2,4}};
		int[][] sum = new int[a.length][a.length];
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
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
System.out.println("the sum of matrix:");
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		System.out.print(sum[i][j]+" ");
	}
	System.out.println();
}
	}

}
