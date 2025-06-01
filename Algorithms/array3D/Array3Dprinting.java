package com.array3D;
import java.util.*;
public class Array3Dprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of arrays");
int d= sc.nextInt();
int r =sc.nextInt();
int c=sc.nextInt();
 int[][][] arr= new int[d][r][c];
 System.out.println("enter the elaments");
 for(int i=0;i<d;i++) {
	 for(int j=0;j<r;j++) {
		 for(int k=0;k<c;k++) {
			 arr[i][j][k]=sc.nextInt();
		 }
	 }
 }
 System.out.println("the 3d array is");
 for(int i=0;i<d;i++) {
	 for(int j=0;j<r;j++) {
		 for(int k=0;k<c;k++) {
			 System.out.print(arr[i][j][k]+" ");
		 }
		 System.out.println();
	 }
	 System.out.println();
 }

	}

}
