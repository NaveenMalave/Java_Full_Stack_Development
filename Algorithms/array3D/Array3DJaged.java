package com.array3D;
import java.util.*;
public class Array3DJaged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][][] arr = new int[2][][];
		
			arr[0]=new int[2][];
			arr[1]=new int[3][];
			
			arr[0][0]=new int[5];
			arr[0][1]=new int[3];
			
			arr[1][0]=new int[2];
			arr[1][1]=new int[4];
			arr[1][2]=new int[5];
		System.out.println("enter the array elements");
		for(int i= 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k =0;k<arr[i][j].length;k++) {
					arr[i][j][k]=sc.nextInt();
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("the array elements are");
		for(int i= 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k =0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
