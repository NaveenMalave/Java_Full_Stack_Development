package com.array2;
import java.util.*;
public class AbsOfSdePde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of matrix");
		int n = sc.nextInt();
		int[][] arr= new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the array is ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("the differenc of PDE and SDE ");
		int p = 0;
		int s = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					p+=arr[i][j];
				}
				if((i+j)==(arr.length-1)) {
					s+=arr[i][j];
				}
			}
		}
		System.out.println("the sum of principal diagonal element " +p);
		System.out.println("the sum of secondary diagonal elements "+s);
		int abs = s-p;
		System.out.println("the absolute diff of  SDE and PDE is "+Math.abs(abs));
	}

}
