package com.array3D;
import java.util.*;
public class Array3Djageduserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of 3d array");
		int[][][] arr = new int[sc.nextInt()][][];
		System.out.println("enter the size of 2d array");
		for(int i =0;i<arr.length;i++) {
			arr[i]=new int[sc.nextInt()][];
		}
		System.out.println("enter size of each column in 2d array");
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			arr[i][j]= new int[sc.nextInt()];
		}
		}
		for(int i =0;i<arr.length;i++) {
			for(int  j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
